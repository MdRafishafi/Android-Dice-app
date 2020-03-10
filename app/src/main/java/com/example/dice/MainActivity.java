package com.example.dice;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.ImageView;

        import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button roll= (Button) findViewById(R.id.button_roll);
        final ImageView left_image = (ImageView) findViewById(R.id.image_dice_left);
        final ImageView right_image =(ImageView) findViewById(R.id.image_die_right);
        final int[] diceArray = {R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6};

        roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int left_number = random.nextInt(6);
                int right_number = random.nextInt(6);
                left_image.setImageResource(diceArray[left_number]);
                right_image.setImageResource(diceArray[right_number]);
            }
        });

    }
}

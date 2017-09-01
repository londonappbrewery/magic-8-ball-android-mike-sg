package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button ask = (Button) findViewById(R.id.btnAsk);
        final ImageView ball = (ImageView) findViewById(R.id.imgBall);
        final int[] ballList = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        ask.setOnClickListener(new View.OnClickListener() {
            String module = "ask.onClick()";
            @Override
            public void onClick(View v) {
                int n = (new Random()).nextInt(5);

                Log.d(module, "n["+n+"]");

                ball.setImageResource(ballList[n]);

            }
        });

    }
}

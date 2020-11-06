package com.example.task31;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.Toast;

import java.security.PrivateKey;

public class MainActivity extends AppCompatActivity {
private static ImageView heart;
private int currentimage;
int[] images={R.drawable.love,R.drawable.heart};

RatingBar ratingBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ratingBar=findViewById(R.id.ratingBar);

        ratingBar.setNumStars(5);
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                   Toast.makeText(getBaseContext(), "Value :" + v,Toast.LENGTH_LONG).show();
            }
        });

        image();

    }
        public void image()
    {
            heart=findViewById(R.id.imagelove);
            heart.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    currentimage++;
                    currentimage=currentimage%images.length;
                    heart.setImageResource(images[currentimage]);
                }
            });
        }

}
package com.example.task31;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.WindowDecorActionBar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;

import java.util.Timer;
import java.util.TimerTask;

public class splashscreen extends AppCompatActivity {
long delay=4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splashscreen);
        Timer r=new Timer();
        TimerTask showsplash=new TimerTask() {
            @Override
            public void run() {
                Intent i=new Intent(splashscreen.this,MainActivity.class);
                startActivity(i);
            }
        };
        r.schedule(showsplash,delay);
    }
}
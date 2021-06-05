package com.atandroidlabs.garepairadmin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getSupportActionBar().hide();

        CountDownTimer timer = new CountDownTimer(1500, 100) {
            @Override
            public void onTick(long l) {
                //Nothing
            }

            @Override
            public void onFinish() {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        };

        timer.start();
    }
}
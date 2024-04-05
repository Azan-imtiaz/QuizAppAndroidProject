package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
  getSupportActionBar().hide();

        Thread n = new Thread() {
            @Override
            public void run() {
               try{
                   sleep(4000);
               }
               catch(Exception e){
  e.printStackTrace();
               }
               finally {
                   Intent n=new Intent(SplashActivity.this,MainActivity.class);
                   startActivity(n);
               }


                }

        };  n.start();



    }
}
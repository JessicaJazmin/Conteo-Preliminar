package com.example.jessica.conteopreliminar;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

public class splash extends AppCompatActivity {
    private final int DURACION_SPLASH = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        hide();
        new Handler().postDelayed(new Runnable() {
            public void run() {
                Intent splashIntent = new Intent(splash.this,login.class);
                startActivity(splashIntent);
                System.exit(0);
            }
        },DURACION_SPLASH);
    }


    private void hide(){
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null){
            actionBar.hide();
        }
    }
}





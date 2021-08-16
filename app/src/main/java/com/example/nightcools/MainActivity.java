package com.example.nightcools;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void playMusic(View v) {
        Intent goToSecond = new Intent();
        goToSecond.setClass(this, SecondActivity.class);
        startActivity(goToSecond);

    }

    public void sendSMS(View v) {
        Intent goToSMS = new Intent();
        goToSMS.setClass(this, MessageActivity.class);
        startActivity(goToSMS);
    }
}
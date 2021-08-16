package com.example.nightcools;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    MediaPlayer music;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        music = MediaPlayer.create(this, R.raw.music);
    }

    public void musicPlay (View v) {
        music.start();
    }

    public void pauseMusic (View v) {
        if (music.isPlaying())
        music.pause();
    }

    public void stopMusic (View v) {
        music.stop();
        music = MediaPlayer.create(this, R.raw.music);
    }
}
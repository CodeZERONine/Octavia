package com.hpes.octavia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MusicActivity extends AppCompatActivity {
Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
        i=new Intent(this,MusicService.class);
    }
    public void playbutton(View v)
    {
        startService(i);

    }
    public void pausebutton(View v)
    {
        stopService(i);
    }
}

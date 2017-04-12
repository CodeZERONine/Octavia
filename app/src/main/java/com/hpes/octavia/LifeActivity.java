package com.hpes.octavia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class LifeActivity extends AppCompatActivity {

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(LifeActivity.this,"onCreate()",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(LifeActivity.this,"onDestroy()",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(LifeActivity.this,"onPause()",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(LifeActivity.this,"onStart()",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(LifeActivity.this,"onResume()",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life);
        Toast.makeText(LifeActivity.this,"onCreate()",Toast.LENGTH_LONG).show();
    }
}

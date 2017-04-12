package com.hpes.octavia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class ImageResourceActivity extends AppCompatActivity {
ImageView imageview1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_resource);
        imageview1=(ImageView)findViewById(R.id.imageView1);
        imageview1.setImageResource(R.drawable.pic3);
    }
}

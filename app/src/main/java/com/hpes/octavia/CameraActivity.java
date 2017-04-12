package com.hpes.octavia;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class CameraActivity extends AppCompatActivity {
ImageButton ib1;
ImageView iv1;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {   super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
        ib1=(ImageButton)findViewById(R.id.imageButton1);
        iv1=(ImageView)findViewById(R.id.imageView1);
        ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            { Intent intent=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
              startActivityForResult(intent,0);
            }
        });//end of statement


    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {  super.onActivityResult(requestCode, resultCode, data);
        Bundle bundle=data.getExtras();
       Bitmap bit=(Bitmap)bundle.get("data");
        iv1.setImageBitmap(bit);

    }
}

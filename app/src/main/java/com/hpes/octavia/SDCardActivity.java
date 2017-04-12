package com.hpes.octavia;

import android.content.DialogInterface;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class SDCardActivity extends AppCompatActivity {
    EditText et1;
    EditText et2;
    Button bt1;
    Button bt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sdcard);
        et1 = (EditText) findViewById(R.id.editText1);
        et2 = (EditText) findViewById(R.id.editText2);
        bt1=(Button)findViewById(R.id.button1);
        bt2=(Button)findViewById(R.id.button2);
        bt1.setOnClickListener(new WriteSDCard());
        bt2.setOnClickListener(new ReadSDCard());
    }//end of Onclick()

    class WriteSDCard implements View.OnClickListener {
        public void onClick(View v) {
            File rootPath = Environment.getExternalStorageDirectory();
            File f = new File(rootPath, "ContactData.txt");
            if (!f.exists()) {
                try {
                    f.createNewFile();
                } catch (Exception e) {

                }
            }//end of if block
            try {
                String details = et1.getText().toString() + ":" + et2.getText().toString() + "\n";
                FileOutputStream fos = new FileOutputStream(f, true);
                fos.write(details.getBytes());

            } catch (Exception e) {
                e.printStackTrace();
            }


        }
    }

        class ReadSDCard implements View.OnClickListener {
            public void onClick(View v) {
                File rootPath = Environment.getExternalStorageDirectory();
                File f = new File(rootPath, "ContactData.txt");
                if(f.exists()==true)
                {
                    try
                    {
                        FileInputStream fis=new FileInputStream(f);
                        String fd="";
                        while(true)
                        {

                            int a=fis.read();
                             if(a==-1)
                             {
                                 break;
                             }
                            else
                             {
                                 fd=fd+(char)a;
                             }
                          //  Toast.makeText(SDCardActivity.this, fd, Toast.LENGTH_SHORT).show();
                        }
                       Toast.makeText(SDCardActivity.this, fd, Toast.LENGTH_SHORT).show();
                    }
                    catch(Exception e){

                }
                }
                else
                {
                    Toast.makeText(SDCardActivity.this, "NO FILE EXIST", Toast.LENGTH_SHORT).show();
                }
            }

        }
    }

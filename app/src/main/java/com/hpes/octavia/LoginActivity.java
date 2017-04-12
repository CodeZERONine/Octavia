package com.hpes.octavia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
EditText et1;
EditText et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        et1=(EditText)findViewById(R.id.editText3);
        et2=(EditText)findViewById(R.id.editText4);
    }
    public void check(View b){
        String user=et1.getText().toString();
        String password=et2.getText().toString();
        Intent i=new Intent(this,LoginResultActivity.class);
        //Intent Created
        i.putExtra("user",user);
        i.putExtra("pass",password);
        //value Sent
        startActivity(i);
    }
}

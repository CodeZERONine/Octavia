 package com.hpes.octavia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class LoginResultActivity extends AppCompatActivity {
TextView et4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_result);
        et4=(TextView)findViewById(R.id.textViewResult);
        Intent h=getIntent();
        String user=h.getStringExtra("user");
        String pass=h.getStringExtra("pass");
              et4.setText("UserName :"+user);
              et4.append("\nPassword :"+pass);
           if(user.equals(pass))
           {
               et4.append("\n\nAuthentication Success");
           }
           else
           {
               et4.append("\n\nAuthentication Failed");
           }


    }
}

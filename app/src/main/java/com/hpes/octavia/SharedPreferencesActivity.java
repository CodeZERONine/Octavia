package com.hpes.octavia;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class SharedPreferencesActivity extends AppCompatActivity {
    EditText et1;

    @Override
    protected void onResume() {
        super.onResume();
        SharedPreferences sp=getSharedPreferences("Demo",0);
        String msg=sp.getString("STATUS",null);
       et1.setText(msg);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preferences);
        et1=(EditText)findViewById(R.id.editText1);


    }

    @Override
    protected void onPause()
    {
        super.onPause();

        SharedPreferences sp=getSharedPreferences("Demo",0);
        SharedPreferences.Editor editor=sp.edit();
        editor.putString("STATUS",et1.getText().toString());
        editor.commit();
    }
}

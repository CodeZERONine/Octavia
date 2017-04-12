package com.hpes.octavia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CalculatorActivity extends AppCompatActivity {
EditText et;
EditText et2;
TextView tv5;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        et=(EditText)findViewById(R.id.editText);
        et2=(EditText)findViewById(R.id.editText2);
        tv5=(TextView)findViewById(R.id.textView5);
    }


    public void calc(View view)
    {
        int n1=Integer.valueOf(et.getText().toString());
        int n2=Integer.valueOf(et2.getText().toString());
        int sum1=n1+n2;
        tv5.setText(""+sum1);

    }
   /* public void calc(View view) {
        int n1 = Integer.valueOf(et.getText().toString());
        int n2 = Integer.valueOf(et2.getText().toString());
        int sum1=n1+n2;
        tv5.setText(""+sum1);
    }*/
}

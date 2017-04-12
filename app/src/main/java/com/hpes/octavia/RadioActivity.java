package com.hpes.octavia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;

public class RadioActivity extends AppCompatActivity {
RadioGroup radiogroup;
TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);
        radiogroup=(RadioGroup)findViewById(R.id.radioGroup);
        tv1=(TextView)findViewById(R.id.textView1);
        radiogroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                String str="You have selected :";
                 switch(i){
                     case R.id.radioButton1:str=str+"Breakfast";
                                            break;
                     case R.id.radioButton2:str=str+"Lunch";
                         break;
                     case R.id.radioButton3:str=str+"Dinner";
                         break;
                     case R.id.radioButton4:str=str+"All";
                         break;

                 }
                tv1.setText(str);
            }

        });//End of statement
    }
    public void clear(View v)
    { radiogroup.clearCheck();
        tv1.setText("You have selected none");

    }
}

package com.hpes.octavia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class DealOfTheDayActivity extends AppCompatActivity {
EditText et1;
EditText et2;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {   super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deal_of_the_day);
        et1=(EditText)findViewById(R.id.editText1);
        et2=(EditText)findViewById(R.id.editText5);
    }

    public void kik(View v)
    { // Toast.makeText(this,"ramu",Toast.LENGTH_LONG).show();
      String quantity=et1.getText().toString();
       String price=et2.getText().toString();
        Intent i=new Intent(DealOfTheDayActivity.this,DealConfirmationActivity.class);
        i.putExtra("Q",quantity);

        i.putExtra("P",price);
        startActivityForResult(i,786);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data)
    { super.onActivityResult(requestCode, resultCode, data);
        String result=data.getStringExtra("msg");
        Toast.makeText(this,result,Toast.LENGTH_LONG).show();
    }
}

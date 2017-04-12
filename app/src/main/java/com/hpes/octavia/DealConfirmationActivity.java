package com.hpes.octavia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class DealConfirmationActivity extends AppCompatActivity {
TextView tv3;
    String answer="Unanswered";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // Toast.makeText(this,"ramu", Toast.LENGTH_LONG).show();
        Intent intent=getIntent();
       setContentView(R.layout.activity_deal_confirmation);
        tv3=(TextView)findViewById(R.id.textView1);

        tv3.setText("Quantity :"+intent.getStringExtra("Q"));
        tv3.append("\n\nPrice per unit :"+intent.getStringExtra("P"));

    }
    public void dealstatus(View V)
    {
       // Toast.makeText(DealConfirmationActivity.this,"hi",Toast.LENGTH_SHORT).show();
         int bit=V.getId();
       switch(bit)
       {   case R.id.button1:answer="Confirmed";
                          break;
           case R.id.button2:answer="Rejected";
               break;

       }
        Intent i=new Intent();
        i.putExtra("msg",answer);
        setResult(999,i);

        finish();

    }
}

package com.hpes.octavia;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MenuActivity extends ListActivity {
    String screens[]={"LifeActivity","CalculatorActivity","LoginActivity","SpinnerActivity","IntentDemoActivity","RadioActivity","DealOfTheDayActivity",
            "CameraActivity","VideoActivity","ImageResourceActivity","OptionsMenuActivity","AlertDialogActivity",
            "SharedPreferencesActivity","SeekBarActivity","CustomListActivity","SDCardActivity","DataBaseActivity","BluetoothActivity","DynamiclistActivity",
            "ProximitySensorActivity","MusicActivity","navActivity","Exit"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_menu);
        ArrayAdapter adapter=new ArrayAdapter(MenuActivity.this, android.R.layout.simple_list_item_1,screens);
        setListAdapter(adapter);
        }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
         if(screens[position].equals("Exit"))
         {
            finish();
         }
        else
         {
             String str1=screens[position];
             str1="com.hpes.octavia"+"."+str1;
               try
               {
                   Class r=Class.forName(str1);
                   Intent i=new Intent(this,r);
                   startActivity(i);
               }
               catch(Exception e)
               {
                   Toast.makeText(this,"This Screen is yet to be Created", Toast.LENGTH_LONG).show();

               }


         }
    }
}

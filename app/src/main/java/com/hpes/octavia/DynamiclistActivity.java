package com.hpes.octavia;

import android.app.ListActivity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class DynamiclistActivity extends ListActivity {
ArrayList screens;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SQLiteDatabase db=openOrCreateDatabase("DemoDB",MODE_APPEND,null);
        String q="select * from student";
        Cursor c=db.rawQuery(q,null);
        String name;
        screens=new ArrayList();
        while(c.moveToNext())
        {
            name=c.getString(0);
            screens.add(name);
        }
        db.close();
        ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,screens);
        setListAdapter(adapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Toast.makeText(DynamiclistActivity.this, "Name Selected :'"+screens.get(position)+"'", Toast.LENGTH_SHORT).show();
        SQLiteDatabase db=openOrCreateDatabase("DemoDB",MODE_APPEND,null);
        String q="select * from student where name='"+screens.get(position)+"'";
        String phone="";
        Cursor c=db.rawQuery(q,null);
         if(c.moveToNext())
         {
             phone=c.getString(1);
         }
        Toast.makeText(DynamiclistActivity.this, "Phone"+phone, Toast.LENGTH_SHORT).show();
    }
}

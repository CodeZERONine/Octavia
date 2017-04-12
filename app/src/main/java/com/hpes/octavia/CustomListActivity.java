package com.hpes.octavia;

import android.app.ListActivity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;

public class CustomListActivity extends ListActivity{
String[] nameMenu={"apple","Mango"};
String[] infoMenu={"what ever","what so ever"};
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        ArrayAdapter adapter=null;
        adapter=new MyAdapter(this,android.R.layout.simple_list_item_1,nameMenu);
        setListAdapter(adapter);

    }
     class MyAdapter extends ArrayAdapter
     {
         public MyAdapter(Context context, int resource, Object[] objects)
         {
             super(context, resource, objects);
         }//end of constructor

         @Override
         public View getView(int position, View convertView, ViewGroup parent)
         {
            LayoutInflater li=(LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
             View row=li.inflate(R.layout.activity_custom_list,parent,false);
             ImageView iv=(ImageView)row.findViewById(R.id.imageView);
             TextView tv1=(TextView)row.findViewById(R.id.textView7);
             TextView tv2=(TextView)row.findViewById(R.id.textView2);
             TextClock tc=(TextClock) row.findViewById(R.id.textClock);
             tv1.setText(nameMenu[position]);
             tv2.setText(infoMenu[position]);
             return row;

         }
     }
}

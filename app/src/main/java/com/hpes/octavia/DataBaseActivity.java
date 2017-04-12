package com.hpes.octavia;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

public class DataBaseActivity extends AppCompatActivity {
TableLayout t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_base);
        t1=(TableLayout)findViewById(R.id.tableLayout1);
        SQLiteDatabase db=openOrCreateDatabase("DemoDB",MODE_APPEND,null);
        db.execSQL("create table if not exists student(name varchar,phone varchar)");
        db.execSQL("insert into student(Name,Phone) values('Katrina','9654827496')");
        db.execSQL("insert into student values('Saif','9654827496')");
        db.execSQL("insert into student values('jordan','9657462796')");
        Toast.makeText(DataBaseActivity.this, "Table Created", Toast.LENGTH_LONG).show();
        TableRow tr;
        String q="select * from student";
        Cursor c=db.rawQuery(q,null);
        String name,phone;
        while(c.moveToNext())
         {
            name=c.getString(0);
            phone=c.getString(1);
            tr=new TableRow(this);
            TextView tv1=new TextView(this);
            tv1.setText(name);
            TextView tv2=new TextView(this);
            tv2.setText(phone);

            tr.addView(tv1);
            tr.addView(tv2);
            t1.addView(tr);
            //Toast.makeText(DataBaseActivity.this, "Test", Toast.LENGTH_SHORT).show();

        }
        db.close();
    }
}

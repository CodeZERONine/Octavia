package com.hpes.octavia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class OptionsMenuActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {   getMenuInflater().inflate(R.menu.my_option_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {   int id = item.getItemId();
        switch (id)
        {       case R.id.item1:
                Toast.makeText(OptionsMenuActivity.this, "Add New", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item2:
                Toast.makeText(OptionsMenuActivity.this, "View All", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item3:
                Toast.makeText(OptionsMenuActivity.this, "Update", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item4:
                Toast.makeText(OptionsMenuActivity.this, "Settings", Toast.LENGTH_SHORT).show();
                break;


        }
            return super.onOptionsItemSelected(item);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {   super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options_menu);

    }
}

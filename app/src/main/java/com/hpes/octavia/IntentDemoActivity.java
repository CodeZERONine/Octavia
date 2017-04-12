package com.hpes.octavia;

import android.app.ListActivity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class IntentDemoActivity extends ListActivity {
 String scarray[]={"PhoneCall","SMS","PhoneBook","Web","search","Map","Exit"};
    @Override
    protected void onCreate(Bundle savedInstanceState)
    { super.onCreate(savedInstanceState);
        ArrayAdapter vt=new ArrayAdapter(this,android.R.layout.simple_list_item_1,scarray);
        setListAdapter(vt);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        if(scarray[position].equals("Exit"))
        {
            finish();
        }
        else if(scarray[position].equals("PhoneCall"))
        {
            Intent i=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:9311614000"));
            startActivity(i);
        }
        else if(scarray[position].equals("SMS"))
        {
            Intent i=new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:9311614000"));
            i.putExtra("sms_body","Code generated SMS");
            startActivity(i);
        }
        else if(scarray[position].equals("PhoneBook"))
        {
            Intent j=new Intent(Intent.ACTION_VIEW,Uri.parse("content://contacts/people/"));
            startActivity(j);
        }
        else if(scarray[position].equals("Web"))
        {
            Intent uy=new Intent(Intent.ACTION_VIEW, Uri.parse("http//www.youtube.com"));
            startActivity(uy);
        }
        else if(scarray[position].equals("search"))
        {
            Intent op=new Intent(Intent.ACTION_WEB_SEARCH, Uri.parse("http://www.google.co.in"));
            op.putExtra(SearchManager.QUERY,"Android");
            startActivity(op);
        }
        else if(scarray[position].equals("Map"))
        {
            Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("geo:mayur vihar ext.,delhi,India"));
            startActivity(i);
        }



    }
}

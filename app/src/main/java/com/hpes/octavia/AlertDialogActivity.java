package com.hpes.octavia;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class AlertDialogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {  super.onCreate(savedInstanceState);
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
       builder.setTitle("Attack").show();
     /*   builder.setMessage("Attack Enemy Village").show();
        Toast.makeText(AlertDialogActivity.this, "Check", Toast.LENGTH_SHORT).show();
        builder.setPositiveButton("Attack", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i)
            {
                Toast.makeText(AlertDialogActivity.this, "BOOM !", Toast.LENGTH_LONG).show();
            }
        }).show();;//end of statement
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i)
            {
                Toast.makeText(AlertDialogActivity.this, "Next time !", Toast.LENGTH_SHORT).show();
            }
        }).show();;//end of statement*/
        final String name[]={"Mayank's Village","Anshul's Village","Puneet's Village,"};
        builder.setItems(name, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(AlertDialogActivity.this,name[i], Toast.LENGTH_SHORT).show();
            }
            });//end of statement


    }
}

package com.hpes.octavia;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import static android.widget.Toast.makeText;

public class OctaviaCharging extends BroadcastReceiver {
    public OctaviaCharging()
    {

    }



    @Override
    public void onReceive(Context context, Intent intent)
    {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.

        String str=intent.getAction();
        if(str.equals("android.intent.action.ACTION_POWER_CONNECTED"))
        {
            Toast.makeText(context,"plugged",Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(context, "Unluged", Toast.LENGTH_SHORT).show();
        }
        //throw new UnsupportedOperationException("Not yet implemented");
    }
}

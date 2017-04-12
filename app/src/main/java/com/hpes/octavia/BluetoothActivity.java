package com.hpes.octavia;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Set;

public class BluetoothActivity extends AppCompatActivity {
ListView listView;
    Set<BluetoothDevice> bluetoothDeviceSet;
    BluetoothAdapter bta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bluetooth);
        listView=(ListView)findViewById(R.id.listView);
        bta=BluetoothAdapter.getDefaultAdapter();
    }
    public void on(View v)
    {
        if(bta.isEnabled()==false)
        {
            Intent intent=new Intent(bta.ACTION_REQUEST_ENABLE);
            startActivity(intent);
            Toast.makeText(BluetoothActivity.this, "Bluetooth is now Enabled", Toast.LENGTH_SHORT).show();
        }
        else
            Toast.makeText(BluetoothActivity.this, "Bluetooth Already Enabled", Toast.LENGTH_SHORT).show();
    }
    public void discover(View v)
    {
        Intent i=new Intent(bta.ACTION_REQUEST_DISCOVERABLE);
        startActivityForResult(i,0);
        Toast.makeText(BluetoothActivity.this, "Your Device is now Discoverable", Toast.LENGTH_SHORT).show();
    }
    public void list(View v)
    {
        bta.startDiscovery();
        bluetoothDeviceSet=bta.getBondedDevices();
        ArrayList arraylist=new ArrayList();
           for(BluetoothDevice bd:bluetoothDeviceSet)
           {
               String dname=bd.getName();
               arraylist.add(dname);
           }//end of extende for loop
        ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,arraylist);
        listView.setAdapter(adapter);
    }
    public void off(View v)
    {
        bta.disable();
        Toast.makeText(BluetoothActivity.this, "Bluetooth is now Disabled", Toast.LENGTH_SHORT).show();
    }
}

package com.hpes.octavia;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class ProximitySensorActivity extends AppCompatActivity implements SensorEventListener {
 SensorManager sm;
    EditText ed1;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proximity_sensor);
        ed1=(EditText)findViewById(R.id.editText6);
        sm=(SensorManager)getSystemService(Context.SENSOR_SERVICE);
        int rn= Sensor.TYPE_PROXIMITY;
        Sensor s=sm.getDefaultSensor(rn);
        sm.registerListener(this,s,SensorManager.SENSOR_DELAY_NORMAL);
    }//end of onCreate()

    @Override
    public void onSensorChanged(SensorEvent sensorEvent)
    {
        float f=sensorEvent.values[0];
        Toast.makeText(ProximitySensorActivity.this,"VAlue is :"+f, Toast.LENGTH_SHORT).show();
        if(f==8.0)
        {
            ed1.setText("Uncovered");
        }
        else
        {
            ed1.setText("Covered");
        }

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }

    @Override
    protected void onStop()
    {
        super.onStop();
        sm.unregisterListener(this);
    }
}

package com.ivoryworks.databindingtest;

import android.databinding.DataBindingUtil;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.ivoryworks.databindingtest.databinding.ActivityMainBinding;
import com.ivoryworks.databindingtest.model.Gyroscope;

public class MainActivity extends AppCompatActivity implements SensorEventListener {

    private SensorManager mSensorManager;
    private Gyroscope mGyroscope;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        mGyroscope = new Gyroscope(0, 0, 0);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setGyro(mGyroscope);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Sensor gyro = mSensorManager.getDefaultSensor(Sensor.TYPE_GYROSCOPE);
        if (gyro != null) {
            mSensorManager.registerListener(this, gyro, SensorManager.SENSOR_DELAY_UI);
        }
    }

    @Override
    protected void onPause() {
        mSensorManager.unregisterListener(this);
        super.onPause();
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        if (event.sensor.getType() == Sensor.TYPE_GYROSCOPE) {
            mGyroscope.changeX(event.values[0]);
            mGyroscope.changeY(event.values[1]);
            mGyroscope.changeZ(event.values[2]);
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}

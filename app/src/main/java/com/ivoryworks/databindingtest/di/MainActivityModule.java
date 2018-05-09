package com.ivoryworks.databindingtest.di;

import android.app.Application;
import android.hardware.SensorManager;

import com.ivoryworks.databindingtest.MainViewModel;

import dagger.Module;
import dagger.Provides;

@Module
public class MainActivityModule {

    @Provides
    MainViewModel provideMainViewModel() {
        return new MainViewModel(0, 0, 0);
    }

    @Provides
    SensorManager provideSensorManager(Application application) {
        return (SensorManager) application.getSystemService(Application.SENSOR_SERVICE);
    }
}

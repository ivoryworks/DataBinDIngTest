package com.ivoryworks.databindingtest.di;

import android.app.Application;
import android.content.Context;

import com.ivoryworks.databindingtest.model.Gyroscope;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
class AppModule {

    @Singleton
    @Provides
    Context provideContext(Application application) {
        return application.getApplicationContext();
    }

    @Singleton
    @Provides
    Gyroscope provideGyroscope() {
        return new Gyroscope(0, 0, 0);
    }

}

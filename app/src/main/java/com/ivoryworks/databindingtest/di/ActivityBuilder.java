package com.ivoryworks.databindingtest.di;

import com.ivoryworks.databindingtest.MainActivity;
import com.ivoryworks.databindingtest.MainActivityModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilder {
    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity bindmainActivity();
}

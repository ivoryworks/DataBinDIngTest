package com.ivoryworks.databindingtest;

import android.databinding.ObservableField;

public class MainViewModel {
    // ObservableField型にする場合はpublicにする必要がある
    // また、getter/setterは不要となる
    public ObservableField<String> x = new ObservableField<>();
    public ObservableField<String> y = new ObservableField<>();
    public ObservableField<String> z = new ObservableField<>();

    public MainViewModel(float x, float y, float z) {
        this.x.set(String.valueOf(x));
        this.y.set(String.valueOf(y));
        this.z.set(String.valueOf(z));
    }

    public void changeX(float x) {
        this.x.set(String.valueOf(x));
    }

    public void changeY(float y) {
        this.y.set(String.valueOf(y));
    }

    public void changeZ(float z) {
        this.z.set(String.valueOf(z));
    }
}

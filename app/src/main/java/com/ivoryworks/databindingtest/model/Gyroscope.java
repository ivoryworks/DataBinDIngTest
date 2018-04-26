package com.ivoryworks.databindingtest.model;

public class Gyroscope {
    private float x;
    private float y;
    private float z;

    public Gyroscope(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String getX() {
        return String.valueOf(this.x);
    }

    public void setX(float x) {
        this.x = x;
    }

    public String getY() {
        return String.valueOf(this.y);
    }

    public void setY(float y) {
        this.y = y;
    }

    public String getZ() {
        return String.valueOf(this.z);
    }

    public void setZ(float z) {
        this.z = z;
    }
}

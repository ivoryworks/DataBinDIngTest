package com.ivoryworks.databindingtest.model;

public class Gyroscope {
    private float mX;
    private float mY;
    private float mZ;

    public Gyroscope(float x, float y, float z) {
        mX = x;
        mY = y;
        mZ = z;
    }

    public float getX() {
        return mX;
    }

    private void setX(float x) {
        mX = x;
    }

    public float getY() {
        return mY;
    }

    private void setY(float y) {
        mY = y;
    }

    public float getZ() {
        return mZ;
    }

    private void setZ(float z) {
        mZ = z;
    }
}

package com.tdd.smartfill;

public final class CylindricalFlask {
    public int shouldCalculateVolumeOfACylinder(int radius, int height) {
        int volume = (int) Math.ceil(Math.PI * radius * radius * height);
        return volume;
    }
}

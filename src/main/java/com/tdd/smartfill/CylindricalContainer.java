package com.tdd.smartfill;

public final class CylindricalContainer {
    int capacity = 0;
    int radius = 0;
    int height = 0;
    int volume = 0;

    CylindricalContainer(final int radius, final int height) {
        this.radius = radius;
        this.height = height;
    }

    public int shouldCalculateVolumeOfACylinder() {
        this.volume = (int) Math.ceil(Math.PI * this.radius * this.radius * this.height);
        return this.volume;
    }

    public int remainingCapacity() {
        return this.shouldCalculateVolumeOfACylinder() - this.capacity;


    }

    public void fillWith(int quantity) {
        this.capacity = this.capacity + quantity ;
    }

    public boolean isFull() {
        if (this.remainingCapacity() == 0){
            return true;
        }
        return false;
    }
}

package com.techreturners.cats;

public abstract class Cat implements ICat {

    protected boolean asleep;
    protected int averageHeight;
    protected String setting;

    public Cat(boolean asleep, int averageHeight, String setting) {
        this.asleep = asleep;
        this.averageHeight = averageHeight;
        this.setting = setting;
    }


    public void goToSleep() { this.asleep = true; }

    public boolean isAsleep() {
        return this.asleep;
    }

    public void wakeUp() { this.asleep = false; }

    public String getSetting() {
        return this.setting;
    }

    public int getAverageHeight() {
        return this.averageHeight;
    }
}
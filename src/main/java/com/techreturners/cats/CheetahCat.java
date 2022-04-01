package com.techreturners.cats;

public class CheetahCat extends Cat {

    public CheetahCat(boolean asleep, int averageHeight, String setting) {

        super(asleep, averageHeight, setting);
    }

    public String eat() {
        return "Zzzzzzz";
    }
}
package com.techreturners.cats;

public class LionCat extends Cat{

    public LionCat(boolean asleep, int averageHeight, String setting) {

        super(asleep, averageHeight, setting);
    }

    public String eat() {
        return "Roar!!!!";
    }


}

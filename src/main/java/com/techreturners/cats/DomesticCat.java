package com.techreturners.cats;

public class DomesticCat extends Cat{

    public DomesticCat(boolean asleep, int averageHeight, String setting) {

        super(asleep, averageHeight, setting);
    }

    public String eat() {
        int randomInt = (int) Math.round(Math.random() * 1);
        if (randomInt == 0) return "Purrrrrrr";
        return "It will do I suppose";
    }

}

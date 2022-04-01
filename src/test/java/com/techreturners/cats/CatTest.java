package com.techreturners.cats;

import org.junit.Test;


import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CatTest {

    @Test
    public void checkCatIsAwake() {
        Cat domesticCat = new DomesticCat(false, 33, "domestic");
        assertFalse("Cat should be awake by default", domesticCat.isAsleep());
    }

    @Test
    public void checkCatCanGoToSleep() {
        Cat domesticCat = new DomesticCat(false, 33, "domestic");
        domesticCat.goToSleep();
        assertTrue("Cat should be snoozing", domesticCat.isAsleep());
    }

    @Test
    public void checkCatCanWakep() {
        Cat domesticCat = new DomesticCat(false, 33, "domestic");
        domesticCat.goToSleep();
        domesticCat.wakeUp();
        assertFalse("Cat should be awake now", domesticCat.isAsleep());
    }

    @Test
    public void checkCatSetting() {
        Cat domesticCat = new DomesticCat(false, 33, "domestic");
        assertEquals("domestic", domesticCat.getSetting());
    }

    @Test
    public void checkCatHeight() {
        Cat domesticCat = new DomesticCat(false, 23, "domestic");
        assertEquals(23, domesticCat.getAverageHeight());
    }

    @Test
    public void checkLionHeight() {
        Cat lionCat = new LionCat(false, 1100, "wild");
        assertEquals(1100, lionCat.getAverageHeight());
    }

    @Test
    public void feedTheLion() {
        Cat lionCat = new LionCat(false, 1100, "wild");
        assertEquals("Roar!!!!", lionCat.eat());
    }

     @Test
     public void feedTheCheetah() {
         Cat cheetahCat = new CheetahCat(false, 900, "wild");
         assertEquals("Zzzzzzz", cheetahCat.eat());
     }

    @Test
    public void feedTheCat() {
        Cat domesticCat = new DomesticCat(false, 23, "domestic");
        assertThat(domesticCat.eat(), anyOf(is("Purrrrrrr"), is("It will do I suppose")));
    }
}
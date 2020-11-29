package com.company;

public class Die {

    private int numDots;
    public int getNumDots() {
        return numDots;
    }
    public void roll() {

        numDots = (int)(Math.random()*6)+1;
    }

}

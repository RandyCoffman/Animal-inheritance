package com.randycoffman;

public class Beta extends Fish {

    private int aggressiveness;

    public Beta(String name, int size, int weight, int eyes, int gills, int fins, int aggressiveness) {
        super(name, size, weight, eyes, gills, fins);
        this.aggressiveness = aggressiveness;
    }

    public void fightOtherFish(){
        if(this.aggressiveness >= 7){
            System.out.println("beta is now fighting the other fish");
        } else {
            System.out.println("beta is not fighting the other fish");
        }
    }
}

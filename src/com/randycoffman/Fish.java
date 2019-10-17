package com.randycoffman;

public class Fish extends Animal {

    private int eyes;
    private int gills;
    private int fins;

    public Fish(String name, int size, int weight, int eyes, int gills, int fins) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.gills = gills;
        this.fins = fins;
    }

    private void moveMuscles(){
        System.out.println("moving muscles now");
    }

    private void moveFins(){
        System.out.println("moving tail and fins now");
    }

    private void swim(int speed){
        moveMuscles();
        moveFins();
    }

    @Override
    public void move(int speed) {
        swim(speed);
        super.move(speed);
    }
}

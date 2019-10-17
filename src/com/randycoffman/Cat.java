package com.randycoffman;

public class Cat extends Animal{

    private String coat;
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;

    public Cat(String name, int size, int weight, String coat, int eyes, int legs, int tail, int teeth) {
        super(name, 1, 1, size, weight);
        this.coat = coat;
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
    }

    private void chew(){
        System.out.println("the cat is chewing now");
    }

    @Override
    public void eat() {
        chew();
        super.eat();
    }

    public void walk() {
        move(2);
    }

    public void run(){
       move(7);
    }
}

package com.randycoffman;

public class Main {

    public static void main(String[] args) {
	Animal animal = new Animal("Spot", 1, 1, 10, 10);

	Cat cat = new Cat("Cheshire", 5, 7,"short and soft", 1, 4, 1, 30);

	Fish fish = new Fish("Goldy", 5, 7, 1, 1, 1);

	Beta beta = new Beta("Blue", 4, 2, 1, 1, 1, 10);

	beta.eat();
	beta.fightOtherFish();

	cat.run();
	cat.eat();

	animal.eat();

	fish.move(4);
	fish.eat();

    }
}

package test;

import domain.Cat;
import domain.HoneyBadger;

public class TestAnimal {

    public static void main(String[] args) {
        Cat cat = new Cat("Thomas");
        System.out.println(cat);
        cat.hunt();
        cat.eat();
        cat.speak();
        cat.play();

        HoneyBadger badger = new HoneyBadger("Rally");
        System.out.println(badger);
        badger.speak();
        badger.hunt();
        badger.eat();
        badger.dig();
    }
}

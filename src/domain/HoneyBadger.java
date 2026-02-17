package domain;

public class HoneyBadger extends Predator {

    private String kind;

    public HoneyBadger(String name, int weight, String kind) {
        this.name = name;
        this.weight = weight;
        this.kind = kind;
    }

    public HoneyBadger() {
        this("Combat Badger", 12, "African");
    }

    public HoneyBadger(String name) {
        this(name, 12, "Wild");
    }

    public void dig() {
        System.out.println("Honey badger is digging a deep burrow...");
    }

    @Override
    public void hunt() {
        System.out.println("Honey badger is hunting a cobra...");
    }

    @Override
    public void speak() {
        System.out.println("Grrr! Hiss!");
    }

    @Override
    public void eat() {
        System.out.println("Honey badger is eating honey and larvae...");
    }

    @Override
    public String toString() {
        return super.toString() + "\nKind:\t" + this.kind + "\nStatus:\tFearless!";
    }
}
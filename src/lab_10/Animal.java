package lab_10;

public abstract class Animal {
    protected String name;
    protected int speed;

    public Animal() {
    }

    public Animal(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public abstract Animal setName(String name);

    public int getSpeed() {
        return speed;
    }

    public abstract Animal setSpeed(int speed);
}

package lab_08;

public class Animal {
    private int speed;

    public Animal(int speed) {
        this.speed = speed;
    }

    public Animal() {

    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Animal{" +
                ", speed=" + getSpeed() +
                '}';
    }

    public String getName() {
        return null;
    }
}

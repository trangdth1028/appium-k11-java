package lab_10;

import java.security.SecureRandom;

public class Dog extends Animal {
    static final int DOG_MAX_SPEED = 60;

    public Dog(String name) {
        super(name, new SecureRandom().nextInt(DOG_MAX_SPEED));
    }

    public Dog() {

    }

    @Override
    public Animal setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public Animal setSpeed(int speed) {
        this.speed = speed;
        return this;
    }
}

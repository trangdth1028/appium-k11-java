package lab_10;

import java.security.SecureRandom;

public class Horse extends Animal {
    static final int HORSE_MAX_SPEED = 75;

    public Horse(String name) {
        super(name, new SecureRandom().nextInt(HORSE_MAX_SPEED));
    }

    public Horse() {

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

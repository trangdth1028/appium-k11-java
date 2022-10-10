package lab_10;

import java.security.SecureRandom;

public class Tiger extends Animal {
    static final int TIGER_MAX_SPEED = 100;

    public Tiger(String name) {
        super(name, new SecureRandom().nextInt(TIGER_MAX_SPEED));
    }

    public Tiger() {

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

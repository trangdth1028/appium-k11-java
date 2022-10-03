package lab_08;

import java.security.SecureRandom;

public class Horse extends Animal {
    public Horse(int speed) {
        super(speed);
    }

    public Horse() {
        super();
    }

    @Override
    public int getSpeed() {
        int randomSpeed = new SecureRandom().nextInt(75);
        return randomSpeed;
    }
}

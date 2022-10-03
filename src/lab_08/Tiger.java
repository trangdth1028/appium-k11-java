package lab_08;

import java.security.SecureRandom;

public class Tiger extends Animal {
    public Tiger(int speed) {
        super(speed);
    }

    public Tiger() {

    }

    @Override
    public int getSpeed() {
        int randomSpeed = new SecureRandom().nextInt(100);
        return randomSpeed;
    }
}

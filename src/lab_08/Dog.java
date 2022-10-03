package lab_08;

import java.security.SecureRandom;

public class Dog extends Animal {
    public Dog(int speed) {
        super(speed);
    }

    public Dog() {

    }

    @Override
    public int getSpeed() {
        int randomSpeed = new SecureRandom().nextInt(60);
        return randomSpeed;
    }
}

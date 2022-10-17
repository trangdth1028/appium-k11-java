package lab_11;

import java.security.SecureRandom;

public class Dog implements MoveAble, FlyAble {
    private String name;
    private int speed;
    static final int DOG_MAX_SPEED = 60;

    public Dog() {
        this.name = getName();
        speed = new SecureRandom().nextInt(DOG_MAX_SPEED);
    }

    @Override
    public boolean Flyable() {
        return false;
    }

    @Override
    public boolean Moveable() {
        return true;
    }

    @Override
    public int speed() {
        return speed;
    }

    @Override
    public String getName() {
        return MoveAble.super.getName();
    }
}

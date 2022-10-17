package lab_11;

import java.security.SecureRandom;

public class Eagle implements MoveAble, FlyAble {
    private String name;
    private int speed;
    static final int EAGLE_MAX_SPEED = 120;

    public Eagle() {
        this.name = getName();
        speed = new SecureRandom().nextInt(EAGLE_MAX_SPEED);
    }

    @Override
    public boolean Flyable() {
        return true;
    }

    @Override
    public boolean Moveable() {
        return false;
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

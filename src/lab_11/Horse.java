package lab_11;

import java.security.SecureRandom;

public class Horse implements MoveAble, FlyAble {
    private String name;
    private int speed;
    static final int HORSE_MAX_SPEED = 75;

    public Horse() {
        this.name = getName();
        speed = new SecureRandom().nextInt(HORSE_MAX_SPEED);
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

package lab_11;

import java.security.SecureRandom;

public class Falcon implements MoveAble, FlyAble {
    private String name;
    private int speed;
    static final int FALCON_MAX_SPEED = 80;

    public Falcon() {
        this.name = getName();
        speed = new SecureRandom().nextInt(FALCON_MAX_SPEED);
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

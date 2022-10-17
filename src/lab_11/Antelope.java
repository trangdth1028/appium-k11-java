package lab_11;

import java.security.SecureRandom;

public class Antelope implements MoveAble, FlyAble{
    private String name;
    private int speed;
    static final int ANTELOPE_MAX_SPEED = 95;

    public Antelope() {
        this.name = getName();
        speed = new SecureRandom().nextInt(ANTELOPE_MAX_SPEED);
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

package lab_11;

public interface MoveAble {
    boolean Moveable();

    int speed();

    default String getName() {
        return getClass().getSimpleName();
    }
}

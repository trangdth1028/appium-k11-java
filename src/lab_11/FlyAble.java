package lab_11;

public interface FlyAble {
    boolean Flyable();

    int speed();

    default String getName() {
        return getClass().getSimpleName();
    }
}

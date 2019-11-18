package racingcar.domain.car;

import racingcar.domain.movestrategy.MoveStrategy;

public class Car {
    private final Name name;
    private Position position;

    public Car(final String name) {
        this.name = Name.of(name);
        this.position = Position.newInstance();
    }

    public static Car of(final String name) {
        return new Car(name);
    }

    void tryMove(final MoveStrategy moveStrategy) {
        if (moveStrategy.isAvailableMove(this)) {
            position = position.increase();
        }
    }

    public String getName() {
        return name.getName();
    }

    public int getPosition() {
        return position.getPosition();
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", position=" + position +
                '}';
    }
}

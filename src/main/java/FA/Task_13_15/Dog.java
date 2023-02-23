package FA.Task_13_15;

import java.util.Date;

public class Dog extends Pets {
    public Dog(String name, Date date_of_birth, String commands) {
        super(name, date_of_birth, "dog", commands);
    }

    @Override
    public String toString() {
        return getAnimal();
    }
}

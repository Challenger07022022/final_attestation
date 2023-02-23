package FA.Task_13_15;

import java.util.Date;

public class Hamster extends Pets {
    public Hamster(String name, Date date_of_birth, String commands) {
        super(name, date_of_birth, "humster", commands);
    }

    @Override
    public String toString() {
        return getAnimal();
    }
}

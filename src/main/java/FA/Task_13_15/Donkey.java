package FA.Task_13_15;

import java.util.Date;

public class Donkey extends Pack {
    public Donkey(String name, Date date_of_birth, String commands) {
        super(name, date_of_birth, "donkey", commands);
    }

    @Override
    public String toString() {
        return getAnimal();
    }
}

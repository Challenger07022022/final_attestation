package FA.Task_13_15;

import java.util.Date;

public class Horse extends Pack {
    public Horse(String name, Date date_of_birth, String commands) {
        super(name, date_of_birth, "horse", commands);
    }

    @Override
    public String toString() {
        return getAnimal();
    }
}

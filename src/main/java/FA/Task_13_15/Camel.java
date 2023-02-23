package FA.Task_13_15;

import java.util.Date;

public class Camel extends Pack{
    public Camel(String name, Date date_of_birth, String commands) {
        super(name, date_of_birth, "camel", commands);
    }

    @Override
    public String toString() {
        return getAnimal();
    }
}

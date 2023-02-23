package FA.Task_13_15;

import java.util.Date;

public class Pets extends Animals {
    private String commands;

    public Pets(String name, Date date_of_birth, String type, String commands) {
        super(name, date_of_birth, "pets", type);
        this.commands = commands;
    }

    public void setCommands(String commands) {
        this.commands = commands;
    }

    public String getAnimal() {
        return getAnimals() + " " + this.commands;
    }
}

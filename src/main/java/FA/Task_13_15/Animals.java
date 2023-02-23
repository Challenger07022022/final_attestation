package FA.Task_13_15;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Animals {
    private final String name;
    private final Date date_of_birth;
    private final String group; // pets & pack
    private final String type;  // dog,cat, hamster, horse, camel, donkey
    private final SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");

    public Animals(String name, Date date_of_birth, String group, String type) {
        this.name = name;
        this.date_of_birth = date_of_birth;
        this.group = group;
        this.type = type;
    }

    public String getAnimals() {
        return this.name + " " + format.format(this.date_of_birth) + " " + this.group + " " + this.type;
    }
}

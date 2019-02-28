package humanity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HumanUtils {

    public HumanUtils() {

    }

    public LocalDate StringtoDate(String label) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return LocalDate.parse(label, format);
    }

    public String genderCase(String gender) {
        if (Human.MALE.equalsIgnoreCase(gender)) {
            return Human.MALE;
        } else if (Human.FEMALE.equalsIgnoreCase(gender)) {
            return Human.FEMALE;
        }
        return Human.UNKNOWN;
    }

    public void showListOf(String whoIsIt, Human[] humans) {
        for (Human human : humans) {
            System.out.println(whoIsIt + ": " + human.getLastName() + ", " + human.getName());
        }
    }

}

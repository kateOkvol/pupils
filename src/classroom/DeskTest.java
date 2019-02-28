package classroom;

import humanity.Human;
import humanity.HumanUtils;

import java.util.Arrays;

public class DeskTest {
    public static void main(String[] args) {
        Human[] students = {new Human("Kate", "Golovko"),
                new Human("Ales", "Kurs"),
                new Human("Egorka", "Grigolyonok"),
                new Human("Max", "Zhdanovich"),
                new Human("Lyoha", "Valuev"),
                new Human("Misha", "Gordeyko"),
                new Human("Alina", "Kulikova"),
                new Human("Max", "Koloshinsky"),
                new Human("Misha", "Serdyuk")};

        HumanUtils help = new HumanUtils();

        System.out.println("Students list:");
        help.showListOf("Student", students);

        Arrays.sort(students);

        System.out.println("\nNumber of students: " + students.length);

        Desk deskObject = new Desk();
        System.out.println("Number of required desks: " + deskObject.amount(students.length) + "\n");

        Desk[] desk = deskObject.takeSeat(students);
        deskObject.showDesksLocation(desk);
    }
}




package humanity;

public class HumanTest {
    public static void main(String[] args) {

        Human listener = new Human("Someone", "in front of the monitor");
        System.out.println("\nHi, " + listener.getName() + ". Here is some information to test humanity.\n");

        String name = "Irina", lastName = "Bogdanovich";
        String iraBirthday = "15.05.2000";
        String gender = "FEMALE";
        int growth = 165, weight = 48;

        Human ira = new Human(name, lastName);
        ira.setGender(gender);
        ira.setGrowth(growth);
        ira.setWeight(weight);
        ira.setBirthDate(iraBirthday);

        ira.printNameFirst();
        System.out.println(ira.getName() + " is " + ira.getAge());
        System.out.println(ira.getFullName() + " is wearing a size " + ira.getSize(growth));

        Health iraHealth = new Health();

        System.out.println("Body mass index of " + ira.getName() + " is " + String.format("%.2f", iraHealth.getIMT(ira)));
        iraHealth.showResults(ira);
    }
}

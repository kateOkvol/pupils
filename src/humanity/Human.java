package humanity;

import java.time.LocalDate;

public class Human implements Comparable<Human> {
    public static final String MALE = "Male", FEMALE = "Female", UNKNOWN = "Unknown";

    private int growth, weight, age;
    private LocalDate birthDate;
    private String name, lastName;
    private String gender;

    public Human() {
    }

    public Human(String gender, String name, String lastName, String birthday, int growth, int weight) {
        this.gender = new HumanUtils().genderCase(gender);
        this.name = name;
        this.lastName = lastName;
        this.birthDate = new HumanUtils().StringtoDate(birthday);
        this.growth = growth;
        this.weight = weight;

    }

    public Human(String birthday) {
        this.birthDate = new HumanUtils().StringtoDate(birthday);
    }

    public Human(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public Human(String gender, int growth, int weight) {
        this.growth = growth;
        this.weight = weight;
        this.gender = new HumanUtils().genderCase(gender);
    }

    public int getGrowth() {
        return growth;
    }

    public void setGrowth(int growth) {
        this.growth = growth;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = new HumanUtils().StringtoDate(birthDate);
    }

    public int getAge() {
        LocalDate today = LocalDate.now();
        this.age = today.minusYears(getBirthDate().getYear()).getYear();

        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = new HumanUtils().genderCase(gender);
    }

    public String getFullName() {
        return getName() + " " + getLastName();
    }

    public String getSize(int growth) {
        String[] sizeTable = {"XS", "S", "M", "L", "XL", "2XL", "3XL"};
        int index;

        if (growth >= 194) {
            index = 6;
        } else if (growth <= 158) {
            index = 0;
        } else {
            index = (growth - 158) / 6;
        }

        return sizeTable[index];
    }

    public void printNameFirst() {
        System.out.println(getFullName());
    }

    @Override
    public int compareTo(Human o1) {
        return getLastName().compareToIgnoreCase(o1.getLastName());
    }
}

package humanity;

import java.util.Objects;

class Health {
    private double itm;

    Health() {
    }

    double getIMT(Human human) {
        double growth = human.getGrowth() / 100d;
        double itm = (double) human.getWeight() / (growth * growth);
        this.itm = itm;
        return itm;
    }


    void showResults(Human human) {
        String[] resultTable = {"Underweight", "Normal weight", "Overweight", "Obesity"};
        double[] table = {19d, 25d, 30d, 40d};
        String result = null;

        if (Human.MALE.equals(human.getGender())) {
            for (int i = 0; i < 4; i++) {
                if (itm <= table[i]) {
                    result = resultTable[i];
                    break;
                }
            }
        } else if (Human.FEMALE.equals(human.getGender())) {
            for (int i = 0; i < 4; i++) {
                if (itm <= table[i] - 1) {
                    result = resultTable[i];
                    break;
                }
            }
        }
        System.out.println(Objects.requireNonNullElse(result, "Severe obesity"));
    }
}



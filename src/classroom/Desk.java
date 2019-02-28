package classroom;

import humanity.Human;

class Desk {
    private static final int COLS = 3;
    private String student1, student2;

    Desk() {
    }

    Desk(String student1, String student2) {
        this.student1 = student1;
        this.student2 = student2;
    }

    Desk(String student1) {
        this.student1 = student1;
    }

    public String getStudent1() {
        return student1;
    }

    public void setStudent1(String student1) {
        this.student1 = student1;
    }

    public String getStudent2() {
        return student2;
    }

    public void setStudent2(String student2) {
        this.student2 = student2;
    }

    int amount(int size) {
        if (size % 2 == 0) {
            return size / 2;
        } else {
            return size / 2 + 1;
        }
    }

    Desk[] takeSeat(Human[] humans) {
        int size = humans.length;
        int deskAmount = amount(size);
        int id = 0;                                     //for student number
        Desk[] desk = new Desk[deskAmount];
        for (int i = 0; i < deskAmount; i++) {
            if (id >= size - 1) {                       //last student of the array
                if (size % 2 != 0) {
                    desk[deskAmount - 1] = new Desk(humans[size - 1].getLastName());
                }
                break;
            }
            desk[i] = new Desk(humans[id].getLastName(), humans[id + 1].getLastName());
            id += 2;
        }
        return desk;
    }

    String showDesk() {
        if (getStudent2() == null) {
            return getStudent1();
        } else {
            return getStudent1() + ", " + getStudent2();
        }
    }

    void showDesksLocation(Desk[] desk) {
        int deskAmount = desk.length;
        int rows = (deskAmount % 3 == 0) ? deskAmount / 3 : deskAmount / 3 + 1;
        int deskIndex = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < COLS; j++) {
                if (deskIndex <= deskAmount) {
                    System.out.print("desk " + deskIndex + ": |" + desk[deskIndex - 1].showDesk() + "|\t");
                    deskIndex++;
                } else {
                    break;
                }
            }
            System.out.println();
        }
    }
}


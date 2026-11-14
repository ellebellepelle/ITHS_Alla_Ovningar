package me.ellebelle.ovningar1;

public class Ovning1_3 {

    public static void leagalyDriver(int age) {

        if (age < 18) {
            int diff = 18 - age;
            System.out.println("Du är inte gammal nog att ta körkort, du måste vänta "
            + diff + " år till.");
        }
        else {
            System.out.println("Congrats, du är " + age + " år gammal och får ta körkort!");
        }
    }
}

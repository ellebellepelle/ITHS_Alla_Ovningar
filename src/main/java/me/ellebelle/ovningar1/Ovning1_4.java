package me.ellebelle.ovningar1;

public class Ovning1_4 {

    public static void averageValue() {
        int tal1 = Integer.parseInt(IO.readln("Första talet: "));
        int tal2 = Integer.parseInt(IO.readln("Andra talet: "));

        double average = (tal1 + tal2) / 2.0;
        System.out.println(average);

        if (tal1 < tal2) {
            System.out.println(tal2);
        }
        else {
            System.out.println(tal1);
        }
    }
}

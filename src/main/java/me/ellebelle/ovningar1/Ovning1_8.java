package me.ellebelle.ovningar1;

public class Ovning1_8 {

    public static void switchNum() {
        int num1 = 4;
        int num2 = 8;

        IO.println(num1 + " " + num2);

        int num3 = num1;

        num1 = num2;
        num2 = num3;

        IO.println(num1 + " " + num2);
    }
}

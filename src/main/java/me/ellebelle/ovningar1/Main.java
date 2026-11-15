package me.ellebelle.ovningar1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Ovning1_1.halsning();

        Ovning1_2.rektangelYta();
        int age = Integer.parseInt(IO.readln("Hur gammal är du?"));

        Ovning1_3.leagalyDriver(age);
        System.out.println("Hur gammal är du?");
        Scanner sc = new Scanner(System.in);
        int age2 = sc.nextInt();
        Ovning1_3.leagalyDriver(age2);

        Ovning1_4.averageValue();

        Ovning1_5.averageValue3();
    }
}
package me.ellebelle.ovningar1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Ovning1_1.halsning();
//
//        Ovning1_2.rektangelYta();
//        int age = Integer.parseInt(IO.readln("Hur gammal är du?"));
//
//        Ovning1_3.leagalyDriver(age);
//        System.out.println("Hur gammal är du?");
//        Scanner sc = new Scanner(System.in);
//        int age2 = sc.nextInt();
//        Ovning1_3.leagalyDriver(age2);
//
//        Ovning1_4.averageValue();
//
//        Ovning1_5.averageValue3();
//
//        Ovning1_6.outWriteNumber();
//
//        Ovning1_8.switchNum();

        int num1 = 4, num2 = 8;
        int result = Ovning1_9.sum(num1, num2);
        IO.println(result);

        double celcius = 25.5;
        double result2 = Ovning_10.celciusToFarenheit(celcius);
        IO.println(result2);

        double fahrenheit = 91.2;
        double result3 = Ovning1_11.fahrenheitToCelcius(fahrenheit);
        IO.println(result3);
    }
}
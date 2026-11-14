package me.ellebelle.ovningar1;

import java.util.Scanner;

public class Ovning1_1 {

    public static void halsning() {
        // Grundläggande Syntax, Datatyper, Villkor och metoder

        // 1
        IO.println("Vad heter du?");
        String namnIO = IO.readln();
        IO.println("Hej " + namnIO + " välkommen hit idag!");

        Scanner sc = new Scanner(System.in);
        System.out.println("Vad heter du?");
        String namnSout = sc.nextLine();
        System.out.println("Hej " + namnSout + " välkommen hit idag!");
    }
}

package me.ellebelle.ovningar1;

public class Ovning1_5 {

    public static void averageValue3() {
//        int tal1 = Integer.parseInt(IO.readln("Skriv tal 1: "));
//        int tal2 = Integer.parseInt(IO.readln("Skriv tal 2: "));
//        int tal3 = Integer.parseInt(IO.readln("Skriv tal 3: "));
//
//        double average = (double) (tal1 + tal2 + tal3) / 3;

        // /////////////////////////////////////////////////////////////
//        int summa = 0;
//        int antal = 0;
//
//        while (true) {
//            int tal = Integer.parseInt(IO.readln("Skriv ett tal (0 för att avsluta): "));
//
//            if (tal == 0) {
//                break;
//            }
//
//            summa += tal;
//            antal++;
//        }
//
//        if (antal > 0) {
//            double average = (double) summa / antal;
//            IO.println("Medelvärdet är: " + average);
//        }

        // ///////////////////////////////////////////////////////////////////
        int summa = 0;
        int antal = 0;
        int storstTal = Integer.MIN_VALUE;

        while (true) {
            String input = IO.readln("Skriv ett tal (q för att avsluta): ");

            if (input.equalsIgnoreCase("q")) {
                break;
            }

            int tal = Integer.parseInt(input);

            summa += tal;
            antal++;

            if (tal > storstTal) {
                storstTal = tal;
            }
        }

        if (antal > 0) {
            double average = (double) summa / antal;
            IO.println("Medelvärdet är: " + average);
            IO.println("Största talet är: " + storstTal);
        }
    }
}

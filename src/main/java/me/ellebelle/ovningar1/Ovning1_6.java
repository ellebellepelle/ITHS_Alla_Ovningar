package me.ellebelle.ovningar1;

public class Ovning1_6 {
    public static void outWriteNumber() {
        int num = Integer.parseInt(IO.readln("Skriv ett heltal: "));

        if (num % 2 == 0) {
            IO.println("Ditt nr är jämnt.");
        }
        else {
            IO.println("Ditt nummer är udda.");
        }

        if (num == 0) {
            IO.println("Ditt tal är 0.");
        }
        else if (num < 0) {
            IO.println("Ditt tal är negativt.");
        }
        else {
            IO.println("Ditt tal är positivt.");
        }
    }
}

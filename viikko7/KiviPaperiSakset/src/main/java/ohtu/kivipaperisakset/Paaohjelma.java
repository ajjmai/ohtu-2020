package ohtu.kivipaperisakset;

import java.util.Scanner;

public class Paaohjelma {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\nValitse pelataanko" + "\n (a) ihmistä vastaan " + "\n (b) tekoälyä vastaan"
                    + "\n (c) parannettua tekoälyä vastaan" + "\nmuilla valinnoilla lopetataan");

            String vastaus = scanner.nextLine();
            if (vastaus.endsWith("a")) {
                ohjeistus();
                KPSPeli kaksinpeli = KPSPeli.luoPelaajaVsPelaajaPeli();
                kaksinpeli.pelaa();
            } else if (vastaus.endsWith("b")) {
                ohjeistus();
                KPSPeli yksinpeli = KPSPeli.luoTekoalyPeli();
                yksinpeli.pelaa();
            } else if (vastaus.endsWith("c")) {
                ohjeistus();
                KPSPeli pahaYksinpeli = KPSPeli.luoParempiTekoalyPeli();
                pahaYksinpeli.pelaa();
            } else {
                break;
            }

        }

    }

    private static void ohjeistus() {
        System.out.println("peli loppuu kun pelaaja antaa virheellisen siirron eli jonkun muun kuin k, p tai s");
    }
}

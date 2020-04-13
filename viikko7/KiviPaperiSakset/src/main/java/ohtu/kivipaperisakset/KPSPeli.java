package ohtu.kivipaperisakset;

import java.util.Scanner;

public abstract class KPSPeli {

    protected static final Scanner scanner = new Scanner(System.in);
    protected Tuomari tuomari;

    public static KPSPeli luoPelaajaVsPelaajaPeli() {
        return new KPSPelaajaVsPelaaja();
    }

    public static KPSPeli luoTekoalyPeli() {
        return new KPSTekoaly();
    }

    public static KPSPeli luoParempiTekoalyPeli() {
        return new KPSParempiTekoaly();
    }

    public void pelaa() {
        pelinAlustus();

        String ekanSiirto = ekanSiirto();

        String tokanSiirto = tokanSiirto();

        while (onkoOkSiirto(ekanSiirto) && onkoOkSiirto(tokanSiirto)) {
            tuomari.kirjaaSiirto(ekanSiirto, tokanSiirto);
            System.out.println(tuomari);
            System.out.println();

            ekanSiirto = ekanSiirto();
            tokanSiirto = tokanSiirto();
            asetaSiirto(ekanSiirto);
        }

        System.out.println();
        System.out.println("Kiitos!");
        System.out.println(tuomari);
    }

    protected String ekanSiirto() {
        System.out.print("Ensimmäisen pelaajan siirto: ");
        return scanner.nextLine();
    }

    protected abstract String tokanSiirto();

    protected abstract void pelinAlustus();

    protected abstract void asetaSiirto(String ekanSiirto);

    protected static boolean onkoOkSiirto(String siirto) {
        return "k".equals(siirto) || "p".equals(siirto) || "s".equals(siirto);
    }

}
package ohtu.kivipaperisakset;

public class KPSPelaajaVsPelaaja extends KPSPeli {

    @Override
    protected String tokanSiirto() {
        System.out.print("Toisen pelaajan siirto: ");
        return scanner.nextLine();
    }

    @Override
    protected void pelinAlustus() {
        this.tuomari = new Tuomari();
    }

    @Override
    protected void asetaSiirto(String ekanSiirto) {
    }
}
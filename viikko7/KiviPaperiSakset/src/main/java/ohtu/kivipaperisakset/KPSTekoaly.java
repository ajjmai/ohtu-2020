package ohtu.kivipaperisakset;

public class KPSTekoaly extends KPSPeli {
    private Tekoaly tekoaly;

    @Override
    protected String tokanSiirto() {
        String tokanSiirto = tekoaly.annaSiirto();
        System.out.println("Tietokone valitsi: " + tokanSiirto);
        return tokanSiirto;
    }

    @Override
    protected void pelinAlustus() {
        this.tuomari = new Tuomari();
        this.tekoaly = new Tekoaly();
    }

    @Override
    protected void asetaSiirto(String ekanSiirto) {
    }
}
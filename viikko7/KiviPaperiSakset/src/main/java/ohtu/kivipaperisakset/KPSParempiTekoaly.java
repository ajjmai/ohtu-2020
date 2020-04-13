package ohtu.kivipaperisakset;

// Kivi-Paperi-Sakset, jossa voidaan valita pelataanko vastustajaa
// vastaan vai ei
public class KPSParempiTekoaly extends KPSPeli {
    protected TekoalyParannettu tekoalyParempi;

    @Override
    protected String tokanSiirto() {
        String tokanSiirto = tekoalyParempi.annaSiirto();
        System.out.println("Tietokone valitsi: " + tokanSiirto);
        return tokanSiirto;
    }

    @Override
    protected void pelinAlustus() {
        this.tuomari = new Tuomari();
        this.tekoalyParempi = new TekoalyParannettu(20);
    }

    @Override
    protected void asetaSiirto(String ekanSiirto) {
        tekoalyParempi.asetaSiirto(ekanSiirto);
    }
}

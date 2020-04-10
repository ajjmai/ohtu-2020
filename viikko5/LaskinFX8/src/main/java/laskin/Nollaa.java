package laskin;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Nollaa extends Komento {

    private int edellinenTulos = 0;

    public Nollaa(TextField tuloskentta, TextField syotekentta, Button nollaa, Button undo, Sovelluslogiikka sovellus) {
        super(tuloskentta, syotekentta, nollaa, undo, sovellus);
    }

    private void setEdellinenTulos() {
        try {
            edellinenTulos = Integer.parseInt(tuloskentta.getText());
        } catch (Exception e) {
        }
    }

    @Override
    public void suorita() {
        setEdellinenTulos();
        sovellus.nollaa();
        setLaskunTulos();
    }

    @Override
    public void peru() {
        sovellus.plus(edellinenTulos);
        setLaskunTulos();
    }

}
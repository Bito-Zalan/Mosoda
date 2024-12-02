package model;

import java.util.ArrayList;
import java.util.Arrays;

public class Ruha {
    private String tulajdonosNeve;
    private boolean tiszta;

    public Ruha(String tulajdonosNeve) {
        this.tulajdonosNeve = tulajdonosNeve;
        this.tiszta = false;
    }


    public boolean getTiszta() {
        return tiszta;
    }


    public String getTulajdonosNeve() {
        return tulajdonosNeve;
    }


    public boolean isTiszta() {
        return tiszta;
    }


    public void setTiszta() {
        this.tiszta = true;
    }

    @Override
    public String toString() {
        return "Ruha tulajdonos: " + tulajdonosNeve + " | " + (tiszta ? "Tiszta" : "Nem tiszta");
    }
}

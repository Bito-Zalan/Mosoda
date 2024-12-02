package hu.szamalk;

import model.Ing;
import model.Mosoda;
import model.Ruha;

public class Main {
    public static void main(String[] args) {
        Mosoda mosoda = new Mosoda(5);

        Ruha ruha1 = new Ruha("Anna");
        Ruha ruha2 = new Ruha("Péter");
        Ruha ruha3 = new Ruha("Ferenc");

        Ing ing1 = new Ing("József",100.0);

        mosoda.bevesz(ruha1);
        mosoda.bevesz(ruha2);
        mosoda.bevesz(ruha3);
        mosoda.bevesz(ing1);

        mosoda.mos();
        System.out.println("Anna kiveszi a ruháját.");
        mosoda.kiad("Anna");


    }
}
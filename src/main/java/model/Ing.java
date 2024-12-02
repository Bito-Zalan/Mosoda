package model;

public class Ing extends Ruha{
    private double szinIntenzitas;

    public Ing(String tulajdonosNeve, double szinIntenzitas){
        super(tulajdonosNeve);
        this.szinIntenzitas = szinIntenzitas;

    }

    public void setMos(){
        this.szinIntenzitas =  szinIntenzitas*0.97;
    }

    @Override
    public String toString() {
        return "Ing tulajdonos: " + getTulajdonosNeve() + " | Színintenzitás: " + szinIntenzitas + " | " + (getTiszta() ? "Tiszta" : "Nem tiszta");
    }
}

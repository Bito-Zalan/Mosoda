package model;

public class Mosoda {
    private Ruha[] ruhak;
    private int db;

    public Mosoda() {
        this(5);
    }

    public Mosoda(int db) {
        this.ruhak = new Ruha[db];
    }

    public void bevesz(Ruha ruha) {
        if (db < ruhak.length) {
            ruhak[db++] = ruha;  
            System.out.println(ruha.getTulajdonosNeve() + " ruhája be lett véve a mosodába.");
        } else {
            System.out.println("A mosoda tele van, nem tudunk több ruhát felvenni.");
        }
    }

    public Ruha kiad(String tulajdonosneve) {
        int i = 0;
        while(i < db && !(ruhak[i].getTulajdonosNeve().equals(tulajdonosneve))){
            i++;
        }
        if(i < db){
            ruhak[i] = null;
            return ruhak[i];
        }else{
            return null;
        }
    }

    public int getDb(){
        return db;
    }

    public void mos() {
        System.out.println("A következő ruhák kerülnek mosásra:");
        for (int i = 0; i < db; i++) {
            System.out.println(ruhak[i]);

            if (ruhak[i] instanceof Ing) {
                Ing ing = (Ing) ruhak[i];
                ing.setMos();
            }
            ruhak[i].setTiszta();
        }
    }
}


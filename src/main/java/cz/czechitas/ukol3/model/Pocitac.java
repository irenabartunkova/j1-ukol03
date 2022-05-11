package cz.czechitas.ukol3.model;

public class Pocitac {

    private Boolean jeZapnuty = false;
    private Procesor cpu;
    private Pamet ram;
    private Disk pevnyDisk;


    public Procesor getCpu() {
        return cpu;
    }

    public void setCpu(Procesor cpu) {
        this.cpu = cpu;
    }

    public Pamet getRam() {
        return ram;
    }

    public void setRam(Pamet ram) {
        this.ram = ram;
    }

    public Disk getPevnyDisk() {
        return pevnyDisk;
    }

    @Override
    public String toString() {
        return "Pocitac{" +
                "jeZapnuty=" + jeZapnuty +
                ", cpu=" + cpu +
                ", ram=" + ram +
                ", pevnyDisk=" + pevnyDisk +
                '}';
    }

    public void setPevnyDisk(Disk pevnyDisk) {
        this.pevnyDisk = pevnyDisk;


    }

    public Boolean jeZapnuty() {
        return jeZapnuty;
    }


    public void zapniSe() {
        if (jeZapnuty()) {
            System.err.println("Počítač je už zapnutý");
        } else if (cpu == null || ram == null || pevnyDisk == null) {
            System.err.println("Počítač nemá některou z hlavních součástí");
        } else {
            jeZapnuty = true;
            System.out.println("Počítač se zapíná");
        }
    }

    public void vypniSe() {
        if (jeZapnuty()) {
            jeZapnuty = false;
            System.out.println("Počítač se vypíná");
        }

    }

    public void vytvorSouborOVelikost(long velikost) {
        if (jeZapnuty()) ;
        long zabraneMisto = pevnyDisk.getVyuziteMisto();
        long nedostatekMista = pevnyDisk.getVyuziteMisto() + velikost;

        if (nedostatekMista > pevnyDisk.getKapacitaDisku()) {
            System.err.println("Soubor se na disk nevejde");
        } else {
            pevnyDisk.setVyuziteMisto(nedostatekMista);
        }
    }

    public void vymazSouboryOVelikosti(long velikost) {
        if (jeZapnuty()) ;
        long zabraneMisto = pevnyDisk.getVyuziteMisto();
        long viceMista = zabraneMisto - velikost;
        if (viceMista < 0) {
            System.err.println("Nemůžeš smazat více než je velikost využitého místa");
        } else {
            pevnyDisk.setVyuziteMisto(viceMista);
        }


    }
}












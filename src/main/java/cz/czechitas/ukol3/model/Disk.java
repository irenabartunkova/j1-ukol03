package cz.czechitas.ukol3.model;

public class Disk {

    private Long kapacitaDisku;
    private Long vyuziteMisto;

    public long getKapacitaDisku() {
        return kapacitaDisku;
    }

    public void setKapacitaDisku(long kapacitaDisku) {
        this.kapacitaDisku = kapacitaDisku;
    }

    public long getVyuziteMisto() {
        return vyuziteMisto;
    }

    @Override
    public String toString() {
        return "Disk{" +
                "kapacitaDisku=" + kapacitaDisku +
                ", vyuziteMisto=" + vyuziteMisto +
                '}';
    }

    public void setVyuziteMisto(long vyuziteMisto) {
        this.vyuziteMisto = vyuziteMisto;


    }
}

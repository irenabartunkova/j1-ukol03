package cz.czechitas.ukol3.model;

public class Pamet {
    private Long kapacitaPameti;

    public Long getKapacitaPameti() {
        return kapacitaPameti;
    }

    @Override
    public String toString() {
        return "Pamet{" +
                "kapacitaPameti=" + kapacitaPameti +
                '}';
    }

    public void setKapacitaPameti(Long kapacitaPameti) {
        this.kapacitaPameti = kapacitaPameti;


    }
}

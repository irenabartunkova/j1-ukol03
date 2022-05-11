package cz.czechitas.ukol3;

import cz.czechitas.ukol3.model.Disk;
import cz.czechitas.ukol3.model.Pamet;
import cz.czechitas.ukol3.model.Pocitac;
import cz.czechitas.ukol3.model.Procesor;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {
        //TODO tady bude váš kód - vytvoření instance třídy Pocitac, zapnutí, vpynutí, výpis hodnot.

        /*Pocitac mujPocitac = new Pocitac();
        System.out.println(mujPocitac);
        mujPocitac.zapniSe();*/

        Pocitac mujPocitac = new Pocitac();

        Disk mujDisk = new Disk();
        mujDisk.setKapacitaDisku(118_111_600_640L);
        mujDisk.setVyuziteMisto(88_046_829_568L);

        Pamet mojePamet = new Pamet();
        mojePamet.setKapacitaPameti(8_000_000_000L);


        Procesor mujProcesor = new Procesor();
        mujProcesor.setRychlost(2_200_000_000L);
        mujProcesor.setVyrobce("Intel");



        System.out.println(mujDisk);
        System.out.println(mojePamet);
        System.out.println(mujProcesor);

        mujPocitac.setCpu(mujProcesor);
        mujPocitac.setPevnyDisk(mujDisk);
        mujPocitac.setRam(mojePamet);

        System.out.println(mujPocitac);

        mujPocitac.vytvorSouborOVelikost(80_000_000_000L);
        System.out.println();

        mujPocitac.vymazSouboryOVelikosti(300_000_000_000L);
        System.out.println();


        mujPocitac.zapniSe();
        mujPocitac.zapniSe();
        System.out.println(mujPocitac);
        mujPocitac.vypniSe();

        mujPocitac.vypniSe();
        mujPocitac.vypniSe();
    }

}

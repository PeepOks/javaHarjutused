package teema4;

import java.util.Arrays;

/**
 * Created by peep on 21.11.15.
 */
public class Meri {
    private int LauaServaPikkus;
    private Laev[] laevastik = new Laev[Main.laevu];

    public Meri(int pikkus) {
        LauaServaPikkus = pikkus;

        tekitaLaevastik();
        kuvaLaud();

    }

    private void tekitaLaevastik(){
        for (int i = 0; i < laevastik.length; i++) {
            laevastik[i] = new Laev(i+1, LauaServaPikkus);
        }
    }

    public boolean laevuOnAlles(){
        for (int i = 0; i < laevastik.length; i++) {
            boolean elus = laevastik[i].oledElus();
            if (elus) {
                return true;
            }
        }
        return false;
    }

    public boolean kasSaiPihta(int[] lask) {
        for (int i = 0; i < laevastik.length; i++) {
            boolean saipihta = laevastik[i].saidPihta(lask);
            if (saipihta){
                return true;
            }
        }
        return false;
    }

    public int mituLaevaOnAlles() {
        int laevu = 0;
        for (int i = 0; i < laevastik.length; i++) {
            if (laevastik[i].oledElus()==true){
                laevu++;
            }
        }
        return laevu;
    }

    public void kuvaLaud(){
        for (int i = 0; i < LauaServaPikkus; i++) {
            for (int j = 0; j < LauaServaPikkus; j++) {
                    boolean onLaev = kasLaevaOnSiin(i, j);
                    if(onLaev){
                        System.out.print(" 0 ");
                    } else{
                        System.out.print(" - ");
                    }
            }
            System.out.println();
        }
    }

    private boolean kasLaevaOnSiin(int i, int j) {
        for (int k = 0; k < laevastik.length; k++) {
            if(laevastik[k].oledSiin(i, j)){
                return true;
            }
        }
        return false;
    }
}

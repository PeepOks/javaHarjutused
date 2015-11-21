package teema4;

import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by peep on 21.11.15.
 */
public class Laev {
    private int laevaPikkus;
    private int[] kordinaadid;
    private boolean  elus = true;

    public Laev(int pikkus, int lauaServaPikkus) {
        laevaPikkus = pikkus;
        genereeriKordinaadid(lauaServaPikkus);
    }

    private void genereeriKordinaadid(int lauaServaPikkus) {
        Random rand = new Random();
        int x = rand.nextInt(lauaServaPikkus);
        int y = rand.nextInt(lauaServaPikkus);
        kordinaadid = new int[]{x,y};
        System.out.println(Arrays.toString(kordinaadid));

    }
    public boolean oledElus(){
        return elus;
    }

    public boolean saidPihta(int[]lasukoordinaat) {
        if (Arrays.equals(lasukoordinaat, kordinaadid)){
            elus = false;
            return true;
        }
        return false;
    }

    public boolean oledSiin(int i, int j) {
        if(kordinaadid[0]==i && kordinaadid[1]==j) {
            return true;
        }
        return false;
    }
}

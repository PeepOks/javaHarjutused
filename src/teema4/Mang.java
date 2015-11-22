package teema4;

/**
 * Created by peep on 21.11.15.
 */
public class Mang {
    //Konstruktor mis käivitub alati klassi välja kutsumisel.
    public Mang(){
        System.out.println("Hakkame mängima");

        /*
        * 1. Seadistame mängu
        */
        Meri meri = new Meri(Main.ruute);

        Mangija mangija = new Mangija();

        /*
        * 2. Hoimame mängu töös
        */

        while (meri.laevuOnAlles()){
            int [] lask = mangija.kuhuLasta();
            boolean pihtas = meri.kasSaiPihta(lask);
            if (pihtas) {
                mangija.pihtas();
            } else {
                mangija.moodas();
            }

            System.out.println("Laevu on alles " + meri.mituLaevaOnAlles());
        }
        /* 3. Kui mäng läbi siis mis saab.
        */
        mangija.gameOver();



    }


}

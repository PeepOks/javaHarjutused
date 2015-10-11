package teema1;

import java.util.Scanner;

/**
 * Juhuslikkus
 *
 * 1. Kirjutada mäng kull ja kiri.
 *    Programm küsib kasutajalt: kas kull või kiri? "Viskab" mündi ja
 *    teatab, kas kasutaja arvas õigesti või mitte.
 *    Vihje: ära hakka jändama Stringidega, küsi kasutajalt number.
 *
 * 2. Kirjutada liisu tõmbamise programm.
 *    Küsida kasutajalt inimeste arv. Väljastada juhuslik number vahemikus 1
 *    kuni arv (kaasaarvatud).
 *    NB! Kontrollida, et töötab õigesti: st. öeldes mitu korda järjest
 *    arvuks 3, peab võimalike vastuste hulgas olema nii ühtesid, kahtesid kui kolmi.
 *
 * 3. Kirjutada täringumäng:
 *    Programm viskab kaks täringut mängijale ja kaks täringut endale
 *    (arvutile), arvutab mõlema mängija silmade summad ja teatab,
 *    kellel oli rohkem.
 */
public class Harjutus3_Juhuslikkus {
    public static void main(String[] args) {

        //KullvoiKiri();
        //TombameLiisku();
        TaringuMang();

    }

    private static void KullvoiKiri(){
        System.out.println("1. Ülesanne");
        Scanner sc = new Scanner(System.in);
        System.out.println("Viskame kulli või kirja.  Kull on arv 0 ja kiri 1");
        System.out.println("Arv: ");
        int arvamus = sc.nextInt();
        int vise = (int) (Math.random()*2);
        System.out.println("Sina arvasid viskeks " + arvamus + " ja kullikirja viske tulemuseks on " + vise);
        if (arvamus == vise){
            System.out.println("Arvasid õigesti!");
        } else {
            System.out.println("Arvasid valesti!");
        }
    }

    private static void TombameLiisku(){
        System.out.println("2. Ülesanne");
        Scanner sc = new Scanner(System.in);
        System.out.println("Sisesta inimeste arv");
        System.out.print("Arv: ");
        int inimesteArv= sc.nextInt();
        System.out.println("Valituks osutus number " + ((int)(Math.random()*inimesteArv)+1) );
    }

    private static void TaringuMang (){
        System.out.println("3. Ülesanne");
        int mangijaSumma = taringuVise("Mängija");
        int arvutiSumma = taringuVise("Arvuti");

        if (arvutiSumma > mangijaSumma) {
            System.out.println("Arvuti viskas täringutel suurema summa");
        } else if (mangijaSumma > arvutiSumma){
            System.out.println("Mängija viskas täringutel suurema summa");
        } else if (mangijaSumma == arvutiSumma) {
            System.out.println("Arvuti ja Mängija viskasid täringutel võrdse summa");
        }
    }

    public static int taringuVise(String mangijaNimi){
        int viskeSumma = 0;
        for (int i=0; i<2;i++){
            int vise = (int)(Math.random()*6) + 1;
            System.out.println(mangijaNimi + " viskas täringul " + vise);
            viskeSumma = viskeSumma + vise;
        }
        System.out.println(mangijaNimi + " täringu visete summa on " + viskeSumma);
        return viskeSumma;

    }

}

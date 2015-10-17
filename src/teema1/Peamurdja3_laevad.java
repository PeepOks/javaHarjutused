package teema1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * NB! Lahenda käesolev ülesanne konsoolis. Pole vaja JavaFXi siia segada.
 *
 * 1. Kirjuta lihtne laevade pommitamise mäng, kus arvuti genereerib 1x1
 *    laevad mööda 1 dimensioonilist lauda. See tähendab, et mängulaud
 *    ei ole mitte ruudustik, vaid üks rida.
 *
 * 2. Täienda mängu nii, et nüüd oleks laual ruudustik.
 *
 * 3. Kas oskad ka nii, et laevad ei ole 1x1 vaid 1x2 ja 1x3 ja orienteeruvad
 *    nii vertikaalselt kui ka horisontaalselt?
 */
public class Peamurdja3_laevad {

    public static void main(String[] args) {

        int[][] Ruudustik = new int[10][10];

        for(int i=0; i<Ruudustik.length;i++){

            for (int j=0; j<Ruudustik.length;j++){
                Ruudustik[i][j]= 0;
            }
        }

        for (int i = 0; i < 10; i++) {
            Ruudustik[(int)(Math.random()*10)][(int)(Math.random()*10)]= 1;
        }

        for (int i = 0; i < Ruudustik.length; i++) {
            System.out.println(Arrays.toString(Ruudustik[i]));
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Sisesta x kordinaat");
        int xkoordinaat = sc.nextInt();
        System.out.println("Sisesta x kordinaat");
        int ykoordinaat = sc.nextInt();

        /*
        while (gameover(Ruudustik)) {
            System.out.println("Sisesta üks nr");
            int sisestus=kasutaja.nextInt();
            int hit=laud[sisestus];
            if(hit==0){
                System.out.println("mööda");
            } else if (hit==1){

                System.out.println("pihtas");
                laud[sisestus]=2;
            } else if (hit==2) {
                System.out.println("juba proovisid");
            }
        }
        */
        System.out.println("võitsid");
        /*
        for (int i=0; i < Ruudustik.length;i++){
            for (int j=0; j<Ruudustik[i].length;j++){

                if (Ruudustik[i][j]==0){

                }else if (Ruudustik[i][j]==1){
                    System.out.println("Laev oli ruudul [" + i +"]["+j+"]");
                    Ruudustik[i][j]=0;
                    System.out.println("Aga lasime põhja :)");
                }

            }
        }
        */


    }
    public static boolean gameover(int[][]laud){
        for (int i=0; i < laud.length;i++){
            for (int j=0; j<laud[i].length;j++){

                if (laud[i][j]==0){
                    return true;
                }

            }
        }
        return false;
    }


}

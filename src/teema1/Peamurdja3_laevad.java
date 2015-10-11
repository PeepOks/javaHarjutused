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


        for (int i=0; i < Ruudustik.length;i++){
            for (int j=0; j<Ruudustik[i].length;j++){

                if (Ruudustik[i][j]==0){

                }else if (Ruudustik[i][j]==1){
                    System.out.println("Laev oli ruudul [" + i +"]["+j+"]");
                    Ruudustik[i][j]=0;
                    System.out.println("Aga lasime põhja");
                }

            }
        }


    }


}

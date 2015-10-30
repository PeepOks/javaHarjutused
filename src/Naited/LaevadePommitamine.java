package Naited;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by peep on 30.10.15.
 */
public class LaevadePommitamine {
    static int [][] laud;
    static int lauaLaius = 10;
    static int lauaKorgus = 10;
    static int laevadeArv = 10;
    static HashMap<String, Integer> guess = new HashMap<String, Integer>();
    public static void main(String[] args) {
        // Genereerida Mängulaud
        laud = GenerateBoard(lauaLaius,lauaKorgus);
        //Täida lauda laevadega
        laud = FillWithShips(laevadeArv,laud);
        //Näita vahepeal lauda
        ShowBoard(laud);
        //Küsi kuhu pommitada
        System.out.println("Mis sa arvad mis ruudul on laev?");
        guess = WhereToBomb();
        //Pommitamise tulemus
        ResultOfBombing(guess);
        //Kontrollida kas on veel laevu
        AnyShipsLeft();
        //Kui laevad otsas siis mäng
        //if(/*kui laevu pole enam*/){
            //end game
        //}
    }

    private static boolean AnyShipsLeft() {
        int laevu = 0;
        for (int i = 0; i < laud.length; i++) {
            for (int j = 0; j < laud[i].length; j++) {
                if (laud[i][j] == 1) {
                    laevu++;
                }
            }
        }
        System.out.println("veel on alles " + laevu);
        if (laevu>0){
            return true;
        }
        return false;
    }

    private static boolean ResultOfBombing(HashMap guess) {
        System.out.print("Sa arvasid, et laev on koordinaatodel " + guess.get("x-koordinaat") + " ja " + guess.get("y-koordinaat"));
        if (laud[((int) guess.get("x-koordinaat"))][(int)guess.get("y-koordinaat")]== 1){
            System.out.println(" ja arvasid õigesti!!!");
            laud[(int)guess.get("x-koordinaat")][(int)guess.get("y-koordinaat")]= 2;
            return true;
        } else if (laud[(int)guess.get("x-koordinaat")][(int)guess.get("y-koordinaat")]== 0){
            System.out.println(" ja arvasid valesti!");
            return false;
        } else if (laud[(int)guess.get("x-koordinaat")][(int)guess.get("y-koordinaat")]== 2) {
            System.out.println(" aga seal oli juba laev mille lasid selle ennem põhja!");
            return false;
        }
        return false;
    }


    private static HashMap WhereToBomb() {
        HashMap LocationGuess = new HashMap();
        Scanner UserInput = new Scanner(System.in);
        System.out.println("Arva kus on laev");
        System.out.print("Sisesta x koordinaat: ");
        LocationGuess.put("x-koordinaat", UserInput.nextInt());
        System.out.print("Sisesta y koordinaat: ");
        LocationGuess.put("y-koordinaat", UserInput.nextInt());
        return LocationGuess;
    }

    private static void ShowBoard(int [][]mangulaud) {
        for (int i = 0; i < mangulaud.length; i++) {
            for (int j = 0; j < mangulaud[i].length ; j++) {
                System.out.print(mangulaud[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] FillWithShips(int laevadearv, int[][] laud) {
        for (int i = 0; i < laevadearv; i++) {
            laud[(int)(Math.random()*10)][(int)(Math.random()*10)] = 1;
        }
        return laud;
    }

    private static int[][] GenerateBoard(int a, int b) {
        laud = new int[a][b];
        for (int i = 0; i < laud.length ; i++) {
            for (int j = 0; j < laud[i].length ; j++) {
                laud[i][j]=0;
            }
        }
        return laud;
    }
}

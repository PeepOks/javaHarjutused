package teema4;

import java.util.Scanner;

/**
 * Created by peep on 21.11.15.
 */
public class Mangija {
    Scanner sc = new Scanner(System.in);

    public int[] kuhuLasta() {
        /*int[] koordinaat = new int[2];
        System.out.println("Kus on laev?");
        System.out.println("Sisesta X koordinaat");
        koordinaat[0]=sc.nextInt();
        System.out.println("Sisesta Y koordinaat");
        koordinaat[1]=sc.nextInt();
        return koordinaat;
        */
        System.out.println("Sisesta koordinaadid kuhu kõmmutada formaadis xxx-yyy");
        String[] input = sc.nextLine().split("-");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        return new int[]{x,y};

    }

    public void pihtas() {
        System.out.println("Said laevale pihta");
    }

    public void moodas() {
        System.out.println("Lasid mööda");
    }


    public void gameOver() {
        System.out.println("Mäng sai läbi");
    }
}

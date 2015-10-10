package teema1;

import java.util.Scanner;

/**
 * 1. Kirjutada meetod, mis tagastab parameetrina etteantud arvu kuubi.
 * 2. Kirjutada meetod, mis saab parameetritena kaks arvu (vahemiku) ning
 *    tagastab kasutaja sisestatud arvu, juhul kui see on lubatud vahemikus.
 *    Senikaua, kui kasutaja sisestab midagi ebasobivat, käseb meetod kasutajal
 *    arvu uuesti sisestada.
 */
public class Harjutus2_meetodid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Ülesanne");
        System.out.println("Sisesta täisarv: ");
        int arv = sc.nextInt();;
        System.out.println("Arvu " + arv + " kuup on " + tostaKuupi(arv));

        System.out.println("2. Ülesanne");
        System.out.println("sobiv arv on: " + kasutajaSisestus("Sisesta arv vahemikus 5 kuni 10", 5, 10));

    }

    public static int tostaKuupi(int arv) {
        int arvKuubis = arv*arv*arv;
        return arvKuubis;
    }

    public static int kasutajaSisestus(String kysimus, int min, int max) {

        System.out.println(kysimus + ": ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Arv: ");
        int arv = sc.nextInt();

        while (arv < min | arv > max) {
            System.out.println("Arv " + arv + " ei sobi. Sisesta õige number.");
            System.out.print("Arv: ");
            arv = sc.nextInt();
        }
        return arv;
    }
}

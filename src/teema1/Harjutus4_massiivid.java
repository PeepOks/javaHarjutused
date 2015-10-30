package teema1;

import java.util.*;

/**
 * 1. Salvesta kasutajalt 10 numbrit ja sorteeri suuruse järgi. (int[])
 * 2. Salvesta kasutajalt 10 sõne ja sorteeri tähestikulises järjekorras. (String[])
 * 3. Salvesta kasutajalt x arv numbreid, lõpeta küsimine kui number on 0
 *    ja sorteeri tulemus suuruse järgi. (ArrayList)
 *
 * main() meetodi saad lühendiga psvm.
 */
public class Harjutus4_massiivid {

    public static void main(String[] args) {
        System.out.println("Esimene ülesanne:");
        yl1();
        System.out.println("Teine ülesanne:");
        //yl2();
        System.out.println("Kolmas ülesanne");
        //yl3();
    }

    private static void yl1 (){
        int massiiv[]=new int[10];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i <massiiv.length ; i++) {
            System.out.print("Sisesta " + (i + 1) + " täisarv: ");
            massiiv[i]=input.nextInt();
        }
        Arrays.sort(massiiv);
        System.out.println(Arrays.toString(massiiv));
    }

    private static void yl2() {
        String soned[] = new String[10];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i <soned.length ; i++) {
            System.out.print("Sisesta " + (i + 1) + " sõne: ");
            soned[i]=input.next();
        }
        Arrays.sort(soned);
        System.out.println(Arrays.toString(soned));
    }
    private static void yl3(){
        ArrayList<Integer> massiiv = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        System.out.print("Sisesta 1. täisarv: ");
        int sisestus=input.nextInt();
        while (true){
            if (sisestus!=0) {
                massiiv.add(sisestus);
            } else{
                break;
            }
            System.out.print("Sisesta järgmine täisarv: ");
            sisestus = input.nextInt();
        }
        Collections.sort(massiiv);
        for(int counter: massiiv){
            System.out.println(counter);
        }
    }
}

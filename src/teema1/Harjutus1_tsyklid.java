package teema1;

/**
 * Kasutades tsükleid, lahendada järgmised ülesanded:
 * 1. Trükkida ekraanile numbrid 10 kuni 1
 * 2. Trükkida ekraanile paaritud arvud vahemikus 0 kuni 10
 * 3. Trükkida ekraanile selline tabel:
 *    0 1 2 3 4 5 6 7 8 9
 *    1 2 3 4 5 6 7 8 9 0
 *    2 3 4 5 6 7 8 9 0 1
 *    3 4 5 6 7 8 9 0 1 2
 *    4 5 6 7 8 9 0 1 2 3
 *    5 6 7 8 9 0 1 2 3 4
 *    6 7 8 9 0 1 2 3 4 5
 *    7 8 9 0 1 2 3 4 5 6
 *    8 9 0 1 2 3 4 5 6 7
 *    9 0 1 2 3 4 5 6 7 8
 */
public class Harjutus1_tsyklid {
    public static void main(String[] args) {
        yl1();
        System.out.println();
        yl2();
        System.out.println();
        yl3();

    }

        private  static void yl1(){
            System.out.println("1. Ülesanne");
            for(int i=10; i>0; i--){
                System.out.print(i + " ");
            }
            System.out.println();
        }
        public static void yl2(){
            System.out.println("2. Ülesanne");

            for (int i=0; i<10;i++){
                if (i%2!=0){
                    System.out.print(i + " ");
                }

            }
            System.out.println();
        }
        public static void yl3(){
            System.out.println("3. Ülesanne");
            int arv;
            for (int i = 0; i < 10; i++) {
                arv = i;
                for (int j = 0; j < 10; j++) {
                    System.out.print(arv + " ");
                    arv++;
                    if (arv == 10) {
                        arv = 0;
                    }
                }

                System.out.println();
            }
            System.out.println();
        }


}


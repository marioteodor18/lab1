import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println("--- Problema 1.7.1 ---");
        String text = "A inceput scoala.";
        System.out.println(inverseazaString(text));


        System.out.println("\n--- Problema 1.7.2 ---");
        rezolvaProblemaListelor();


        System.out.println("\n--- Problema 1.7.3 a) ---");
        deseneazaDreptunghi(4, 5);


        System.out.println("\n--- Problema 1.7.3 b) ---");
        deseneazaDiagonale(5);
    }

    public static String inverseazaString(String input) {
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();
    }


    public static void rezolvaProblemaListelor() {
        Random rand = new Random();
        List<Integer> lista1 = new ArrayList<>();
        List<Integer> lista2 = new ArrayList<>();


        for (int i = 0; i < 10; i++) {

            lista1.add(rand.nextInt(21) + 5);
        }


        for (int num : lista1) {
            if (num >= 10 && num <= 20) {
                lista2.add(num);
            }
        }

        // Afisarea listelor si a valorilor min/max[cite: 7]
        System.out.println("Lista initiala [5..25]: " + lista1);
        System.out.println("Lista filtrata [10..20]: " + lista2);

        System.out.println("Min/Max Lista initiala: " + Collections.min(lista1) + " / " + Collections.max(lista1));
        if (!lista2.isEmpty()) {
            System.out.println("Min/Max Lista filtrata: " + Collections.min(lista2) + " / " + Collections.max(lista2));
        } else {
            System.out.println("Lista filtrata nu conține elemente.");
        }
    }

    // Funcția pentru 1.7.3 a) - Forma rectangulara n x m[cite: 7]
    public static void deseneazaDreptunghi(int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // Afișăm '*' doar pe marginile dreptunghiului[cite: 7]
                if (i == 0 || i == n - 1 || j == 0 || j == m - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Funcția pentru 1.7.3 b) - Diagonale într-o formă pătratică n x n[cite: 7]
    public static void deseneazaDiagonale(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Condiția pentru diagonala principală (i == j) și cea secundară (i + j == n - 1)[cite: 7]
                if (i == j || i + j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
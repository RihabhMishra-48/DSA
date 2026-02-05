package loops;
import java.util.Scanner;

public class ith_element {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int[] a = new int[n];
            int[] product = new int[n];


            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }


            int totalProduct = 1;
            for (int i = 0; i < n; i++) {
                totalProduct *= a[i];
            }


            for (int i = 0; i < n; i++) {
                product[i] = totalProduct / a[i];
            }


            for (int i = 0; i < n; i++) {
                System.out.print(product[i] + " ");
            }
    }
}

// given an array elemets check if their exist a pair i,j such that array[i[+array[j]==k and i is not equals to j

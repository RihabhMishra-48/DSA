import java.util.Scanner;

class reverse_array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int start = 0;
        int end = n - 1;
        int temp;

        while (start < end) {
            temp = a[start];
            a[start] = a[end];
            a[end] = temp;

            start++;
            end--;
        }

        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}

package loops;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class sum_of_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] a = new int[5];
        for(int i=0;i<a.length;i++){
            System.out.println("enter the element: ");
            a[i]=sc.nextInt();
        }
        int sum =0;
        for (int i=0;i<a.length;i++){
           sum += a[i];
        }

        for(int i =0; i<a.length;i++){
            System.out.println(a[i]);
        }System.out.print(sum);
    }


}

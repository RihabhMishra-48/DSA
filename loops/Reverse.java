package loops;
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int Reversed=0;
        for (; n!=0;)
        {
            int num= n%10;
            n/=10;

            Reversed=Reversed*10+num;
        }
        System.out.println(Reversed);
    }

    
}

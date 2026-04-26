package loops;
import java.util.Scanner;
public class reverse_permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr= new int[n+1];
        int [] reverse=new int[n+1];
        for(int i=1; i<=n;i++){
            arr[i]=sc.nextInt();
        }
        for(int j=1; j<=n; j++){
            reverse[arr[j]]=j;}

        for (int i=1;i<=n;i++){
            System.out.print(reverse[i] + " ");
        }
    }

}

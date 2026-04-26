package loops;
//write a program to create an array a stores 5 elemets then after print the elemets of the array with the help of java
//public class array {
//    public static void main(String[] args) {
//        int[] array= new int[5];
//        array[0]=5;
//        array[1]=4;
//        array[2]=3;
//        array[3]=2;
//        array[4]=1;
//
//        for (int i=1; i< array.length; i++){
//            System.out.println(array[i]);
//        }
//
//    }
//}
//write a java program to read from user
//import java.util.Scanner;
//public class array {
//    public static void main(String[] args) {
//        int[] array= new int[5];
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter 5 elements:");
//        for (int i = 0; i < array.length; i++) {
//            array[i] = sc.nextInt();
//        }
//
//        for (int i=0; i< array.length; i++){
//            System.out.println(array[i]);
//        }
//
//    }
//}

//write a program to create an array a and store 5 elements in it from user input , print 1st and last element of array
//write a program to create an array aand store 5 elements in this array then after inserting any element at the beigning of array then print the array

import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        int[] a= new int[5];
        Scanner sc = new Scanner(System.in);



        System.out.println("Enter the elements:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }


        for (int i = 4; i > 0; i--) {
            a[i] = a[i - 1];
        }

        System.out.println("enter the first element");
        a[0]=sc.nextInt();

        for (int i=0; i< a.length; i++){
            System.out.println(a[i]);
        }

    }
}
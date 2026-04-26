package loops;


import java.util.Scanner;

public class Stack_loop {
    public static void main(String[] args) {


        //Write a program to implement a stack with the help of array
        //and perform operations push , pop and display


                Scanner sc = new Scanner(System.in);


                System.out.print("Enter size of stack: ");
                int n = sc.nextInt();

                int[] stack = new int[n];
                int top = -1;

                int choice;

                do {
                    System.out.println("\n1. Push");
                    System.out.println("2. Pop");
                    System.out.println("3. Display");
                    System.out.println("4. Exit");
                    System.out.print("Enter your choice: ");
                    choice = sc.nextInt();

                    switch (choice) {

                        case 1:
                            if (top == n - 1) {
                                System.out.println("Stack Overflow");
                            } else {
                                System.out.print("Enter element: ");
                                int x = sc.nextInt();
                                top++;
                                stack[top] = x;
                                System.out.println("Pushed: " + x);
                            }
                            break;

                        case 2:
                            if (top == -1) {
                                System.out.println("Stack Underflow");
                            } else {
                                int val = stack[top];
                                top--;
                                System.out.println("Popped: " + val);
                            }
                            break;

                        case 3:
                            if (top == -1) {
                                System.out.println("Stack is empty");
                            } else {
                                System.out.println("Stack elements:");
                                for (int i = top; i >= 0; i--) {
                                    System.out.println(stack[i]);
                                }
                            }
                            break;
                        case 4:
                            System.out.println("Exited");


                        default:
                            System.out.println("Invalid choice");
                    }

                } while (choice != 4);


            }
        }
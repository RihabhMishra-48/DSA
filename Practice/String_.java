package loops;
import java.util.Scanner;
import java.util.Stack;
//you have a string denoted as A to transform the string yu should perform the following peration : 1. identify
// the first occurence of consecutive identical pairs of characters within the string
// 2. remove this pair of the identical characters from the string
// 3. Repeat step 1 and 2 until there are no more consecutive identical pairs of characters
// the final result will be the transformed string
public class String_ {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String A = sc.nextLine();
        Stack<Character> st=new Stack<>();
        // create an empty stack
        //traverse from left to right
        //from each step if stack is not empty and top of the stack is equals to the current character then remove
        // the top element else push the current character into the stack
        //repeat util all characters are traversed and convert stack to string
        



        for (int i=0; i<A.length(); i++){
            char c = A.charAt(i);
            if (!st.isEmpty() && st.peek() == c){
                st.pop();
            } else {
                st.push(c);
            }
            
            for (char ch : st) {
                System.out.print(ch);
            }

   
    }}
}

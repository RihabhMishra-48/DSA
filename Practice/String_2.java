package loops;
// given a string A denoting an expression it contains the following operators +-*/ , check whether A has
// redundant braces or not
// NOte:- A will always be a valid expression ad will not contain any white spaces
// Do it using Stack
public class String_2 {

    public static void main(String[] args) {
        String A = "((a+b))";
        Stack<Character> st = new Stack<>();
        boolean redundant = false;

        for (int i = 0; i < A.length(); i++) {
            char c = A.charAt(i);

            if (c == '(' || c == '+' || c == '-' || c == '*' || c == '/') {
                st.push(c);
            } else if (c == ')') {
                if (st.isEmpty()) {
                    redundant = true;
                    break;
                }
                char top = st.pop();
                boolean hasOperator = false;

                while (!st.isEmpty() && top != '(') {
                    if (top == '+' || top == '-' || top == '*' || top == '/') {
                        hasOperator = true;
                    }
                    top = st.pop();
                }

                if (!hasOperator) {
                    redundant = true;
                    break;
                }
            }
        }

        if (redundant) {
            System.out.println("Redundant braces found.");
        } else {
            System.out.println("No redundant braces.");
        }
    }

}

/** Problem statement:

* Given a string of balanced expression, find if it contains a redundant parenthesis or not. A set of parentheses is redundant if the same sub-expression is surrounded by unnecessary or multiple brackets. Print "Yes" if redundant else "No".

* Input:

* The first line of input contains an integer T denoting the number of test cases. The next line T contains an expression. The expression contains all characters and ^, *, /, +, -.

* Output:

* For each test case, in a new line, print YES or NO if the expression is redundant or not.

**/
//Approach
//The idea is to use the stack to keep track of the opening and closing brackets.
//If we remove any subexpression from the given string which is enclosed by “()” and after that,
//if there exist any pair of opening and closing brackets“()” which does not have any operator(‘+’,’-’,’*’,’/’) in between them, 
//then the expression will have a redundant pair of brackets.

//The steps are as follows :
// 1.Define a stack, for keeping track of pairs of opening and closing brackets, let’s say ‘BRACKETS’.
// 2. Iterate through the string and whenever we encounter an opening bracket or an operator ‘(’, ‘+’, ‘-’, ‘*’, ‘/’,  we will push the current character to the stack.
// 3. Whenever we encounter ‘)’ in the string
//Now we will pop characters from the stack until we pop an opening bracket ‘(‘  from the stack.
//If we find any operator ( { ‘+’, ‘-’, ‘*’, ‘/’ } )  before encountering ‘(’ then the current bracket is not redundant.
//If we do not find any operator, then the current bracket is redundant. Hence we will return true.
//If there is no redundant bracket, then return false.
public class RedundantBraces{
 static boolean checkRedundancy(String s) {
        // create a stack of characters
        Stack<Character> st = new Stack<>();
        char[] str = s.toCharArray();
        // Iterate through the given expression
        for (char ch : str) {
 
            // if current character is close parenthesis ')'
            if (ch == ')') {
                char top = st.peek();
                st.pop();
 
                // If immediate pop have open parenthesis '('
                // duplicate brackets found
                boolean flag = true;
 
                while (top != '(') {
 
                    // Check for operators in expression
                    if (top == '+' || top == '-'
                            || top == '*' || top == '/') {
                        flag = false;
                    }
 
                    // Fetch top element of stack
                    top = st.peek();
                    st.pop();
                }
 
                // If operators not found
                if (flag == true) {
                    return true;
                }
            } else {
                st.push(ch); // push open parenthesis '(',
            }                // operators and operands to stack
        }
        return false;
    }
}

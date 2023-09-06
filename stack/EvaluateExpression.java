/** An arithmetic expression is given by a string array A of size N. 
  * Evaluate the value of an arithmetic expression in Reverse Polish Notation.
  * Valid operators are +, -, *, /. Each string may be an integer or an operator.
  * Input 1:
  *  A =   ["2", "1", "+", "3", "*"]
  * Output = (2+1)*3 = 9
  /**
public class EvaluateExpression {
    public int evalRPN(ArrayList<String> A) {
        Stack<Integer> stack = new Stack<Integer>();
        for(int index= 0;index < A.size(); index++){
            String value = A.get(index);
            if(value.equals("+") || value.equals("-") || value.equals("*") || value.equals("/")){
                int val1 = stack.pop();
                int val2 = stack.pop();
 
                switch (value) {
                case "+":
                    stack.push(val2 + val1);
                    break;
                case "-":
                    stack.push(val2 - val1);
                    break;
                case "/":
                    stack.push(val2 / val1);
                    break;
                case "*":
                    stack.push(val2 * val1);
                    break;
                } 
            }else{
                stack.push(Integer.valueOf(value));
            }
        }
        return stack.pop();
    }
}

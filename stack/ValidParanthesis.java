/**
* Declare an empty stack.
* Now start traversing the input string.
* If you come across an opening bracket while traversing the string, add it to the stack.
* Else the current character is a closing bracket. In this case, check to see if the top element of the stack is of the corresponding opening type and if it is then pop the top element from the stack and if not, then return false.
* If the stack is empty after traversing the string, return 1; otherwise, return 0.
/**
public class ValidParanthesis{
public int solve(String A) {
        Stack<Character> opening_Brackets = new Stack<Character>();  
        for(int i = 0;i<A.length();i++){
            char symbol = A.charAt(i);
            if(symbol == '{' || symbol == '[' || symbol == '('){
                opening_Brackets.push(symbol);
            }else{
                if(opening_Brackets.empty()){
                    return 0;
                }
                if(symbol == '}' && opening_Brackets.pop() != '{'){
                    return 0;
                }
                 if(symbol == ']' && opening_Brackets.pop() != '['){
                    return 0;
                }
                 if(symbol == ')' && opening_Brackets.pop() != '('){
                    return 0;
                }
                
            }
        }
        return opening_Brackets.empty()?1:0;
    }
}

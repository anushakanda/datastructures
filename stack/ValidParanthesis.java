/**
* Declare an empty stack.
* Now start traversing the input string.
* If you come across an opening bracket while traversing the string, add it to the stack.
* Else the current character is a closing bracket. In this case, check to see if the top element of the stack is of the corresponding opening type and if it is then pop the top element from the stack and if not, then return false.
* If the stack is empty after traversing the string, return true; otherwise, return false.
/**
public class ValidParanthesis{
bool is_BalancedParentheses(string str) {
    int x = str.size(); // storing size of input expression
    stack<char> opening_Brackets;
    // iterating over the full expression using for loop
    for (int k = 0; k < x; k++) {
        // if opening bracket encounters then directly push it into stack.
        if (str[k] == '{' || str[k] == '(' || str[k] == '[') {
	        opening_Brackets.push(str[k]);
		    }else {
            // If stack is empty return false
            if (opening_Brackets.empty()) {
	           return false;
	           }
            // If ) is encountered then check if top of the stack have ( or not      
	          if (str[k] == ')') {
		            char last = opening_Brackets.top();
	            	opening_Brackets.pop();
		             if (last != '(') {
	               return false;
		             }
	          }
           // If } is encountered then check if top of the stack have { or not   
	         if (str[k] == '}') {
		          char last = opening_Brackets.top();
		          opening_Brackets.pop();
		          if (last != '{') {
		             return false;
		           }
	          }
         // If ] is encountered then check if top of the stack have [ or not
	        if (str[k] == ']') {
               char last = opening_Brackets.top();
		           opening_Brackets.pop();
		           if (last != '[') {
                   return false;
			 	      }
			    }
		   }
     }
  	return opening_Brackets.empty();

	}
}

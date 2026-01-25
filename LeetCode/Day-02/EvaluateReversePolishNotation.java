// You are given an array of strings tokens that represents an arithmetic expression in a Reverse Polish Notation.

// Evaluate the expression. Return an integer that represents the value of the expression.

// Note that:

// The valid operators are '+', '-', '*', and '/'.
// Each operand may be an integer or another expression.
// The division between two integers always truncates toward zero.
// There will not be any division by zero.
// The input represents a valid arithmetic expression in a reverse polish notation.
// The answer and all the intermediate calculations can be represented in a 32-bit integer.

class Solution {
    public int evalRPN(String[] tokens) 
    {
        Stack<Integer> stack = new Stack<>();
        int n = tokens.length;
        int right,left;

        for( int i = 0 ; i < n ; i++ )
        {
            if( tokens[i].equals("+") )
            {
                right = stack.pop();
                left = stack.pop();
                stack.push( left + right );
            }
            else if( tokens[i].equals("-") )
            {
                right = stack.pop();
                left = stack.pop();
                stack.push( left - right );
            }
            else if( tokens[i].equals("*") )
            {
                right = stack.pop();
                left = stack.pop();
                stack.push( left * right );
            }
            else if( tokens[i].equals("/") )
            {
                right = stack.pop();
                left = stack.pop();
                stack.push( left / right );
            }
            else
            {
                stack.push(Integer.parseInt(tokens[i]));
            }

        }

        return stack.pop();
    }
}
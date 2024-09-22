package Stack.infix_prefix_evaluations;
import java.util.Stack;

public class postfix_evaluation {
    public static void main(String[] args) {
        // Input will be of type string with spaces
        String equation = "10 2 * 3 5 * + 9 -";
        equation = equation + " ";

        Stack<Integer> stack = new Stack<>();
        String s = "";
        int l = equation.length();

        for(int i = 0; i < l; i++) {
            char c = equation.charAt(i);
            if(c != ' ') {
                s = s + c;  // Form the number or operator
            } else {
                if(s.length() > 0) {
                    if(isOperator(s)) {
                        // Pop two elements and perform operation
                        int b = stack.pop();
                        int a = stack.pop();
                        int result = performOperation(a, b, s);
                        stack.push(result);
                    } else {
                        // Push number to stack
                        stack.push(Integer.parseInt(s));
                    }
                    s = "";  // Reset the string for next operand/operator
                }
            }
        }
        // Final result will be the only element in the stack
        System.out.println("Result: " + stack.pop());
    }

    // Helper function to check if string is an operator
    public static boolean isOperator(String s) {
        return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/");
    }

    // Helper function to perform an operation
    public static int performOperation(int a, int b, String operator) {
        switch(operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if(b == 0) {
                    throw new ArithmeticException("Division by zero is not allowed.");
                }
                return a / b;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}

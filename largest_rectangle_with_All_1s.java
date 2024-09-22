package Stack;

import java.util.Scanner;
import java.util.Stack;

public class largest_rectangle_with_All_1s {

    // Main method
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        System.out.println("Enter number of rows:");
        int r = ob.nextInt();
        System.out.println("Enter number of columns:");
        int c = ob.nextInt();

        int[][] matrix = new int[r][c];

        System.out.println("Enter the matrix elements (0 or 1):");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = ob.nextInt();
            }
        }

        // Call the function to find the largest rectangle of all 1s
        int maxArea = maxRectangle(r, c, matrix);
        System.out.println("Maximum rectangle area with all 1s: " + maxArea);
    }

    // Function to compute the area of the largest rectangle with all 1s
    static int maxRectangle(int R, int C, int[][] A) {
        // Calculate area for first row and initialize it as result
        int result = maxHist(C, A[0]);

        // Iterate over rows to find maximum rectangular area considering each row as histogram
        for (int i = 1; i < R; i++) {
            for (int j = 0; j < C; j++) {
                // If A[i][j] is 1, add A[i - 1][j]
                if (A[i][j] == 1) {
                    A[i][j] += A[i - 1][j];
                }
            }
            // Update result if area with current row (as last row of rectangle) is more
            result = Math.max(result, maxHist(C, A[i]));
        }
        return result;
    }

    // Function to calculate the largest rectangle area in a histogram
    static int maxHist(int C, int[] row) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int i = 0;

        while (i < C) {
            if (stack.isEmpty() || row[stack.peek()] <= row[i]) {
                stack.push(i++);
            } else {
                int top = stack.pop();
                int area = row[top] * (stack.isEmpty() ? i : i - stack.peek() - 1);
                maxArea = Math.max(maxArea, area);
            }
        }

        while (!stack.isEmpty()) {
            int top = stack.pop();
            int area = row[top] * (stack.isEmpty() ? i : i - stack.peek() - 1);
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }
}

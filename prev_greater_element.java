package Stack;

import java.util.ArrayDeque;
import java.util.Scanner;

public class prev_greater_element {
    public static void main(String[] args) {
        {
            System.out.println("enter length of array");
            Scanner ob = new Scanner(System.in);
            int n = ob.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = ob.nextInt();
            }

            //naive solution
            /*
            for (int i = 0; i < n ; i++) {
                int j;
                for ( j = i - 1; j >=0; j--) {
                    if (a[j] > a[i]) {
                        System.out.println(a[j]);
                        return;
                    }

                    }
                if(j==-1)
                {
                    System.out.println(-1);
                }


                }
            }
*/
            //optimised
            ArrayDeque<Integer> nums = new ArrayDeque<>();
            nums.push(a[0]);
            System.out.println(-1); //0th element always -1
            for (int i = 1; i < n; i++) {
                while (nums.isEmpty() == false && nums.peek() <= a[i]) {
                    nums.pop();
                }
                int pg = (nums.isEmpty() ? -1 : nums.peek());
                System.out.println(pg);
                nums.push(a[i]);
            }

        }

    }
}

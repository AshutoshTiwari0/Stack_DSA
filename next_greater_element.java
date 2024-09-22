package Stack;
import java.util.*;
public class next_greater_element {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter length of array");
        int n=ob.nextInt();
        int a[]=new int[n];
        System.out.println("enter array elements");
        for(int i=0;i<n;i++)
        {
            a[i]=ob.nextInt();
        }
        //naive
        /*
        for(int i=0;i<n;i++)
        {int j;
            for( j=i+1;j<n;j++)
            {
                if(a[i]<a[j])
                {
                    System.out.println(a[j]);
                    break;
                }
            }
            if(j==n)
            {
                System.out.println(-1);
            }
        }
*/
//optimised solution
        ArrayDeque<Integer> nums=new ArrayDeque<>();
        nums.push(a[n-1]);
        for(int i=n-2;i>=0;i--)
        {
            while(!nums.isEmpty() && nums.peek()<=a[i])
            {
                nums.pop();
            }
            int next_greater=(nums.isEmpty())? (-1): nums.peek();
            System.out.println(next_greater);
            nums.push(a[i]);
        }





    }
}

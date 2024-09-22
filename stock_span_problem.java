package Stack;

import java.util.ArrayDeque;
import java.util.Scanner;

public class stock_span_problem {
    public static void main(String[] args) {
        System.out.println("enter length of array");
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=ob.nextInt();
        }
        /*
        //naive
        for(int i=0;i<n;i++)
        {
            int span=1;
            for(int j=i-1;j>=0 && a[j]<=a[i];j--)
            {
                span++;
            }
            System.out.println(span);
        }
        */
         //optimised
        ArrayDeque<Integer> s=new ArrayDeque<>();
        s.push(0);
        System.out.println(1); //span of first is always 1
        for(int i=1;i<n;i++)
        {
            while(s.isEmpty()==false && a[s.peek()]<=a[i])
            {
                s.pop();
            }
            int span=s.isEmpty()?i+1: i-s.peek();
            System.out.println(span);
            s.push(i);
        }











    }
}

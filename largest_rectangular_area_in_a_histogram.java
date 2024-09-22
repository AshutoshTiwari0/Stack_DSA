package Stack;

import java.util.Scanner;
import java.util.Stack;

public class largest_rectangular_area_in_a_histogram {
    public static void main(String[] args) {
        System.out.println("enter length of array");
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int arr[]=new int[n];
        System.out.println("enter elements in array");
        for(int i=0;i<n;i++)
        {
            arr[i]=ob.nextInt();
        }

        //naive solution
        /*
        int res=0;
        for(int i=0;i<n;i++)
        {
            int curr=a[i];
            for(int j=i-1;j>=0;j--)
            {
                if(a[j]>=a[i])
                {
                    curr+=a[i];
                }
                else
                {
                    break;
                }
            }
            for(int j=i+1;j<n;j++)
            {
                if(a[j]>=a[i])
                {
                    curr+=a[i];
                }
                else
                {
                    break;
                }
            }
            res=Math.max(res,curr);
        }
        System.out.println(res);
*/
        //Better solution
/*
        int res=0;
        int[] ps=new int[n];int[] ns=new int[n];

        Stack<Integer> s=new Stack<>();
        s.add(0);
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i])
                s.pop();
            int pse=s.isEmpty()?-1:s.peek();
            ps[i]=pse;
            s.push(i);
        }

        while(!s.isEmpty()){
            s.pop();
        }

        s.push(n-1);
        for(int i=n-1;i>0;i--){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i])
                s.pop();
            int nse=s.isEmpty()?n:s.peek();
            ns[i]=nse;
            s.add(i);
        }

        for(int i=0;i<n;i++){
            int curr=arr[i];
            curr+=(i-ps[i]-1)*arr[i];
            curr+=(ns[i]-i-1)*arr[i];
            res=Math.max(res,curr);
        }
        System.out.println(res);
*/
        //best solution
        Stack <Integer> s=new Stack<>();
        int res=0;
        int tp;
        int curr;
        for(int i=0;i<n;i++){
            while(s.isEmpty()==false && arr[s.peek()]>=arr[i]){
                tp=s.peek();s.pop();
                curr=arr[tp]* (s.isEmpty() ? i : i - s.peek() - 1);
                res=Math.max(res,curr);
            }
            s.add(i);
        }
        while(s.isEmpty()==false){
            tp=s.peek();s.pop();
            curr=arr[tp]* (s.isEmpty() ? n : n - s.peek() - 1);
            res=Math.max(res,curr);
        }

        System.out.println(res);

    }



    }

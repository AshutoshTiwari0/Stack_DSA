package Stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class answer
{
    boolean ans(String a)
    {
        //put open brackets in stack. when we see closing bracket check top if top is same closing bracket remove the open bracket from stack. If stack is empty balanced.
        Deque<Character> s=new ArrayDeque<>();
        for(int i=0;i<a.length();i++)
        {
            char f=a.charAt(i);
            if(f=='('|| f=='{'||f=='[')
            {
                s.push(f);
            }
            else
            {
                if(s.isEmpty())
                {
                    return false;
                }
                else if(!matching(s.peek(),f))
                {
                    return false;
                }
                else
                {
                    s.pop();
                }
            }

        }
        return (s.isEmpty());
    }
    boolean matching(char a ,char b)
    {
        return ((a=='(' && b==')')||
                (a=='[' && b==']')||
                (a=='{' && b=='}'));
    }

}




public class balanced_paranthesis {
    public static void main(String[] args) {
        System.out.println("enter a string consisting of brackets");
        Scanner ob=new Scanner(System.in);
        String a=ob.nextLine();

        answer obj=new answer();
       boolean ans= obj.ans(a);
        System.out.println(ans);

    }
}

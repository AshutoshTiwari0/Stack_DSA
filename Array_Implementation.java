package Stack;
import java.util.*;
//stack implementation using array
/*
class Mystack
{
    int arr[];
    int cap;
    int top;
    Mystack(int c)
    {
        top=-1;
        cap=c;
        arr=new int[c];
    }
    void push(int x)
    {
        if(top==cap-1)
        {
            System.out.println("Stack is full");
        }
        top++;
        arr[top]=x;
    }
    int pop()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");
        }
       int res=arr[top]; //got the top element
       top--;//now reduce top as we need to remove the element
       return res;
    }
    int peek()
    {
     if(top==-1)
     {
         System.out.println("Stack is empty");
     }
     return arr[top];
    }

    int size()
    {
        return top++;
    }
    boolean isEmpty()
    {
        return (top==-1); //if top =-1 stack is empty else it is filled
    }
}
*/

//stack using dynamic array(ArrayList)
class Mystack {
ArrayList<Integer> s=new ArrayList<>();
void push(int a)
{
    s.add(a);
}
int pop()
{
    int res=s.get(s.size()-1);
    s.remove(s.size()-1);
    return res;
}
int peek()
{
    return s.get(s.size()-1);
}
boolean isEmpty()
    {
        return s.isEmpty();
    }
    int size()
    {
        return s.size();
    }
}
public class Array_Implementation {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        Mystack s=new Mystack(); //here 10 is size
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.push(7);
        s.push(8);
        s.push(9);
        s.push(10);
        System.out.println(s.pop());
        System.out.println(s.pop());
        s.push(35);
        System.out.println(s.peek());
        System.out.println(s.size());
        System.out.println(s.isEmpty());

    }
}

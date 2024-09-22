package Stack;

class TwoStacks
{
    int arr[];
    int cap;
    int top1,top2;
    TwoStacks(int n)
    {
      arr=new int[n];
      cap=n;
      top1=-1;
      top2=n;
    }
    boolean push1(int x)
    {
        if(top1<top2-1) //push condition
        {
            top1++;
            arr[top1]=x;
            return true;
        }
        return false;
    }
    boolean push2(int x)
    {
    if(top1<top2-1) //push condition.
    {
        top2--; //top2 peeche se aaega so dec.
        return true;
    }
    return false;
    }
    Integer pop1()
    {
    if(top1>=0)
    {
        int x=arr[top1];
        top1--;
        return x;
    }
    return null;
    }
    Integer pop2()
    {
    if(top2<cap)
    {
        int x=arr[top2];
        top2++;
        return x;
    }
    return null;
    }
    int size1()
    {
    return top1+1;
    }
    int size2()
    {
        return cap-top2;
    }
}

public class two_stacks_in_an_array {
    public static void main(String[] args) {
        TwoStacks ts=new TwoStacks(5);
        ts.push1(5);
        ts.push2(10);
        ts.push2(15);
        ts.push1(11);
        ts.push2(7);
        System.out.println("Popped element from stack1 is: " + ts.pop1());
        ts.push2(40);
        System.out.println("Popped element from stack2 is: " + ts.pop2());
        int popped1=ts.pop1();
        int popped2=ts.pop2();


    }
}

package Stack;
class kstacks
{
    int arr[];
    int k,cap;
    int top[],next[];
    int free_top=0;
    kstacks(int n,int k)
    {
        this.k=k;
        cap=n;
        arr=new int[n];
        top=new int[k];
        next=new int[n];
        //initialise top as -1
        for(int i=0;i<k;i++)
        {
            top[i]=-1;
        }
        for(int i=0;i<n-1;i++)
        {
            next[i]=i+1;
        }
        next[n-1]=-1; //last as -1
    }
    void push(int sn,int x)
    {
        int i=free_top;
        free_top=next[i];
        next[i]=top[sn];
        top[sn]=i;
        arr[i]=x;
    }
    int pop(int sn)
    {
        int i=top[sn];
        top[sn]=next[i];
        next[i]=free_top;
        free_top=i;
        return arr[i];
    }
    boolean isEmpty(int sn)
    {
return top[sn]==-1;
    }
}
public class implement_k_stacks {
    public static void main(String[] args) {

        int k = 3, n = 10;
        kstacks ks=new kstacks(k, n);

        ks.push(15, 2);
        ks.push(45, 2);

        ks.push(17, 1);
        ks.push(49, 1);
        ks.push(39, 1);

        ks.push(11, 0);
        ks.push(9, 0);
        ks.push(7, 0);

        System.out.println("Popped element from stack 2 is " + ks.pop(2) );
        System.out.println("Popped element from stack 1 is " + ks.pop(1) );
        System.out.println("Popped element from stack 0 is " + ks.pop(0) );







    }
}

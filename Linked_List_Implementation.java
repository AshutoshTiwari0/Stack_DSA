package Stack;

class Node
{   int data;
    Node next;
    Node(int x)
    {
        data=x;
        next=null;
    }
}
class My_stack
{
Node head;
int sz;
My_stack()
{
    head=null;
    sz=0;
}
int size()
{
    return sz;
}
boolean isEmpty()
{
    if(head==null)
    {
        return true;
    }
    return false;
}
void push(int x)
{
    Node temp=new Node(x);
    temp.next=head;
    head=temp;
    sz++;
}
int pop()
{
    if(head==null)
    {
        return Integer.MAX_VALUE;
    }
    int res=head.data;
    head=head.next;
    sz--;
    return res;
}
int peek()
{
    if(head==null)
    {
        return Integer.MAX_VALUE;
    }
    return head.data;
}
}




public class Linked_List_Implementation {
    public static void main(String[] args) {
        My_stack s=new My_stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.peek());
        System.out.println(s.pop());
        s.push(40);
        s.push(50);
        System.out.println(s.size());
        System.out.println(s.isEmpty());


    }
}

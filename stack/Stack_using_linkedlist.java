import java.util.Scanner;

class Node
{
    int data;
    Node next;
}
class Stack
{
    Node top = null;
}
public class Stack_using_linkedlist
{
    public static  void push(Stack stk,int ele)
    {
        Node newnode = new Node();
        newnode.data = ele;
        if(stk.top == null)
        {
            stk.top = newnode;
        }else
        {
            newnode.next = stk.top;
            stk.top = newnode;
        }
    }
    public static  void pop(Stack stk)
    {
        if(stk.top == null)
        {
            System.out.println(" stack is empty ");
        }else
        {
            int data = stk.top.data;
            stk.top = stk.top.next;
            System.out.println(" poped : "+data);
        }
    }
    public static void peek(Stack stk)
    {
        if(stk.top == null)
        {
            System.out.println(" stack is empty ");
        }else
        {
            int data = stk.top.data;
            System.out.println(" peek element : "+data);
        }
    }
    public static void display(Stack stk)
    {
        Node temp;
        temp = stk.top;
        while(temp != null)
        {
            System.out.print(temp.data+"<-");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Stack stk = new Stack();
        while(true)
        {
            System.out.println("1.push \t 2.pop \t 3.display \t 4.peek \t 5.exit ");
            Scanner sc  = new Scanner(System.in);
            int choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println(" enter element : ");
                    int n = sc.nextInt();
                    push(stk,n);
                    System.out.print("\n");
                    break;
                case 2:
                    pop(stk);
                    System.out.print("\n");
                    break;
                case 3:
                    display(stk);
                    System.out.print("\n");
                    break;
                case 4:
                    peek(stk);
                    System.out.print("\n");
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}
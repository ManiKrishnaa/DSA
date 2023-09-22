// deletion of elements in circular linked list
import java.util.*;
class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}
class Circular
{
    Node head = null;
    Node tail = null;
    public void insert(int ele)
    {
        Node newnode = new Node(ele);
        if(head == null)
        {
            head = newnode;
            tail = newnode;
            newnode.next = head;
        }else
        {
            tail.next = newnode;
            tail = newnode;
            tail.next = head;
        }
    }
    public void display()
    {
        Node temp = head;
        do 
        {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }while(temp != head);
        System.out.println();
    }
    public void deletion()
    {
        Node temp = head;
        System.out.println(" enter the position you want to delete : ");
        Scanner sc = new Scanner(System.in);
        int ans = sc.nextInt();
        for(int i=1; i<ans-1; i++)
        {
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }
}
class Main
{
    public static void main(String[] args)
    {
        Circular obj = new Circular();
        obj.insert(1);
        obj.insert(2);
        obj.insert(3);
        obj.insert(4);
        obj.insert(5);
        obj.display();
        obj.deletion();
        obj.display();
        
    }
}

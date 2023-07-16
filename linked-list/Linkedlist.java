import java.util.*;
class Node 
{
     int data;
     Node next;
 }
class Linkedlist {
    public static Node create(Node head)
    {
        Node temp = new Node();
        Node newnode = new Node();
        temp = head;
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter data other than -9 : ");
        newnode.data = sc.nextInt();
        while(newnode.data != -9)
        {
            temp.next = newnode;
            temp = newnode;
            newnode = new Node();
            System.out.println(" enter data other than -9 : ");
            newnode.data = sc.nextInt();
        }
        return head.next;
    }
    public static void display(Node head)
    {
        Node temp = new Node();
        temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
    }
    public static void main(String[] args) 
    {
        Node head = new Node();
        Node temp = new Node();
        temp = create(head);
        display(temp);
    }
}
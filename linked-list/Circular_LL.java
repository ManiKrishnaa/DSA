
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
        if(head == null)
        {
            System.out.println(" empty ");
        }
        Node temp = head;
        do
        {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }while(temp != head);
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
        obj.display();
    }
}

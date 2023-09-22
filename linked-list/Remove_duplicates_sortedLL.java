
// removing duplicates from sorted list
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
class Linkedlist
{
    Node head;
    public void insert(int ele)
    {
        Node newnode = new Node(ele);
        if(head == null)
        {
            head = newnode;
        }else
        {
            Node temp = head;
            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = newnode;
            temp = newnode;
        }
    }
    public void removeduplicates()
    {
        Node temp = head;
        while(temp != null && temp.next != null)
        {
            if(temp.data == temp.next.data)
            {
                temp.next = temp.next.next;
            }else
            {
                temp = temp.next;
            }
        }
    }
    public void display()
    {
        Node temp= head;
        while(temp != null)
        {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println();
    }
}
class Main
{
    public static void main(String[] args)
    {
    Linkedlist ll = new Linkedlist();
    ll.insert(1);
    ll.insert(2);
    ll.insert(2);
    ll.insert(3);
    ll.insert(3);
    ll.display();
    ll.removeduplicates();
    ll.display();
    }
}

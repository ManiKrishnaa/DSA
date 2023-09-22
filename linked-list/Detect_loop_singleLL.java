

// detecting loop in a linkedlist
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
    public void change()
    {
        Node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = head;
    }
    public boolean detect()
    {
        Node temp1 = head;
        Node temp2 = head;
        while(temp1 != null && temp1.next != null)
        {
            temp2 = temp2.next;
            temp1 = temp1.next.next;
            if(temp1 == temp2)
            {
                return true;
            }
        }
        return false;
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
    ll.change();
    boolean flag = ll.detect();
    if(flag == true)
    { 
        System.out.println(" loop detected !!");
    }else
    {
        System.out.println(" no loop detected !!");
    }
}
}

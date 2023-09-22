
// deleting middle element from the linked list
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
    int count = 0;
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
        }
    }
    public Node delete()
    {
        Node temp = head;
        int mid = count/2;
        for(int i=0; i<mid-1; i++)
        {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        count--;
        return head;
    }
    public void display()
    {
        Node temp = head;
        while(temp != null)
        {
            count++;
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
        ll.insert(3);
        ll.insert(4);
        ll.insert(5);
        ll.display();
        ll.delete();
        ll.display();
    }
}

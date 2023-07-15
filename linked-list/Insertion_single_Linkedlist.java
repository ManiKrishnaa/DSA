import java.util.*;
class SampleLL
{
    Node head;
    static class Node
    {
        public int data;
        public Node next;
        public Node(int d)
        {
            data = d;
            next = null;
        }
    }

    public static void insertatbeg(SampleLL list,int ele)
    {
        Node newnode = new Node(ele);
        if(list.head == null)
        {
            list.head = newnode;
        }else
        {
            Node temp = list.head;
            newnode.next = list.head;
            list.head = newnode;
        }
    }

    public static void insertatpos(SampleLL list,int pos,int ele)
    {
        Node newnode = new Node(ele);
        if(pos == 1)
        {
            insertatbeg(list, ele);
        }else 
        {
            Node temp = list.head;
            for(int i=1; i<pos-1; i++)
            {
                temp = temp.next;
            }
            newnode.next = temp.next;
            temp.next = newnode;
        }

    }

    public static void insertatend(SampleLL list,int ele)
    {
        Node newnode = new Node(ele);
        if(list.head == null)
        {
            list.head = newnode;
        }else
        {
            Node temp = list.head;
            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }

    public static void display(SampleLL list)
    {
        Node temp = list.head;
        while(temp != null)
        {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        SampleLL list = new SampleLL();
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.print(" enter the element to be inserted : ");
            int ele = sc.nextInt();
            System.out.println("1.insert at beg \t 2. insert at end \t 3. insert at pos  \t 4. display \t 5.exit  ");
            int choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    insertatbeg(list, ele);
                    display(list);
                    System.out.print("\n");
                    break;
                case 2:
                    insertatend(list, ele);
                    display(list);
                    System.out.print("\n");
                    break;
                case 3:
                    System.out.println(" enter the position : ");
                    int n = sc.nextInt();
                    insertatpos(list, n, ele);
                    display(list);
                    System.out.print("\n");
                    break;
                case 4:
                    display(list);
                    System.out.print("\n");
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}
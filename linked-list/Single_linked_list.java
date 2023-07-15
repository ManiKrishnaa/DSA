import java.util.*;
class Single_linked_list
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

    public static void insertatbeg(Single_linked_list list,int ele)
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

    public static void insertatpos(Single_linked_list list,int pos,int ele)
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

    public static void insertatend(Single_linked_list list,int ele)
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

    public static void insert(Single_linked_list list)
    {
         Scanner sc = new Scanner(System.in);
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

    public static void delete(Single_linked_list list)
    {
             Scanner sc = new Scanner(System.in);
            System.out.println("1.delete at beg \t 2. delete at end \t 3. delete at pos  \t 4. display \t 5.exit  ");
            int choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    deleteatbeg(list);
                    display(list);
                    System.out.print("\n");
                    break;
                case 2:
                    deleteatend(list);
                    display(list);
                    System.out.print("\n");
                    break;
                case 3:
                    System.out.println(" enter the position : ");
                    int n = sc.nextInt();
                    deleteatpos(list, n);
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

    public static void deleteatbeg(Single_linked_list list)
    {
        if(list.head == null)
        {
            System.out.println(" -- the list is emoty -- ");
            return ;
        }else
        {
            Node temp = list.head;
            list.head = list.head.next;
            temp.next = null;
        }
    }

    public static void deleteatend(Single_linked_list list)
    {
        if(list.head == null)
        {
            System.out.println(" -- the list is emoty -- ");
            return ;
        }else
        {
            Node temp = list.head;
            while(temp.next.next != null)
            {
                temp = temp.next;
            }
            temp.next = null;
        }
    }

     public static void deleteatpos(Single_linked_list list,int pos)
    {
        if(pos == 1)
        {
            list.deleteatbeg(list);
        }else
        {
            Node temp = list.head;
            for(int i=1; i<pos-1; i++)
            {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
    }


    public static void display(Single_linked_list list)
    {
        Node temp = list.head;
        while(temp != null)
        {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Single_linked_list list = new Single_linked_list();
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("1. insert \t 2.delete \t 3. exit ");
            int n = sc.nextInt();
            switch(n)
            {
                case 1:
                    list.insert(list);
                    break;
                case 2:
                    list.delete(list);
                    break;
                case 3:
                    System.exit(n);
            }
        }
    }
}
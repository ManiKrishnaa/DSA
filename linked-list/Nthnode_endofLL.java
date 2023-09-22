
// nth node from end of the linked list
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
class Main 
{
    Node head;
    int count = 0;

    public void insert(int ele) {
        Node newnode = new Node(ele);
        if (head == null) {
            head = newnode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }
    public void nthnode(int n) 
    {
       Node temp = head;
       int pos = count-n;
       for(int i=0; i<pos; i++)
       {
           temp = temp.next;
       }
       System.out.println(n+" node from end of the list : "+temp.data);
       
    }
    public void display() {
        Node temp = head;
        while (temp != null) {
            count++;
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {
        Main original = new Main();
        original.insert(1);
        original.insert(2);
        original.insert(3);
        original.insert(4);
        original.insert(5);
        original.display();

        int n = 2;
        original.nthnode(n);

    }
}

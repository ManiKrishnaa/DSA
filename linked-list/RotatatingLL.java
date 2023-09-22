
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

    public Main rotate(int k) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        //making it has circular 
        temp.next = head;
        
        for (int i = 0; i <k; i++)
        {
            temp = temp.next;
        }

        head = temp.next;
        temp.next = null;
        return this;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            count++;
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Main original = new Main();
        original.insert(1);
        original.insert(2);
        original.insert(3);
        original.insert(4);
        original.insert(5);
        original.display();

        int k = 2;

        Main rotator = original.rotate(k);
        rotator.display();
    }
}

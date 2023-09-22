
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class Main {
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

    public void middle()
    {
        Node temp = head;
        int mid = count/2;
        for(int i=1; i<=mid; i++)
        {
            temp = temp.next;
        }
        System.out.println(" middle element in the given linked list : "+temp.data);
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
        original.middle();
    }
}

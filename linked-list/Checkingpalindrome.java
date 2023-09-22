
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

    public void reverse(Main reverselist) {
        Node previous = null;
        Node current = head;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        reverselist.head = previous;
    }

    public void check(Node head1, Node head2) {
        int x = 0;
        Node temp1 = head1;
        Node temp2 = head2;
        while (temp1 != null && temp2 != null) {
            if (temp1.data != temp2.data) {
                x++;
                break;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        if (x == 0) {
            System.out.println("Given list is a palindrome");
        } else {
            System.out.println("Given list is not a palindrome");
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Main original = new Main();
        Main reversell = new Main();
        original.insert(1);
        original.insert(2);
        original.insert(3);
        original.insert(2);
        original.insert(1);
        original.display();
        original.reverse(reversell);
        reversell.display();
        original.check(original.head, reversell.head); // Corrected the check method call
    }
}

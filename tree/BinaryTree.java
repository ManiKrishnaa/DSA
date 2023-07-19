import java.util.Scanner;

class Node
{
    int data;
    Node left;
    Node right;
}
public class BinaryTree 
{
    public static Node getnode()
    {
        Node node = new Node();
        node.data = 0;
        node.left = null;
        node.right = null;
        return node;
    }
    public static Node create(Node root)
    {
        Scanner sc = new Scanner(System.in);
        Node newnode = getnode();
        System.out.println(" enter the data other than  -9 : ");
        newnode.data = sc.nextInt();
        while(newnode.data != -9)
        {
            if(root == null)
            {
                root = newnode;
            }else
            {
                insert(root,newnode);
                newnode = getnode();
                System.out.println(" enter the data other than  -9 : ");
                newnode.data = sc.nextInt();
            }
        }
        return root;
    }
    public static void insert(Node root,Node newnode)
    {
        if(newnode.data < root.data)
        {
            if(root.left == null)
            {
                root.left = newnode;
            }else
            {
                insert(root.left, newnode);
            }
        }else if(newnode.data > root.data)
        {
            if(root.right == null)
            {
                root.right = newnode;
            }else
            {
                insert(root.right, newnode);
            }
        }
    }
    public static void inorder(Node root)
    {
        if(root != null)
        {
            inorder(root.left);
            System.out.print(root.data+"->");
            inorder(root.right);
        }
    }
    public static void preorder(Node root)
    {
        if(root != null)
        {
            System.out.print(root.data+"->");
            preorder(root.left);
            preorder(root.right);
        }
    }
    public static void postorder(Node root)
    {
        if(root != null)
        {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+"->");
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Node root = null;
        root = create(root);
        while(true)
        {
            System.out.println("1.inorder \t 2.preorder ]t 3.postorder ");
            int ch = sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println(" -- inorder traversal --");
                    inorder(root);
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.println(" -- preorder traversal -- ");
                    preorder(root);
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.println(" -- postorder traversal -- ");
                    postorder(root);
                    System.out.println(" ");
                    break;
            }
        }   
    }
}

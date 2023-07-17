import java.util.Scanner;

public class Stack 
{
    int size = 5;
    int top = -1;
    int[] arr = new int[size];

    public void push(int ele)
    {
        if(top == size-1)
        {
            System.out.println(" stack is full ");
        }else
        {
            top++;
            arr[top] = ele;
        }
    }
    public void pop()
    {
        if(top == -1)
        {
            System.out.println(" stack is empty ");
        }else
        {
            int data = arr[top];
            top--;
            System.out.println(" poped : "+data);
        }
    }
    public void peek()
    {
        if(top == -1)
        {
            System.out.println(" stack is empty ");
        }else
        {
            int data = arr[top];
            System.out.println(" peek element : "+data);
        }
    }
    public void display()
    {
        for(int i=top; i>=0; i--)
        {
            System.out.print(arr[i]+"\t");
        }
        System.out.println(" ");
    }
    public static void main(String[] args) 
    {
        Stack obj = new Stack();
        while(true)
        {
            System.out.println("1.push \t 2.pop \t 3.display \t 4.peek \t 5.exit ");
            Scanner sc  = new Scanner(System.in);
            int choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println(" enter element : ");
                    int n = sc.nextInt();
                    obj.push(n);
                    System.out.print("\n");
                    break;
                case 2:
                    obj.pop();
                    System.out.print("\n");
                    break;
                case 3:
                    obj.display();
                    System.out.print("\n");
                    break;
                case 4:
                    obj.peek();
                    System.out.print("\n");
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}

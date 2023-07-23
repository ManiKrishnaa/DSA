import javax.swing.*;
import javax.swing.event.AncestorListener;

import java.awt.*;
import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Flow;

class Node
{
    String item;
    float price;
    Node next;
    Node(String item , float price)
    {
        this.item = item;
        this.price = price;
    }
}

class Queue
{
    Node front;
    Node rear;
    Queue()
    {
        this.front = null;
        this.rear = null;
    }
    void insert(Queue queue,String item,float price)
    {
        Node newnode = new Node(item, price);
        if(queue.front == null)
        {
            queue.rear = newnode;
            queue.front = newnode;
        }else
        {
            queue.rear.next = newnode;
            queue.rear = newnode;
        }
    }
}
class Main
{
    Queue queue= new Queue();
    JFrame frame,frame2,frame3,frame4;
    JLabel name,itemss;
    JButton l1;
    JButton vegbtn,vegstarters,vegbiryani,vegchinese;
    JButton desserts,billing,back,exit;
    JButton nonvegbtn,nonvegstarters,nonvegbiryani,nonvegchinese;
    void menu()
    {
        frame = new JFrame("Restaurant menu");
        ImageIcon logo = new ImageIcon("C:\\Users\\manik\\OneDrive\\Documents\\DSA\\restaurant\\logo.jpg");
        JLabel imagelbl = new JLabel(logo);
        imagelbl.setBounds(200, 0, 1000, 300);

        vegbtn = new JButton("VEG");
        vegbtn.setBounds(600, 300, 200, 40);
        vegbtn.setBackground(Color.white);

        nonvegbtn = new JButton("NON-VEG");
        nonvegbtn.setBounds(600, 400, 200, 40);
        nonvegbtn.setBackground(Color.white);

        desserts = new JButton("DESSERTS & COOLDRINKS");
        desserts.setBounds(600, 500, 200, 40);
        desserts.setBackground(Color.white);

        exit = new JButton("EXIT");
        exit.setBounds(600, 600, 200, 40);
        exit.setBackground(Color.white);
        
        frame.add(imagelbl);
        frame.add(vegbtn);
        frame.add(nonvegbtn);
        frame.add(desserts);
        frame.add(exit);

        vegbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                veg_menu();
            }
        });
        nonvegbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                nonveg_menu();
            }
        });
        desserts.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                desserts();
            }
        });
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);
            }
        });
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(2100, 1000);
        frame.setVisible(true);
    }
    void veg_menu()
    {
        frame2 = new JFrame(" VEG ");
        
        ImageIcon logo = new ImageIcon("C:\\Users\\manik\\OneDrive\\Documents\\DSA\\restaurant\\veglogo.jpg");
        JLabel imagelbl = new JLabel(logo);
        imagelbl.setBounds(200, 0, 1000, 300);
        frame2.add(imagelbl);

        vegstarters = new JButton("VEG - STARTERS ");
        vegstarters.setBounds(600, 300, 150, 50);
        frame2.add(vegstarters);

        vegbiryani = new JButton("VEG - BIRYANIS ");
        vegbiryani.setBounds(600, 400, 150, 50);
        frame2.add(vegbiryani);

        vegchinese = new JButton("VEG - CHINESE ");
        vegchinese.setBounds(600, 500, 150, 50);
        frame2.add(vegchinese);

        back = new JButton("BACK");
        back.setBounds(600, 600, 150, 50);
        frame2.add(back);

        billing = new JButton("BILLING");
        billing.setBounds(600, 700, 150, 50);
        frame2.add(billing);

        vegstarters.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                veg_starters();
            }
        });
        vegbiryani.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                veg_biryani();
            }
        });
        vegchinese.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                veg_chinese();
            }
        });
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                menu();
            }
        });
        billing.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                billing_menu();
            }
        });
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setLayout(null);
        frame2.setSize(2100, 1000);
        frame2.setVisible(true);
    }
    void veg_starters()
    {
        String[] startersItems = {
            "Veg Corn Soup", "Veg Sweet Corn Soup", "Veg Manchurian Dry", 
            "Paneer 65", "Paneer Chilli", "Mushroom Chilli", "Mushroom 65"
        };
        float[] startersPrices = {170, 180, 300, 320, 320, 310, 310};

        display("VEG STARTERS", startersItems, startersPrices);
    }
    void veg_biryani()
    {
        String[] biryanisItems = {
            "South Indian Thali", "Special Curd Rice", "Paneer Biryani", 
            "Veg Biryani", "Curd Rice", "Cashew Biryanis"
        };
        float[] biryanisPrices = {270, 190, 340, 260, 140, 360};

        display("VEG BIRYANIS", biryanisItems, biryanisPrices);
    }
    void veg_chinese()
    {
        String[] chineseItems = {
            "Chilly Garlic Noodles", "Veg Noodles", "Veg Schezwan Noodles",
            "Paneer Noodles", "Corn Noodles", "Mushroom Fried Rice",
            "Special Veg Fried Rice", "Vegetable Fried Rice", "Schezwan Vegetable Fried Rice",
            "Veg Singapore Fried Rice", "Paneer Fried Rice", "Special Paneer Fried Rice",
            "Cashew Fried Rice", "Corn Fried Rice"
        };
        float[] chinesePrices = {250, 260, 220, 310, 320, 290, 340, 250, 260, 290, 310, 350, 320, 280};
        display("VEG CHINESE", chineseItems, chinesePrices);
    }
    void nonveg_menu()
    {
        JFrame frame5 = new JFrame(" VEG ");

        ImageIcon logo1 = new ImageIcon("C:\\Users\\manik\\OneDrive\\Documents\\DSA\\restaurant\\nonveglogo.jpg");
        JLabel imagelbl = new JLabel(logo1);
        imagelbl.setBounds(200, 0, 1000, 300);
        frame5.add(imagelbl);

        nonvegstarters = new JButton("NON-VEG - STARTERS ");
        nonvegstarters.setBounds(200, 400, 150, 50);
        frame5.add(nonvegstarters);

        nonvegbiryani = new JButton("NON-VEG - BIRYANIS ");
        nonvegbiryani.setBounds(400, 400, 150, 50);
        frame5.add(nonvegbiryani);

        nonvegchinese = new JButton("NON-VEG - CHINESE ");
        nonvegchinese.setBounds(600, 400, 150, 50);
        frame5.add(nonvegchinese);

        back = new JButton("BACK");
        back.setBounds(800, 400, 100, 50);
        frame5.add(back);

        billing = new JButton("BILLING");
        billing.setBounds(1000, 400, 100, 50);
        frame5.add(billing);

        nonvegstarters.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                nonveg_starters();
            }
        });
        nonvegbiryani.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                nonveg_biryanis();
            }
        });
        nonvegchinese.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                nonveg_chinese();
            }
        });
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                menu();
            }
        });
        billing.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                billing_menu();
            }
        });
        frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame5.setLayout(null);
        frame5.setSize(2100, 1000);
        frame5.setVisible(true);
    }
    void nonveg_starters()
    {

    }
    void nonveg_biryanis()
    {

    }
    void nonveg_chinese()
    {

    }
    void desserts()
    {

    }
    void display(String title,String[] items,float[] prices)
    {
        int j = 100;
        int k = 100;
        int l = 100;
        frame3 = new JFrame();
        JLabel titleLabel = new JLabel(title, SwingConstants.CENTER);
        titleLabel.setFont(new Font("Sans-serif", Font.BOLD, 20));
        titleLabel.setForeground(Color.cyan);
        titleLabel.setBounds(550, 0, 250, 30);
        frame3.add(titleLabel);

        JLabel itm = new JLabel("ITEM");
        itm.setFont(new Font("Times New Roman", Font.BOLD, 15));
        itm.setBounds(400, 50, 100, 30);
        JLabel prc = new JLabel("PRICE(Rs)");
        prc.setFont(new Font("Times New Roman", Font.BOLD, 15));
        prc.setBounds(600, 50, 100, 30);

        frame3.add(itm);
        frame3.add(prc);

        for (int i = 0; i < items.length; i++) {
            String item = items[i];
            float price = prices[i];
            JButton addButton = new JButton("Add");
            addButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    int quantity = Integer.parseInt(JOptionPane.showInputDialog(frame, "Enter Quantity:"));
                    String itemWithQuantity = item + " x " + quantity;
                    float itemTotalPrice = price * quantity;
                    JOptionPane.showMessageDialog(frame3," item added to billing !");
                    queue.insert(queue, itemWithQuantity, itemTotalPrice);
                }
            });
            itemss = new JLabel(item);
            itemss.setBounds(400, j, 350, 20);
            j += 50;
            frame3.add(itemss);
            JLabel pricess = new JLabel(Float.toString(price));
            pricess.setBounds(600, k, 350, 20);
            k += 50;
            frame3.add(pricess);
            addButton.setBounds(800, l, 100, 20);
            l += 50;
            frame3.add(addButton);
        }
        JButton bkbtn = new JButton("BACK");
        bkbtn.setBounds(200, 0, 100, 20);
        frame3.add(bkbtn);

        JButton billbtn = new JButton("BILLING");
        billbtn.setBounds(1100, 0, 100, 20);
        frame3.add(billbtn);

        bkbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                veg_menu();
            }
        });

        billbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                billing_menu();
            }
        });
        frame3.setSize(2100, 1000);
        frame3.setLayout(null);
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3.setVisible(true);
    }
    void billing_menu()
    {
        float sum = 0.0f;
        String bill_item = "";
        float bill_price = 0.0f;
        int m = 100,n = 100;
        frame4 = new JFrame("BILLING");
        Node temp = queue.front;
        while(temp != null)
        {
            bill_item = temp.item;
            JLabel billitem = new JLabel(bill_item);
            billitem.setBounds(400, m, 350, 20);
            m += 70;
            frame4.add(billitem);
            bill_price = temp.price;
            sum += bill_price;
            JLabel billprice = new JLabel(Float.toString(bill_price));
            billprice.setBounds(600, n, 350, 20);
            n += 70;
            frame4.add(billprice);
            temp = temp.next;
        }
        JLabel tt1 = new JLabel("TOTAL  : ");
        tt1.setBounds(400, m+70, 350, 20);
        JLabel total = new JLabel(Float.toString(sum));
        total.setBounds(600,n+70,350,20);
        frame4.add(tt1);
        frame4.add(total);
        frame4.setSize(2100, 1000);
        frame4.setLayout(null);
        frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame4.setVisible(true);
    }
}
class Rest_gui 
{
    public static void main(String[] args) {
        Main obj = new Main();
        obj.menu();
    }
}

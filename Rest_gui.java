import javax.swing.*;
import javax.swing.event.AncestorListener;

import java.awt.*;
import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Flow;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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
    JPanel panel1;
    void menu()
    {
        frame = new JFrame("Restaurant menu");
        ImageIcon logo = new ImageIcon("C:\\Users\\manik\\OneDrive\\Documents\\DSA\\restaurant\\btechboys.png");
        JLabel imagelbl = new JLabel(logo);
        imagelbl.setBounds(200, 0, 1000, 300);
        Color c = new Color(250, 230, 211);

        LocalDateTime currentLocalDateTime = LocalDateTime.now();
 
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        String date_now = currentLocalDateTime.format(dateTimeFormatter);
        JLabel date = new JLabel(date_now);
        date.setBounds(1400, 100, 150, 20);
        frame.getContentPane().setBackground(c);

        vegbtn = new JButton("VEG");
        vegbtn.setBackground(Color.white);
        vegbtn.setBounds(150, 300, 150, 80);
        vegbtn.setFont(new Font("Arial", Font.BOLD, 20));
        vegbtn.setBorder(null);

        nonvegbtn = new JButton("NON-VEG");
        nonvegbtn.setBackground(Color.white);
        nonvegbtn.setBounds(150, 450, 150, 80);
        nonvegbtn.setFont(new Font("Arial", Font.BOLD, 20));
        nonvegbtn.setBorder(null);

        billing = new JButton("BILLING");
        billing.setBounds(1200, 300, 150, 80);
        billing.setBackground(Color.white);

        exit = new JButton("EXIT");
        exit.setBounds(1200, 450, 150, 80);
        exit.setBackground(Color.white);
        
        frame.add(imagelbl);
        frame.add(date);
        frame.add(vegbtn);
        frame.add(nonvegbtn);
        frame.add(billing);
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
        billing.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                billing_menu();
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
        Color c = new Color(250, 230, 211);
        frame2.getContentPane().setBackground(c);

        back = new JButton("BACK");
        back.setBounds(100, 20, 150, 50);
        frame2.add(back);

        vegstarters = new JButton("VEG - STARTERS ");
        vegstarters.setBounds(300, 20, 150, 50);
        frame2.add(vegstarters);

        vegbiryani = new JButton("VEG - BIRYANIS ");
        vegbiryani.setBounds(500, 20, 150, 50);
        frame2.add(vegbiryani);

        vegchinese = new JButton("VEG - CHINESE ");
        vegchinese.setBounds(700, 20, 150, 50);
        frame2.add(vegchinese);

        desserts = new JButton("DESSERTS ");
        desserts.setBounds(900, 20, 150, 50);
        frame2.add(desserts);

        billing = new JButton("BILLING");
        billing.setBounds(1100, 20, 150, 50);
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
        JLabel l1 = new JLabel("SELECT SOME ITEM");
        
        panel1 = new JPanel();
        panel1.setBackground(c);
        panel1.setBounds(100,150,1300,450);
        frame2.add(panel1);
        panel1.add(l1);

        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setLayout(null);
        frame2.setSize(2100, 1000);
        frame2.setVisible(true);
    }
    void veg_starters()
    {
        panel1.removeAll();
        panel1.revalidate();
        panel1.repaint();
        panel1.setVisible(false);
        int j=140,k=140,l=140;
        String[] startersItems = {
            "Veg Corn Soup", "Veg Sweet Corn Soup", "Veg Manchurian Dry", 
            "Paneer 65", "Paneer Chilli", "Mushroom Chilli", "Mushroom 65"
        };
        float[] startersPrices = {170, 180, 300, 320, 320, 310, 310};

        panel1.setVisible(false);
        Color c = new Color(250, 230, 211);
        JPanel panel = new JPanel();
        panel.setBackground(c);
        frame2.add(panel);
        panel.setBounds(300,100,800,800);

        JLabel title = new JLabel("VEG STARTERS ");
        title.setBounds(330, 10, 250, 50);
        title.setFont(new Font("Times New Roman", Font.BOLD, 25));
        panel.add(title);
        JLabel itm = new JLabel("ITEM");
         itm.setFont(new Font("Times New Roman", Font.BOLD, 15));
         itm.setBounds(100, 100, 100, 30);
         JLabel prc = new JLabel("PRICE(Rs)");
         prc.setFont(new Font("Times New Roman", Font.BOLD, 15));
         prc.setBounds(400, 100, 100, 30);
         panel.add(itm);
         panel.add(prc);

        for(int i=0;i<startersItems.length;i++){
            String item = startersItems[i];
             float price = startersPrices[i];
             JButton addButton = new JButton("Add to billing");
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
            itemss.setBounds(100, j, 200, 20);
             j += 40;
             panel.add(itemss);
             JLabel pricess = new JLabel(Float.toString(price));
             pricess.setBounds(400, k, 100, 20);
             k += 40;
             panel.add(pricess);
             addButton.setBounds(600, l, 140, 20);
             l += 40;
             panel.add(addButton);

            panel.setLayout(null);
        }
        frame2.add(panel);
        panel.setVisible(true);
    }
    void veg_biryani()
    {
        panel1.removeAll();
        panel1.revalidate();
        panel1.repaint();
        panel1.setVisible(false);
        int j=140,k=140,l=140;
        String[] biryanisItems = {
            "South Indian Thali", "Special Curd Rice", "Paneer Biryani", 
            "Veg Biryani", "Curd Rice", "Cashew Biryanis"
        };
        float[] biryanisPrices = {270, 190, 340, 260, 140, 360};

        panel1.setVisible(false);
        Color c = new Color(250, 230, 211);
        JPanel panel = new JPanel();
        panel.setBackground(c);
        frame2.add(panel);
        panel.setBounds(300,100,800,800);

        JLabel title = new JLabel("VEG BIRYANIS ");
        title.setBounds(330, 10, 250, 50);
        title.setFont(new Font("Times New Roman", Font.BOLD, 25));
        panel.add(title);
        JLabel itm = new JLabel("ITEM");
         itm.setFont(new Font("Times New Roman", Font.BOLD, 15));
         itm.setBounds(100, 100, 100, 30);
         JLabel prc = new JLabel("PRICE(Rs)");
         prc.setFont(new Font("Times New Roman", Font.BOLD, 15));
         prc.setBounds(400, 100, 100, 30);
         panel.add(itm);
         panel.add(prc);

        for(int i=0;i<biryanisItems.length;i++){
            String item = biryanisItems[i];
             float price = biryanisPrices[i];
             JButton addButton = new JButton("Add to billing");
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
            itemss.setBounds(100, j, 200, 20);
             j += 40;
             panel.add(itemss);
             JLabel pricess = new JLabel(Float.toString(price));
             pricess.setBounds(400, k, 100, 20);
             k += 40;
             panel.add(pricess);
             addButton.setBounds(600, l, 140, 20);
             l += 40;
             panel.add(addButton);

            panel.setLayout(null);
        }
        frame2.add(panel);
        panel.setVisible(true);

    }
    void veg_chinese()
    {
        panel1.removeAll();
        panel1.revalidate();
        panel1.repaint();
        panel1.setVisible(false);
        int j=80,k=80,l=80;
        String[] chineseItems = {
            "Chilly Garlic Noodles", "Veg Noodles", "Veg Schezwan Noodles",
            "Paneer Noodles", "Corn Noodles", "Mushroom Fried Rice",
            "Special Veg Fried Rice", "Vegetable Fried Rice", "Schezwan Vegetable Fried Rice",
            "Veg Singapore Fried Rice", "Paneer Fried Rice", "Special Paneer Fried Rice",
            "Cashew Fried Rice", "Corn Fried Rice"
        };
        float[] chinesePrices = {250, 260, 220, 310, 320, 290, 340, 250, 260, 290, 310, 350, 320, 280};

        Color c = new Color(250, 230, 211);
        JPanel panel = new JPanel();
        panel.setBackground(c);
        frame2.add(panel);
        panel.setBounds(300,100,800,800);

        JLabel title = new JLabel("VEG CHINESE ");
        title.setBounds(330, 0, 250, 50);
        title.setFont(new Font("Times New Roman", Font.BOLD, 25));
        panel.add(title);
        JLabel itm = new JLabel("ITEM");
         itm.setFont(new Font("Times New Roman", Font.BOLD, 15));
         itm.setBounds(100, 50, 100, 30);
         JLabel prc = new JLabel("PRICE(Rs)");
         prc.setFont(new Font("Times New Roman", Font.BOLD, 15));
         prc.setBounds(400, 50, 100, 30);
         panel.add(itm);
         panel.add(prc);

        for(int i=0;i<chineseItems.length;i++){
            String item = chineseItems[i];
             float price = chinesePrices[i];
             JButton addButton = new JButton("Add to billing");
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
            itemss.setBounds(100, j, 200, 20);
             j += 40;
             panel.add(itemss);
             JLabel pricess = new JLabel(Float.toString(price));
             pricess.setBounds(400, k, 100, 20);
             k += 40;
             panel.add(pricess);
             addButton.setBounds(600, l, 140, 20);
             l += 40;
             panel.add(addButton);

            panel.setLayout(null);
        }
        frame2.add(panel);
        panel.setVisible(true);
    }
    void nonveg_menu()
    {
    
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

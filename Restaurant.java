import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Veg
{
    static Queue<String> starter = new LinkedList<>();
    static Scanner sc = new Scanner(System.in);
    static void mainveg()
    {
        System.out.println(" -------------------------------------------------------------------------------------------------------");
        System.out.println(" | 1. STARTERS \t 2.BIRYANIS \t 3.CHINESE \t 4.DESSERTS \t 5.BILLING \t 6.BACK(press any key) |");
        System.out.println(" -------------------------------------------------------------------------------------------------------");
        int ans = sc.nextInt();
        switch(ans)
        {
            case 1:
                veg_starters();
                break;
            case 2:
                //veg_biryanis();
                break;
            case 3:
                //chinese();
                break;
            case 4:
                //desserts();
                break;
            case 5:
                //billing();
                break;
        }
    }
    static void veg_starters()
    {
        System.out.println(" ---------------- VEG STARTERS ------------");
        System.out.println(" |       ITEM            |    PRICE       |");
        System.out.println(" | 1.Veg Corn Soup       |     Rs.170/-   |");
        System.out.println(" | 2.Veg Sweet Corn Soup |     Rs.180/-   |");
        System.out.println(" | 3.Veg Manchurian Dry  |     Rs.300/-   |");
        System.out.println(" | 4.Paneern 65          |     Rs.320/-   |");
        System.out.println(" | 5.Paneer Chilli       |     Rs.320/-   |");
        System.out.println(" | 6.Mushroom Chilli     |     Rs.310/-   |");
        System.out.println(" | 7.Mushroom 65         |     Rs.310/-   |");
        System.out.println(" | 8.Paneer Chilli       |     Rs.320/-   |");
        System.out.println(" ------------------------------------------");
        System.out.println(" | 9.Back              |       10.Billing |");
        System.out.println(" ------------------------------------------");
        System.out.println("\n\n");
        System.out.println(" enter the item number : ");
        int item_no = sc.nextInt();
        if(item_no == 1)
        {
            starter.add("veg Corn Soup");
            starter.add("170");
        }else if(item_no == 2)
        {
            starter.add("veg Sweet Corn Soup");
            starter.add("180");
        }else if(item_no == 3)
        {
            starter.add("veg Manchurian Dry");
            starter.add("300");
        }else if(item_no == 4)
        {
            starter.add("Paneer 65");
            starter.add("320");
        }else if(item_no == 5)
        {
            starter.add("Paneer Chilli ");
            starter.add("320");
        }else if(item_no == 6)
        {
            starter.add("Mushroom Chilli ");
            starter.add("310");
        }else if(item_no == 7)
        {
            starter.add("Mushroom 65");
            starter.add("310");
        }else if(item_no == 8)
        {
            starter.add("Paneer Chilli ");
            starter.add("320");
        }
        System.out.println(" enter the quantity    : ");
        int item_qnt = sc.nextInt();
        String qnt = Integer.toString(item_qnt);
        starter.add(qnt);
        System.out.println(starter);
        System.out.println(" do you want to continue with starters again ( yes - 1 / no - press any key) : ");
        int yes_no = sc.nextInt();
        if(yes_no == 1)
        {
            veg_starters();
        }else
        {
            mainveg();
        }

    }
    static void veg_biryanis()
    {
        System.out.println(" ----------------- VEG BIRYANIS --------------");
        System.out.println(" |       ITEM               |     PRICE       |");
        System.out.println(" | 1.South Indian Thali     |     Rs.270/-    |");
        System.out.println(" | 2.Special Sambar Rice    |     Rs.200/-    |");
        System.out.println(" | 3.Paneer Biryani         |     Rs.340/-    |");
        System.out.println(" | 4.Veg Biryani            |     Rs.260/-    |");
        System.out.println(" | 5.Paneer Chilli          |     Rs.320/-    |");
        System.out.println(" | 6.Curd Rice              |     Rs.140/-    |");
        System.out.println(" | 7.Cashew Biryani         |     Rs.360/-    |");
        System.out.println(" ----------------------------------------------");
        System.out.println(" | 9.Back                   |      10.Billing |");
        System.out.println(" ---------------------------------------------");
        System.out.println("\n\n");
    }
}
class Nonveg
{

}
class Restaurant
{
    void selection()
    {
        while(true)
        {
            System.out.println("--------------");
            System.out.println(" | 1.veg    | \n | 2.nonveg | \n | 3.exit   | ");
            System.out.println("--------------");
            System.out.print(" select from above : ");
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();
            switch(ch)
            {
                case 1:
                    Veg veg_obj = new Veg();
                    veg_obj.mainveg();
            }
        }
    }
    public static void main(String[] args) {
        Restaurant obj = new Restaurant();
        obj.selection();
    }
}
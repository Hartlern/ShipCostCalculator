import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is the price of your item?");
        double price = 0;
        int freeShipping = 100;
        double shippingCost = price * 0.02;
        String trash = "";
        if (scan.hasNextDouble())
        {
            price = scan.nextDouble();
            scan.nextLine();
            System.out.println("your price was " + price);
            if (price >= freeShipping) ;
            {
                System.out.println("Your item of " + price + " receives free shipping. Total cost of: " + price);
            }
            else
            {
                price = price + shippingCost;
                System.out.println("your item is too cheap to receive free shipping");
                System.out.println("The shipping cost of your item is " + shippingCost + " leaving your total at " + price);
            }

        }
        else
        {
            trash = scan.nextLine();
            System.out.println("/nYou said your price was " + trash);
            System.out.println("Run the program again");
        }
    }
}

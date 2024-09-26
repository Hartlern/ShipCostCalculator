import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner( System.in );
        System.out.println( "What is the price of your item?" );
        double price;
        double freeShipping = 100;
        String trash;
        if( scan.hasNextDouble() )
        {
            price = scan.nextDouble();
            scan.nextLine();
            if( price >= 0.0 )
            {
                System.out.println( "your price was " + price );
                if( price >= freeShipping )
                {
                    System.out.println( "Your item of " + price + " receives free shipping. Total cost of: " + price );
                }
                else
                {
                    double shippingCost = price * 0.02;
                    price = price + shippingCost;
                    System.out.println( "your item is too cheap to receive free shipping" );
                    System.out.println( "The shipping cost of your item is " + shippingCost + " leaving your total at " + price );
                }
            }
            else
            {
                System.out.println( "ERROR: Enter a number >= 0" );
            }
        }
        else
        {
            trash = scan.nextLine();
            System.out.println( "\nYou said your price was " + trash );
            System.out.println( "Run the program again" );
        }
    }
}

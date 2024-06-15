/*Sheetal Verma
Codsoft
Task 4 Currency convertor
*/
import java.util.*;
class CurrencyConvertor
{
    String baseCurrency,targetCurrency;
    float amount;
    double target;
    Scanner sc=new Scanner(System.in);
    void show()
    {
        System.out.print("\n\n                             * * * CURRENCY CONVERTOR * * *");
    }
    void currency()
    {
        System.out.print("\nEnter base currency : ");
        baseCurrency=sc.next();
        System.out.print("Enter target currency :");
        targetCurrency=sc.next();
        System.out.print("Enter amount :");
        amount = sc.nextFloat();
    }

    void conversion()
    {
        while(baseCurrency.equalsIgnoreCase("rupees"))
        {
            if(targetCurrency.equalsIgnoreCase("Yen")) {
                /*1.00 Indian Rupee =1.8685449 yen*/
                target= amount * 1.8685449;
                System.out.println("₹ " + amount + " Indian Rupees = ¥  " + target + " Japanese yen");
                currency();

            }
            else if(targetCurrency.equalsIgnoreCase("Dollar"))
            {
                /*1.00 Indian Rupee =0.012 Dollar*/
                target= amount * 0.012;
                System.out.println("₹ " + amount + " Indian Rupees = $  " + target + " Dollar");
                currency();
            }
            else if(targetCurrency.equalsIgnoreCase("euro"))
            {
                /*1.00 Indian Rupee =0.012 Dollar*/
                target= amount * 0.011;
                System.out.println("₹ " + amount + " Indian Rupees =  € " + target + " Euro");
                currency();
            }
        }
        while(baseCurrency.equalsIgnoreCase("yen"))
        {
            if(targetCurrency.equalsIgnoreCase("rupees")) {
                /*1.00/1.8685449 Indian Rupee =yen*/
                target = amount / 1.8685449;
                System.out.println( "¥  " + amount + " Japanese yen = ₹ " + target + " Indian Rupees ");

                currency();
            }
            else if(targetCurrency.equalsIgnoreCase("Dollar"))
            {
                /*1.00 yen =0.0064 Dollar*/
                target= amount * 0.0064;
                System.out.println( "¥  " + amount + " Japanese yen = ₹ "+ target + " Dollar");
                currency();
            }
            else if(targetCurrency.equalsIgnoreCase("Euro"))
            {
                /*1.00 yen =0.0059 euro*/
                target = amount * 0.0059;
                System.out.println( "¥  " + amount + " Japanese yen = €  "+ target+ "Euro");
                currency();
            }

        }
        while(baseCurrency.equalsIgnoreCase("Euro")) {
            if (targetCurrency.equalsIgnoreCase("rupees")) {
                /*1 euro = 90.84 rupees*/
                target = amount *90.84;
                System.out.println("€  " + amount + " Euro = ₹ " + target + " Indian Rupees ");
                currency();
            }
            else if(targetCurrency.equalsIgnoreCase("yen")) {
                /*1.00 euro = 169.36 yen*/
                target = amount *169.36;
                System.out.println("€  " + amount + " Euro = ¥  " + target + " Japenese yen ");
                currency();
            }
            else if(targetCurrency.equalsIgnoreCase("Dollar")) {
                /* 1 euro =1.09 dollar*/
                target = amount *1.09;
                System.out.println("€  " + amount + " Euro = $  " + target + " Dollar");
                currency();
            }
        }

    }


}
public class Task4 {
    public static void main(String agr[])
    {
        CurrencyConvertor c=new CurrencyConvertor();
        c.show();
        c.currency();
        c.conversion();
        c.currency();
    }
}


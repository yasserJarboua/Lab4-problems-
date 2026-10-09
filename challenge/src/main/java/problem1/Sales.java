package problem1;
import java.util.Scanner;
public class Sales
{
    public static void main(String[] args)
    {
        int salesPeople;
        int sum;
        Scanner scan = new Scanner(System.in);
        System.out.print("Entre the number of sales people: ");
        salesPeople=scan.nextInt();
        int[] sales = new int[salesPeople];
        for (int i=0; i<sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + (1+i) + ": ");
            sales[i] = scan.nextInt();
        }
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;
        int maxSalesPerson=0;
        int minSalesPerson=0;
        for (int i=0; i<sales.length; i++)
        {
            System.out.println(" " + (i+1) + " " + sales[i]);
            sum += sales[i];
            if(sales[maxSalesPerson]<sales[i]){
                maxSalesPerson=i;
            }
            if(sales[minSalesPerson]>sales[i]){
                minSalesPerson=i;
            }
        }
        System.out.println("Total sales: " + sum);
        System.out.println("The average sales: "+sum/salesPeople);
        System.out.println(("Salesperson "+(maxSalesPerson+1)+"" +
                " had the highest sale with $"+sales[maxSalesPerson]+"."));
        System.out.println(("Salesperson "+(minSalesPerson+1)+"" +
                " had the lowest sale with $"+sales[minSalesPerson]+"."));
        System.out.print("Entre a value: ");
        int value=scan.nextInt();
        int counter=0;
        for(int i=0;i<salesPeople;i++){
            if(sales[i]>value) {
                System.out.println("Sales person " + (i +1)+ " has sales more then "
                        + value + " and has $" + sales[i] + " in sales.");
                counter++;
            }
        }
        System.out.println("The total number of sales persons who exceeded "
                +value+" in sales is "+counter);

    }
}
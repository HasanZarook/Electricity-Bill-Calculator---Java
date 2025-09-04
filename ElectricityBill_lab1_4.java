package lab1;

import java.util.Scanner;

public class ElectricityBill_lab1_4 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the total Units : ");
        int units=input.nextInt();
        int bill;
        if (units<=100)
        {
            bill = 5 * units;
            System.out.println("Bill: " + bill + "Rs");
        }
        else if(units<=200)
        {bill=(100*5)+((units-100)*7);
            System.out.println("Bill: " + bill + "Rs");
        }
        else if(units>200)
        {bill=(100*5)+(100*7)+((units-200)*15);
            System.out.println("Bill: " + bill + "Rs");
        }
    }



}


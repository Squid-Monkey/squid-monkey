package templates;

import java.util.Scanner;

public class TaskControlledWhileLoop {
    public static void main(String[] args) {

        float rate, balance = 1000;
        int year=1;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your interst rate: ");
        rate = input.nextFloat();

        System.out.println("\n\n");

        while(balance<=3000){
            balance += (balance*rate)/100;
            System.out.print("Balance at end of year " + year + "is EUR " + String.format("%.2f",balance));

            year++;

        }
    }
}

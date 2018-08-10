import java.util.Scanner;

public class Lesson6 {
    public static void main(String args[]){
        //If -- else
        //If, then, else
        //If, then, else, then
        //You can have an if without an else
        /*
        System.out.println("Enter the amount of sales for employee 1: ");
        Scanner scan = new Scanner(System.in);
        double sales = scan.nextDouble();
        double baseBonus = 100;
        double totalBonus = 0;

        if(sales >= 50000){
                totalBonus = baseBonus + sales*.05;
        }
        else{
            totalBonus = baseBonus + sales * .01;
        }

        System.out.println("The total bonus is: " + totalBonus);
        */

        double sales = 75000;
        char employeeType = 'b';
        double bonus = 0;

        if(sales > 50000 && sales < 75000){
            if(employeeType == 'a'){
                bonus = sales *.05;
            }
            if(employeeType == 'b'){
                bonus = sales * .1;
            }
        }
        //Intentional bug -- should be >= on line below
        else if(sales > 75000){
            if(employeeType == 'a'){
                bonus = sales *.10;
            }
            if(employeeType == 'b'){
                bonus = sales * .15;
            }
        }
        else{
            bonus = sales*.01;
        }

        System.out.println("The bonus is: " + bonus);

        // > -- greater than, < -- less than, == equal to, ! -- not (used with booleans like saying "not true"),
        // >= -- greater than / equal to, <= -- less than / equal to, != not equal to
        // && -- AND (meaning more than 1 condition must be met), || -- Or.


    }
}

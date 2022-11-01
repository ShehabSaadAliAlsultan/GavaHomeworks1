package lab3;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String x;
        System.out.println("enter the month :");
        x=in.next();
        if (x.equals("january"))
            System.out.println("the number of dates is :" + 31);
        else if (x.equals("february"))
            System.out.println("the number of dates is :" + 30);
        else if  (x.equals("march"))
            System.out.println("the number of dates is :" + 31);
        else if (x.equals("aril"))
            System.out.println("the number of dates is :" + 30);
        else if (x.equals("may"))
            System.out.println("the number of dates is :" + 31);
        else if (x.equals("june"))
            System.out.println("the number of dates is :" + 30);
       else if (x.equals("july"))
            System.out.println("the number of dates is :" + 31);
        else if (x.equals("august"))
            System.out.println("the number of dates is :" + 30);
        else if (x.equals("september"))
            System.out.println("the number of dates is :" + 31);
        else if (x.equals("october"))
            System.out.println("the number of dates is :" + 30);
         else if (x.equals("november"))
            System.out.println("the number of dates is :" + 31);
        else if (x.equals("december"))
            System.out.println("the number of dates is :" + 30);


    }
}

package lab6;
import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        int  number ,  digit=0  , add=0 ;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number: ");
        number=in.nextInt();

        System.out.println("Number "+number+" in binary is: ");

        for (int i = 0; i <8 ; i++) {        /** *على اي اساس عمل اللوب لكي يقوم بطباعة جميع ال digit عند تحويل الرقم المدخل الى binary بدون زيادة
         لان اللوب الان يقوم بتحويل العدد المدخل الى ثمانية بت .*/
            add++;
            digit=number%2;
            number=number/2;

            System.out.println(" "+digit);
        }
        System.out.println("the number is divided "+add+" times");
    }
}

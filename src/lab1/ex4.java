package lab1;

public class ex4 {
    public static void main(String[] args) {
        int balance=1000;


        System.out.println("balance in first year is : " + (balance+=(balance/20)));
        System.out.println("balance in second year is : " + (balance+=(balance/20)));
        System.out.println("balance in third year is : " + (balance+=(balance/20)));

    }
}

package lab4;
import javax.swing.*;
import java.awt.*;
public class ex8 {
    public static void main(String[] args) {
        JFrame x=new JFrame("My_Name" );

        x.setSize(500,500);
        MyDraw d=new MyDraw();
        x.add(d);
        x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        x.setVisible(true);

    }
}

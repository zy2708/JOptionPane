import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *To learn how to use JOptionPane.
 *Author: Zhonglin Yang
 *E-mail Address: zy2708@email.vccs.edu
 *Last Changed: September 17, 2017
 */
public class Demo
{
    public static void main(String[] args)
    {
        Scanner Keyboard = new Scanner (System.in );
        System.out.println("Enter a boolean value");
        Boolean booleanvar = Keyboard.nextBoolean();
        System.out.println("Enter a char value");
        char charvar = Keyboard.next().charAt(0);
        System.out.println("Enter a double value");
        double doublevar = Keyboard.nextDouble();
        System.out.println("Enter a float value");
        float floatvar = Keyboard.nextFloat();
        System.out.println("Enter a long value");
        long longvar = Keyboard.nextLong();
        System.out.println("Enter an int value");
        int intvar = Keyboard.nextInt();
        System.out.println("Enter a short value");
        short shortvar = Keyboard.nextShort();
        System.out.println("Enter a byte value");
        byte bytevar = Keyboard.nextByte();
        JOptionPane.showMessageDialog(null,
                "The boolean value you entered is "+booleanvar+"."+"\n"+
                        "The char value you entered is "+charvar+"."+"\n"+
                        "The doouble value you entered is "+doublevar+"."+"\n"+
                        "The float value you entered is "+floatvar+"."+"\n"+
                        "The long value you entered is "+longvar+"."+"\n"+
                        "The int value you entered is "+intvar+"."+"\n"+
                        "The short value you entered is "+shortvar+"."+"\n"+
                        "The byte value you entered is "+bytevar+"."
        );

    }



}

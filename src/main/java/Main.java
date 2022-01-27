import java.math.BigDecimal;
import java.util.Scanner;

//program to get whole and fractional parts from a double value
public class Main {
    public static void main(String[] args) {
       /* double num;
        int iPart;
        double fPart;
        num = 2.36;
         iPart = (int) num;
        fPart = num - iPart;
        System.out.println("Integer part = " + iPart);
        System.out.println("Fractional part = " + fPart);
        */

        //double d = 1211.3856;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a double value : ");
        double d = sc.nextDouble();

        BigDecimal bigD = BigDecimal.valueOf(d);
        int intPart = bigD.intValue();
        double fractionalPart = bigD.subtract(BigDecimal.valueOf(intPart)).doubleValue();
        System.out.println("fractionalpart : " + fractionalPart);
        System.out.println("intergral part : " + intPart);
    }
}

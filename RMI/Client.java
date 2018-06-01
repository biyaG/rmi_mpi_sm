import java.rmi.*;
import java.util.Random;
// run independently (so has it's own main method)
public class Client{
    public static void main(String a[]) throws Exception{
    	// we don't know where AddC is, so client will ask
    	// the rmi registry to lookup for the catption name ADD
    	// we require object of interface so use type casting 
        Calculatorr obj = (Calculatorr)Naming.lookup("CAL");
        int x = 12;
        int y = 6;
        int n = obj.add(x, y);
        System.out.println("addition is : " + n);
        int m = obj.div(x, y);
        System.out.println("The dividend is : " + m);
        int s = obj.mul(x, y);
        System.out.println("The product is : " + s);
        int q = obj.sub(x, y);
        System.out.println("The difference is : " + q);
    }
}
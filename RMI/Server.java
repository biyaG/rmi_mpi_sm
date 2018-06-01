import java.rmi.*;
// run independently (so has it's own main method)
public class Server{
    public static void main(String a[]) throws Exception{
        Calculator obj = new Calculator();
        // register the name using the caption name ADD to registry table
        Naming.rebind("CAL", obj);
        System.out.println("Server Started");
    }
}
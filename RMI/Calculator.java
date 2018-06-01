import java.rmi.*;
import java.rmi.server.*;
// to create stub and sketleton latter while compiling we need to extend UnicastRemoteObject
// UnicastRemoteObject give as the features of Remote Object that is AddI
public class Calculator extends UnicastRemoteObject implements Calculatorr{
    public Calculator() throws Exception{
    	// handle the exceptions that will be caused by UnicastRemoteObject
    	// when create object of AddC class, this constructor will be called to handle the exception
        super();
    }
    public int add(int x, int y){
        return x + y;
    }
    public int sub(int x, int y){
        return x - y;
    }
    public int div(int x, int y){
        return x / y;
    }
    public int mul(int x, int y){
        return x * y;
    }
}
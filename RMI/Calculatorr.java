import java.rmi.Remote;
// AddI will be a remote interface
public interface Calculatorr extends Remote{

    public int add(int x, int y) throws Exception; // to handle exceptions
    public int sub(int x, int y) throws Exception; // to handle exceptions
    public int div(int x, int y) throws Exception; // to handle exceptions
    public int mul(int x, int y) throws Exception; // to handle exceptions


}
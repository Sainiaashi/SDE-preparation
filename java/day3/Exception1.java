
import java.util.*;
public class Exception1
{
    public static void main(String []args)
    {
        try
        {
            int result=10/2;
            System.out.println(result);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception");
        }
       
        int arr[]={1,2,3};
        try
        {
           int a=arr[2];
           System.out.println(a);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        
        String a=null;
        try
        {
            int b=a.length();
            System.out.println(b);
        }
        catch(NullPointerException e)
        {
            System.out.println(e);
        }
    }
}
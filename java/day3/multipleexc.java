public class multipleexc
{
    public static void main(String []args)
    {
        try
        {
            int a=3/0;
            System.out.println(a);
        }
        catch(ArithmeticException e)
        {
            System.out.println("A.m");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("A.O.B");
        }
        finally
        {
            System.out.println("it is finally block...");
        }


        if(2>1)
        {
            throw new ArithmeticException("not possible");
        }
    }
}
public class invalidmarks
{
    static void checkmarks(int mark) throws invalid//here we use it
    {
        if(mark<0||mark>100)
        {
            throw new invalid("not possible");
        }
    }
    public static void main(String []args)
    {
        try
        {
            checkmarks(0);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
class invalid extends Exception
{
    invalid(String msg)
    {
        super(msg);//custom exception
    }
}











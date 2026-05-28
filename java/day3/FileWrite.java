import java.io.*;
import java.io.FileWriter;
public class FileWrite
{
    public static void main(String []args)
    {
        FileWriter fw=null;
      try
      {
         fw=new FileWriter("abc.txt");
        // fw.write("hello filewriter");
        fw.write("this is overwrite");
        System.out.println("write successfully");
      }
      catch(IOException e)
      {
        System.out.println(e);
      }
      finally
      {
        try
        {
            if(fw!=null)
            {
                fw.close();
            }
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
      }
    }
}
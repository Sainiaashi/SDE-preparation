import java.io.File;
import java.io.FileNotFoundException;
import java.util.scanner;
public class FileRead
{
    public static void main(String []args)
    {
     try
     {
        File f=new File("abc.txt");
        int data;
        while(f.read()!=-1)
        {
            data=f.read();
            System.out.println((char)data);
        }
        f.close();
     }
     catch(Exception e)
     {
        System.out.println(e);
     }
    }
}
import java.util.*;
import java.io.*;
public class notesmanager
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String data;
        System.out.println("enter data:");
        data=sc.nextLine();
        FileWriter fw=null;
        FileReader f=null;
        int ch;
        while(true)
        {
            System.out.println("1. add note. 2.view notes.3.exit.");
            System.out.println("enter choice");
            ch=sc.nextInt();
            sc.nextLine();
            switch(ch)
            {
                case 1:
                  try{
                      String note;
                    System.out.println("enter note");
                    note=sc.nextLine();
                    fw=new FileWriter("note.txt",true);
                    fw.write(note);
                    fw.close();
                  }
                  catch(IOException e)
                  {
                    System.out.println(e);
                  }
                    break;
                case 2:
                    try
                    {
                        f=new FileReader("note.txt");
                    int d;
                    while((d=f.read())!=-1)
                    {
                        System.out.println((char)d);
                    }
                    f.close();
                    }
                    catch(IOException e)
                    {
                        System.out.println(e);
                    }
                    break;
                case 3:
                    return;
                default:
                    System.out.println("wrong choice");
            }
        }
    }
}
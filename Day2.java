import java.util.*;
public class Day2
{
    public static void main(String []args)
    {
        ArrayList<String> list=new ArrayList<>();
        list.add("Ram");
        list.add("sita");
        list.add(1,"Aashi");
        System.out.println(list.get(2));
        list.set(1,"me");
        list.remove(1);
        list.remove(String.valueOf("ram"));
        int size=list.size();
        System.out.println(size);
        System.out.println(list);

        LinkedList<String> student=new LinkedList<>();
        student.add("Ram");
        student.add("shyam");
        student.addFirst("radha");
        student.addLast("Aashi");
        student.remove();//remove fist
        boolean b=student.contains("Aashi");
        System.out.println(b);
        for(String name:student)
        {
            System.out.println(name);
        }

        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(1,80);
        map.put(2,60);
        for(Integer marks : map.values())
        {
            System.out.println(marks);
        }
         for(Integer marks : map.keySet())
        {
            System.out.println(marks);
        }

        HashSet<String> cities=new HashSet<>();
        cities.add("meerut");
        cities.add("meerut");
        System.out.println(cities);
        
    }
}
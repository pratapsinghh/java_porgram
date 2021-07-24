import java.util.*;
class listItrator
{
  public static void main(String[] args)
  {
    ArrayList ar=new ArrayList();
    ar.add("Ram");
    ar.add("Aman");
    ar.add("Rajat");
    ar.add("Banana");
    ar.add("Vimal");
    System.out.println("print data by iterator");
    Iterator list=ar.iterator();
    while(list.hasNext())
    {
      String str=(String)list.next();
      System.out.println(str);
    }
    System.out.println("print data using for loop");
    for(int i=0;i<ar.size();i++)
    {
       System.out.println(ar.get(i));
    }
    System.out.println("print using lambda expression");
    ar.forEach(a->{//lambda expression 
                    System.out.println(a);
                  });
    System.out.println("print data using forEachRemaining");
    Iterator l=ar.iterator();
    l.forEachRemaining(a->{
         System.out.println(a);
         });
                  
 }
}

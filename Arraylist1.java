import java.util.*;
class Arraylist1
{
   public static void main(String[] args)
   {
      ArrayList a=new ArrayList();
      a.add("Hello");
      a.add(12);
      a.add('a');
      a.add(1.234);
      System.out.println(a);
      Iterator itr=a.iterator();
      while(itr.hasNext())
      {
         System.out.println(itr.next());
      }
    }
}

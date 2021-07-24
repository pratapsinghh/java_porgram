import java.util.*;
class accessele
{
   public static void main(String[] args)
   {
      Set<Integer> l=new HashSet<>();
      l.add(2);
      l.add(3);
      l.add(4);
      l.add(5);
      l.add(6);
      System.out.println(l.contains(5));
      if(l.contains(4))
      {
         l.remove(4);
         l.add(12);
      }
      else
      {
          System.out.println("Not Found element");
      }
    System.out.println(l);
   }
}

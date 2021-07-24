import java.util.*;
class ex5
{
   public static void main(String[] args)
   {
      HashSet<Integer> h=new HashSet<>();
      h.add(3);
      h.add(5);
      h.add(7);
      h.add(1);
      h.add(2);
      System.out.println(h);
      TreeSet<Integer> t=new TreeSet<>();
      for(Integer x:h)
        t.add(x);
      System.out.println(t);
   }
}

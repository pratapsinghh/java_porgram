import java.util.*;
class hashset2
{
   public static HashSet<Integer> even(HashSet<Integer> h)
   {
       HashSet<Integer> a=new HashSet<>();
       for(Integer x:h)
       {
          if(x%2==0)
             a.add(x);
       }
       return a;
    }
   public static void main(String[] args)
   {
      HashSet<Integer> h=new HashSet<>();
      h.add(3);
      h.add(4);
      h.add(8);
      h.add(1);
      h.add(11);
      h.add(12);
      h.add(26);
      h.add(21);
      HashSet<Integer> h1=new HashSet<>();
      h1.addAll(even(h));
      System.out.println(h);
      System.out.println(h1);
      Iterator itr=h.iterator();
      while(itr.hasNext())
      {
         System.out.println(itr.next());
      }
    }
}

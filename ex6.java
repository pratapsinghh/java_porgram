import java.util.*;
class ex6
{
   public static void main(String[] args)
   {
       HashSet<Integer> h=new HashSet<>();
       h.add(1);
       h.add(4);
       h.add(2);
       h.add(11);
       h.add(9);
       h.add(12);
       System.out.println(h);
       HashSet<Integer> h1=new HashSet<>();
       h1.add(1);
       h1.add(3);
       h1.add(2);
       h1.add(5);
       h1.add(9);
       h1.add(7);
       System.out.println(h1);
       HashSet<Integer> d=new HashSet<>();
       for(Integer x:h)
       {
          if(h1.contains(x))
          {
             d.add(x);
          }
       }
       System.out.println(d);
    }
}

import java.util.*;
class hashset
{
    public static int max(HashSet<Integer> h)
    {
         int x=0;
         for(Integer a:h)
         {
            if(a>x)
            x=a;
         }
         return x;
    }
    public static void main(String[] args)
    {
       HashSet<Integer> h=new HashSet<>();
       h.add(1);
       h.add(4);
       h.add(8);
       h.add(11);
       h.add(3);
       h.add(6);
       h.add(9);
       h.add(8);
       System.out.println(h);
     System.out.println( max(h));
      
       
    }
}

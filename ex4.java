import java.util.*;
class ex4
{
   public static void main(String[] args)
   {
       HashSet<Integer> h=new HashSet<>();
       h.add(1);
       h.add(3);
       h.add(2);
       h.add(7);
       h.add(9);
       Integer[] arr=new Integer[h.size()];
       h.toArray(arr);
       for(Integer x:arr)
       System.out.println(x);
    }
}

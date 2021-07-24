import java.util.*;
class ex3
{
    public static void main(String[] args)
    {
      HashSet<Integer> h=new HashSet<>();
      h.add(3);
      h.add(1);
      h.add(8);
      h.add(12);
      h.add(11);
      h.add(10);
      HashSet<Integer> h1=new HashSet<>();
      h1.addAll(h);
      System.out.println(h1);
     }
}

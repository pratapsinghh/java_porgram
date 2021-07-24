import java.util.*;
class list3
{
   public static void main(String[] args)
   {
      List l=new ArrayList();
      l.add("mango");
      l.add("orange");
      l.add("Banana");
      l.add("Grapes");
      String[] a=l.toArray(new String[l.size()]);
      for(String s:Arrays.toString(a))
      System.out.println(s);
   }
}

import java.util.*;
class forloop1
{
  public static void main(String[] args)
  {
     ArrayList ar=new ArrayList();
     ar.add(1);
     ar.add(34);
     ar.add(23);
     ar.add(45);
     ar.add(10);
     Collections.sort(ar);
     System.out.println(ar);
     Iterator itr=ar.iterator();
     while(itr.hasNext())
     {
        System.out.println(itr.next());
     }
     ArrayList string = new ArrayList();
     string.add("Hello");
     string.add("Moto");
     string.add("papaya");
     string.add("Mango");
     string.add("Apple");
     string.add("Orange");
     string.add("Hello");
     Collections.sort(string);
     System.out.println(string);
   }
}

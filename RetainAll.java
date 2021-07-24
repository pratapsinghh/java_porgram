import java.util.*;
class RetainAll
{
   public static void main(String[] args)
   {
      ArrayList ar=new ArrayList();
      ar.add("Aditya");
      ar.add("Aniket");
      ar.add("Ankit");
      ar.add("Pwan");
      
      ArrayList ar1=new ArrayList();
      ar1.add("Amit");
      ar1.add("Aniket");
      ar1.add("Anurag");
      ar1.add("Pwan");
      ar.retainAll(ar1);
      
      Iterator itr=ar.iterator();
      while(itr.hasNext())
      {
          //RetainAll list=(RetainAll)itr.next();
          System.out.println(itr.next());
      }
    }
}

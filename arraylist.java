import java.util.*;
class arraylist
{
   public static void main(String[] args)
   {
     int sum,sum1=0;
     ArrayList ar=new ArrayList();
     ar.add(1);
     ar.add(2);
      ar.add(3);
     ar.add(4);
      ar.add(5);
     ar.add(6);
     Iterator itr=ar.iterator();
     while(itr.hasNext())
     {
       sum=(Integer)itr.next();
       sum1+=sum;
     }
     System.out.println(sum1);
   }
}

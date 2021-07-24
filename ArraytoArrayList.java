import java.util.*;
class ArraytoArrayList
{
   public static void main(String[] args)
   {
     List a=new ArrayList();
     a.add(1);
     a.add(2);
     a.add(3);
     a.add(4);
     a.add(5);
     int[] x=new int[a.size()];
     Iterator itr=a.iterator();
     int i=0;
     while(itr.hasNext())
     {
       int b=(Integer)itr.next();
       x[i]=b;
       i++;
     }
   for(int s:x)
     System.out.println(s);
  }
}

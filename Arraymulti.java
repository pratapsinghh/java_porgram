import java.util.Scanner;
import java.util.*;
class Arraymulti
{
   public static void main(String[] args)
   {
      int m=1;
      ArrayList ar=new ArrayList();
      Scanner sc=new Scanner(System.in);
      for(int i=0;i<6;i++)
      {
         int b=sc.nextInt();
         ar.add(b);
      }
      Iterator itr = ar.iterator();
      while(itr.hasNext())
      {
         int a=(Integer)itr.next();
         m*=a;
      }
      System.out.println(m);
  }
}

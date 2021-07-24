import java.util.*;
import java.util.Scanner;
class ArrayListsum
{
   public static void main(String[] args)
   {
     ArrayList a=new ArrayList();
     Scanner sc=new Scanner(System.in);
     for(int i=0;i<5;i++)
     {
         int b=sc.nextInt();
         a.add(b);
    }
    System.out.println(a);
  }
}

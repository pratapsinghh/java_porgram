import java.util.*;
class Arraya
{
   public void insert(int[] arr)
   {
       Scanner sc=new Scanner(System.in);
       for(int i=0;i<arr.length;i++)
         arr[i]=sc.nextInt();
   }
   public void Display(int[] arr)
   {
      for(int i=0;i<arr.length;i++)
      {
         System.out.print(" "+arr[i]+" ");
      }
   }
   public int sum(int[] arr)
   {
     int sum=0;
     for(int i=0;i<arr.length;i++)
     {
        sum=sum+arr[i];
     }
     return sum;
   }
}
class FindElement
{
   public static void main(String[] args)
   {
      Arraya a=new Arraya();
      int[] arr=new int[10];
      a.insert(arr);
      a.Display(arr);
      int n=arr[arr.length-1];
      //System.out.println(arr[n]);
      int s=n*(n+1)/2;
      int miss;
      miss=s-a.sum(arr);
      System.out.println(miss);
   }
}

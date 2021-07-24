import java.util.*;
class CreateArray
{
   public void insert(int[] arr)
   {
       Scanner sc=new Scanner(System.in);
       for(int i=0;i<arr.length;i++)
       {
          arr[i]=sc.nextInt();
       }
    }
    public void findmiss(int[] arr)
    {
       int i=0,diff,l=0,d,sum=0;
       diff=arr[0]-0;
       for(i=0;i<arr.length;i++)
       {
          if((arr[i]-i)!=diff)
          {
              while(arr[i]-i>diff)
              {
                 System.out.printf("missing no. is  %d\n",diff+i);
                 diff++;
              }
          }
          System.out.println();
       }
    }
    public void display(int[] arr)
    {
       for(int i=0;i<arr.length;i++)
       System.out.print(arr[i]+"  ");
    }
}
          
class multiplemissing
{
  public static void main(String[] args)
  {
     int[] arr=new int[5];
     CreateArray a=new CreateArray();
     a.insert(arr);
     a.findmiss(arr);
     a.display(arr);
  }
}

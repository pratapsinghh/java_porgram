import java.util.*;
class findTheMissing
{
 public static void main(String[] args)
 {
  ArrayList<Integer> arr=new ArrayList<>();
  Scanner sc=new Scanner(System.in);
  for(int i=0;i<9;i++)
  {
     arr.add(sc.nextInt());
  }
  Collections.sort(arr);
  int x=arr.get(arr.size()-1);
  //System.out.println(x);
  int[] a=new int[x];
  for(int i=0;i<x;i++)
  {
    a[i]=0;
  }
  for(int i=0;i<x;i++)
  {
    a[arr.get(i)]++;
  }
  System.out.println(arr);
 }
}

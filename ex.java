import java.util.*;
class ex
{
  public static void main(String[] args)
  {
  HashSet<Integer> h=new HashSet<>();
  int count=0;
  h.add(1);
  h.add(5);
  h.add(6);
  h.add(8);
  System.out.println(h);
  for(Integer x:h)
  {
     count++;
  }
  System.out.println(count);
}
}

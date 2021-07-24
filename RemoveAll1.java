import java.util.*;
class RemoveAll1
{
   public static void main(String[] args)
   {
     int sum=0;
     List l=new ArrayList(Arrays.asList(12,13,14,15,16,17));
     System.out.println(l);
     List l1=new ArrayList(Arrays.asList(12,13,14,15,16,17));
     System.out.println(l1.size());
     if(l1.equals(l))
     {
        Iterator itr=l.iterator();
        Iterator itr1=l1.iterator();
        while(itr.hasNext()&& itr1.hasNext())
        {
           int x=(Integer)itr.next();
           int y=(Integer)itr1.next();
           sum=x+y;
           System.out.println(sum);
        }
    }
   }
}

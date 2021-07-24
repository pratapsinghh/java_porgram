import java.util.*;
class RemoveAll
{
   public static void main(String[] args)
   {
       List l=new ArrayList();
       l.add(1);
       l.add(2);
       l.add(3);
       l.add(4);
       l.add(5);
       List l1=new ArrayList();
       l1.add(1);
       l1.add(2);
       l1.add(3);
       l1.add(4);
       l1.add(5);
       l1.add(6);
       l1.removeAll(l);
       System.out.println(l1);
    }
}

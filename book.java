import java.util.*;
class Book_D
{
   int id;
   String name,w_name;
   int q;
   Book_D(int id,String name,String w_name,int q)
   {
      this.id=id;
      this.name=name;
      this.w_name=w_name;
      this.q=q;
   }
}
class book 
{
   public static void main(String[] args)
   {
      Book_D b=new Book_D(101,"C","BalaGurSwami",8);
      Book_D c=new Book_D(102,"java","Sun",5);
      Book_D d=new Book_D(103,"Python","Guido van Rosam",10);
      ArrayList a=new ArrayList();
      a.add(b);
      a.add(c);
      a.add(d);
      Iterator itr=a.iterator();
      while(itr.hasNext())
      {
         Book_D s=(Book_D) itr.next();
         System.out.println(s.id+ " "+s.name+" "+s.w_name+"  "+ s.q);
      }
    }
}

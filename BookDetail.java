import java.util.*;
class Book implements Comparable<Book>
{
   int id;
   String Subject,writer;
   int prise;
   Book(int id,String Subject,String writer,int prise)
   {
      this.id=id;
      this.Subject=Subject;
      this.writer=writer;
      this.prise=prise;
   }
   public int compareTo(Book b)
   {
     if(id>b.id)
         return 1;
     else
     {
         if(id<b.id)
            return -1;
         else
            return 0;
    }
  }
 }
 class BookDetail
 {
    public static void main(String[] args)
    {
        TreeSet<Book> l=new TreeSet<>();
        Book b1=new Book(123,"Java","sun brother",225);
        Book b2=new Book(111,"C#","Mc jhon",550);
        Book b3=new Book(110,"C++","Denish",250);
        l.add(b1);
        l.add(b2);
        l.add(b3);
        for(Book b:l)
        {
           System.out.println(b.id+"  "+b.Subject+"  "+b.writer+" "+b.prise);
        }
    }
}

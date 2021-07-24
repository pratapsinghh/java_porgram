import java.util.*;
class TimeTable
{
   int id;
   String subject;
   int id1;
   String subject1;
   int id2;
   String subject2;
   TimeTable(int id,String subject,int id1,String subject1,int id2,String subject2)
   {
      this.id=id;
      this.subject=subject;
      this.id1=id1;
      this.subject1=subject1;
      this.id2=id2;
      this.subject2=subject2;
   }
}
class createTime
{
   public static void main(String[] args)
   {
      TimeTable t1=new TimeTable(101,"Hindi",201,"English",103,"Math");
      TimeTable t2=new TimeTable(201,"English",103,"Math",101,"Hindi");
      TimeTable t3=new TimeTable(103,"Math",101,"Hindi",103,"Math");
      TimeTable t4=new TimeTable(202,"English",103,"Math",103,"Math");
      TimeTable t5=new TimeTable(101,"Hindi",201,"English",201,"English");
      ArrayList al=new ArrayList();
      al.add(t1);
      al.add(t2);
      al.add(t3);
      al.add(t4);
      al.add(t5);
      System.out.println(al);
      Iterator itr=al.iterator();
      while(itr.hasNext())
      {
          TimeTable a=(TimeTable)itr.next();
          System.out.println(a.id+" "+a.subject+" "+a.id1+"  "+a.subject1+"  "+a.id2+"  "+a.subject2);
      }
   }
}

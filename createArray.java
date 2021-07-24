import java.util.*;
class Student
{
   int age;
   String name;
   String last_name;
   long mobile_no;
   Student(int age,String n,String l,long m)
   {
     this.age=age;
     this.name=n;
     this.last_name=l;
     this.mobile_no=m;
   }
}
class createArray
{
   public static void main(String... args)
   {
      Student s1=new Student(21,"Ram","singh",9935353482l);
      Student s2=new Student(18,"Shohan","patel",9987399021l);
      Student s3=new Student(20,"Rohan","Yadav",9021234556l);
      ArrayList a=new ArrayList();
      a.add(s1);
      a.add(s2);
      a.add(s3);
      Iterator itr=a.iterator();
      while(itr.hasNext())
      {
        Student s=(Student)itr.next();
        System.out.println(s.age+"   "+s.name+"  "+s.last_name+"   "+s.mobile_no);
      }
      for(Student s:a)
      System.out.println(s.age+"   "+s.name+"  "+s.last_name+"   "+s.mobile_no);
      
   }
}

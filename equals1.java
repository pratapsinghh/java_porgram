import java.util.*;
class equals1
{
  public static void main(String[] args)
  {
      ArrayList list=new ArrayList();
      list.add("Data Science");   
      list.add("Testing");   
      list.add("C#");   
      list.add("Basic Language");   
      list.add("UML");   
      list.add("Algorithms ");   
      list.add("Computer Networks");  
      list.add("Python");  
      
      ArrayList list1=new ArrayList();
      list1.add("Data Science");   
      list1.add("Testing");   
      list1.add("C#");   
      list1.add("C Language");   
      list1.add("UML");   
      list1.add("Algorithms ");   
      list1.add("Computer Networks");  
      list1.add("Python"); 
      System.out.println(list.equals(list1));
   }
}

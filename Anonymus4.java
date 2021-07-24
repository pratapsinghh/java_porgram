class Anonymus implements Runnable
{
   public void run()
   {
      for(int i=0;i<10;i++)
      {
         System.out.println("child main");
      }
   }
}
class Anonymus4
{
   public static void main(String[] args)
   {
      Anonymus a=new Anonymus();
      Thread t=new Thread(a);
      t.start();
      for(int i=0;i<10;i++)
      {
         System.out.println("Main method");
      }
   }
}

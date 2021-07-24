class Anonymus extends Thread
{
  public void run()
  {
     for(int i=0;i<10;i++)
     {
        System.out.println("child thread");
     }
  }
}
class Anonymus2
{
   public static void main(String[] args)
   {
      Anonymus t=new Anonymus();
      t.start();
      for(int i=0;i<10;i++)
      {
          System.out.println("main thread");
      }
   }
}

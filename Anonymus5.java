class Anonymus5
{
  public static void main(String[] args)
  {
     Runnable r=new Runnable()
     {
        public void run()
        {
           System.out.println("You are in Anonymus class");
        }
     };
     Thread t=new Thread(r);
     t.start();
     for(int i=0;i<10;i++)
     {
        System.out.println("You are in main method");
     }
   }
}

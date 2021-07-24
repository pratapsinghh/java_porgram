class Anonymus6
{
   public static void main(String[] args)
   {
      new Thread(new Runnable(){
                                 public void run()
                                 {
                                    for(int i=0;i<10;i++)
                                    {
                                       System.out.println("hello");
                                    }
                                 }}).start();
     for(int i=0;i<10;i++)
     {
        System.out.println("bye");
     }
   }
}

class Anonymus
{
   public void sum(int x,int y)
   {
      System.out.println(x+y);
   }
   public static void main(String[] args)
   {
      Anonymus a=new Anonymus()
      {
         public void sum(int x,int y)
         {
            System.out.println(x+y);
         }
      };
      a.sum(10,12);
      Anonymus b=new Anonymus();
      b.sum(11,5);
    }
}

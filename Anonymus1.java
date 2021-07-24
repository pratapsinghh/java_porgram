class Anonymus
{
   public void test()
   {
      System.out.println("Salty");
   }
}
class Anonymus1
{
   public static void main(String[] args)
   {
     Anonymus a=new Anonymus()
     {
        public  void test()
        {
           System.out.println("Sweety");
        }
     };
     a.test();
     Anonymus t=new Anonymus();
     t.test();
     Anonymus b=new Anonymus()
     {
        public void test()
        {
           System.out.println("Spicy");
        }
     };
     b.test();
    }
}

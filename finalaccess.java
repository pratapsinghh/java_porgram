class finalaccess
{
   public static void m()
   {
      final int x=100;
      class inner
      {
         public void m2()
         {
            System.out.println(x);
         }
      }
      inner i=new inner();
      i.m2();
    }
    public static void main(String[] args)
    {
        m();
    }
}

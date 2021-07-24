class innerinmethod
{
   public static void m()
   {
       class inner
       {
           public void sum(int x,int y)
           {
              System.out.println(x+y);
           }
           public void mul(int x,int y)
           {
              System.out.println(x*y);
           }
           public void sum(int x,int y,int z)
           {
              System.out.println(x+y+z);
           }
       }
       inner i=new inner();
       i.sum(11,12);
       i.mul(10,9);
       i.sum(10,12,13);
    }
    public static void main(String[] args)
    {
       m();
    }
}

class binarytreeSearch
{
   static class Node
   {
      int data;
      Node lchild;
      Node rchild;
      Node(int d)
      {
         data=d;
         lchild=null;
         rchild=null;
      }
    }
    public Node insert(Node r,int d)
    {
       if(r==null)
       {
          Node temp=new Node(d);
          temp.lchild=null;
          temp.rchild=null;
          return temp;
       }
       else
       {
          if(r.data>d)
          {
             r.lchild=insert(r.lchild,d);
          }
          else
             r.rchild=insert(r.rchild,d);

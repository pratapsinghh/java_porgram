class binaryTree1
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
   public static Node root(int d)
   {
      Node root=new Node(d);
      root.lchild=null;
      root.rchild=null;
      return root;
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
            r.lchild=insert(r.lchild,d);
         else
             r.rchild=insert(r.rchild,d);
      }
      return r;
   }
   public void inorder(Node root)
   {
      if(root!=null)
      {
        inorder(root.lchild);
        System.out.print(root.data+" ");
        inorder(root.rchild);
      }
   }
   public void post(Node root)
   {
      if(root!=null)
      {
        post(root.lchild);
        post(root.rchild);
        System.out.print(root.data+" ");
      }
   }
    public static void main(String[] args)
    {
       Node root1=null;;
       binaryTree1 t=new binaryTree1();
       root1=t.insert(root1,9);
       t.insert(root1,15);
       t.insert(root1,5);
       t.insert(root1,20);
       t.insert(root1,16);
       t.insert(root1,8);
       t.insert(root1,3);
       t.insert(root1,6);
       t.inorder(root1);
       System.out.println();
       t.post(root1);
    }
}
      

class binaryTreeInsert
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
             r.lchild=insert(r.lchild,d);
          else
             r.rchild=insert(r.rchild,d);
      }
      return r;
    }
    public void new_insert(Node r,int key)
    {
       Node temp=new Node(key);
       temp.lchild=null;
       temp.rchild=null;
       Node q=r;
        while(r!=null)
        {
            q=r; 
            if(r.data>key)
            {
               r=r.lchild;
            }
            else
               r=r.rchild;
        }
        if(q.data>key)
        {
           q.lchild=temp;
        }
        else
           q.rchild=temp;
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
    public static void main(String... args)
    {
       Node root=null;
       binaryTreeInsert t=new binaryTreeInsert();
       root=t.insert(root,9);
       t.insert(root,15);
       t.insert(root,5);
       t.insert(root,20);
       t.insert(root,16);
       t.insert(root,8);
       t.insert(root,3);
       t.insert(root,6);
       t.inorder(root);
       System.out.println();
       t.new_insert(root,43);
       t.inorder(root);
       System.out.println();
       t.post(root);
       t.new_insert(root,2);
       System.out.println();
       t.inorder(root);
     }
}
       

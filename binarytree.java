class binarytree
{
  static class Node
  {
    char data;
    Node lchild;
    Node rchild;
    Node(char d)
    {
       data=d;
       lchild=null;
       rchild=null;
    }
  }
  public static Node root(char d)
    {
        Node root=new Node(d);
        root.lchild=null;
        root.rchild=null;
        return root;
    }
  public  void insert(Node root,char d)
    {
       Node temp=new Node(d);
       temp.lchild=null;
       temp.rchild=null;
       Node t=root;
       Node parent=root;
       while(t!=null)
       {
          parent=t;
          if(t.data>d)
          {
            t=t.lchild;
          }
          else
          {
             t=t.rchild;
          }
        }
        if(parent.data>d)
        {
           parent.lchild=temp;
        }
        else
           parent.rchild=temp;
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
    public static void main(String[] args)
    {
         Node root1;
         root1=root('L');
         binarytree t=new binarytree();
         t.insert(root1,'D');
         t.insert(root1,'B');
         t.insert(root1,'Z');
         t.insert(root1,'W');
         t.insert(root1,'Y');
         t.insert(root1,'T');
         t.insert(root1,'K');
         t.inorder(root1);
         System.out.println();
    }
}

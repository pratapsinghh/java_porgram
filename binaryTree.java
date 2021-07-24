class binaryTree
{
   static class Node
   {
      String data;
      Node lchild;
      Node rchild;
      Node(String s)
      {
          data=s;
          lchild=null;
          rchild=null;
      }
   }
  public static Node root(String str)
  {
     Node root=new Node(str);
     root.lchild=null;
     root.rchild=null;
     return root;
  }
  public void insert(Node root,String str)
  {
      Node temp=new Node(str);
      temp.lchild=null;
      temp.rchild=null;
      Node t=root;
      Node parent=root;
      while(t!=null)
      {
        parent=t;
        if(t.data>str)
           t=t.lchild;
        else
           t=t.rchild;
      }
      if(parent.data>str)
         parent.lchild=temp;
      else
         parent.rchild=temp;
  }
  public void inorder(Node root)
  {
     if(root!=null)
     {
        inorder(root.lchild);
        System.out.println(root.data);
        inorder(root.rchild);
     }
  }
  public static void main(String[] args)
  {
     Node root1;
     root1=root("Ram");
     binaryTree t=new binaryTree();
     t.insert(root1,"Aman");
     t.insert(root1,"Mohan");
     t.insert(root1,"Shohan");
     t.insert(root1,"Jhon");
     t.inorder(root1);
  }
}

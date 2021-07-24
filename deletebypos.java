class deletebypos
{
  Node head;
  static class Node
  {
     int data;
     Node next;
     Node(int d)
     {
        data=d;
        next=null;
     }
   }
   public static deletebypos insert(deletebypos list,int data)
   {
      Node new_node=new Node(data);
      new_node.next=null;
      if(list.head==null)
      {
         list.head=new_node;
      }
      else
      {
          Node curr=list.head;
          while(curr.next!=null)
          {
             curr=curr.next;
          }
          curr.next=new_node;
      }
      return list;
   }
    public static void printlist(deletebypos list)
    {
       Node trv=list.head;
       while(trv!=null)
       {
          System.out.print(trv.data+"  ");
          trv=trv.next;
       }
       System.out.println();
    }
    public static deletebypos deleteByPos(deletebypos list,int index)
    {
       Node curr=list.head,prev=null;
       if(index==0 && curr!=null)
       {
          list.head=curr.next;
          return list;
       }
       int counter=0;
       while(curr!=null && index!=counter)
       {
           counter++;
           prev=curr;
           curr=curr.next;
       }
       if(curr!=null)
       {
          prev.next=curr.next;
       }
       if(curr==null)
       {
          System.out.println(index+ " not found");
        }
     return list;
    }
    public static void main(String... args)
    {
       deletebypos list=new deletebypos();
       list=insert(list,4);
       list=insert(list,5);
       list=insert(list,6);
       list=insert(list,7);
       list=insert(list,8);
       list=insert(list,9);
       list=insert(list,10);
       list=insert(list,11);
       printlist(list);
       deleteByPos(list,4);
       printlist(list);
    }
}

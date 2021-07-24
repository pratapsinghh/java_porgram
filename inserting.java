class inserting
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
    public static inserting insert(inserting list,int data)
    {
        Node new_node=new Node(data);
        Node last=list.head;
        Node l=list.head;
        new_node.next=null;
        if(list.head==null)
        {
           list.head=new_node;
        }
        else
        {
           //Node l=list.head;
           while(last.next!=null)
           {
              last=last.next;
              //l=l.next;
           }
           last.next=new_node;
        }
        //last.next=l;
        return list;
    }
    public static inserting newNode(inserting list,int pos,int x)
    {
       Node new_node=new Node(x);
       new_node.next=null;
       if(pos==0)
       {
          new_node.next=list.head;
          list.head=new_node;
       }
       else
       {
           Node l=list.head;
           int i=0;
           while(l!=null && i<pos-1)
           {
              l=l.next;
              i++;
           }
           new_node.next=l.next;
           l.next=new_node;
        }
        return list;
    }
    public static void print(inserting list,Node d)
    {
       Node l=list.head;
       do
       {
         System.out.print(d.data+"  ");
         d=d.next;
       }while(d!=null);
    }
    /*public static void printR(sortingll list,Node d)
    {
       int flag=0;
       if(d!=list.head || flag==0)
       {
          flag=1;
          System.out.print(d.data+"  ");
          printR(list,d.next);
       }
       flag=0;
    }*/
    /*public static sortingll cull(sortingll list)
    {
       Node l=list.head;
       Node tail=list.head;
       tail=tail.next;
       while(tail!=null)
       {
          l=tail;
          tail=tail.next;
       }
       l.next=list.head;
       return list;
    }*/
    public static void main(String[] args)
    {
       inserting list=new inserting();
       list=insert(list,12);
       list=insert(list,15);
       list=insert(list,16);
       list=insert(list,13);
       list=insert(list,19);
       list=insert(list,14);
       list=insert(list,18);
       list=insert(list,17);
       list=insert(list,20);
       print(list,list.head);
       newNode(list,1,11);
       print(list,list.head);
    }
}

import java.util.*;
class hashset1
{
    public static int sum(HashSet<Integer> h)
    {
        int s=0;
        for(Integer x:h)
          s+=x;
        return s;
    }
    public static void main(String[] args)
    {
        HashSet<Integer> h=new HashSet<>();
        h.add(34);
        h.add(3);
        h.add(2);
        h.add(5);
        h.add(66);
        System.out.println(h);
        System.out.println(sum(h));
    }
}

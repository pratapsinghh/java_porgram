import java.util.Stack;
import java.util.Scanner;
class BracketMatching
{
   public static String checkbalanced(String exp)
   {
      if(exp.isEmpty())
         return "Balanced";
      else
      {
         Stack<Character> stack=new Stack<>();
         for(int i=0;i<exp.length();i++)
         {
            char current=exp.charAt(i);
            if(current=='(' ||current=='{'||current=='[')
            {
                stack.push(current);
            }
            else
            {
              if(current==')'||current=='}'||current==']')
              {
                 if(stack.isEmpty())
                    return "Not Balanced";
                //char last=stack.peek();
                //if(current==')' && last=='(' || current=='}' && last=='{' || current==']' && last=='[')
                stack.pop();
                
              }
            }
            
        }
        return stack.isEmpty()?"Balanced":"Not Balanced";
      }
   }
   public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in);
      String checkBalancedExpr1=sc.next();
      System.out.println(checkBalancedExpr1+" :"+checkbalanced(checkBalancedExpr1));
   }
}

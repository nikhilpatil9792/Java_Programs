import java.util.*;
class Armstrong
{       private int num;
     void setvalue(int no)
     {
          num=no;
     }
      boolean isarmstrong()
     {
         int sum=0, temp, rem;
           temp=num;
          while(num!=0)
          {
               rem=num%10;
               sum=sum+(rem*rem*rem);
               num=num/10;
 
          }
           num=temp;
          if(sum==num)
          {
                return true;
          }
          else 
          {
                return false;
          }
     }
}
public class ArmstrongApp
{
       public static void main(String x[])
       {
           Armstrong arm= new Armstrong();
            arm.setvalue(153);
          
            boolean result=arm.isarmstrong(); 
           System.out.println(result);

       }
}
 
import java.util.*;
class Gcd
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        // while(num2!=0)
        // {
        //     int tem=num2;
        //     num2=num1%num2;
        //     num1=tem;
        // }
        // System.out.println(num1);
        int min= Math.min(num1,num2);
        // for(int i=min;i>=1;i--)
        // {
        //     if(num1%i==0 && num2%i==0)
        //     {
        //         System.out.println(i);
        //         break;
        //     }
        // }
        while(min>=1)
        {
            if(num1%min==0 && num2%min==0)
            {
                System.out.println(min);
                break;
            }
            min--;
        }   
    }
}
import java.util.*;
class Lcm
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        // int num1=a;
        // int num2=b;
        // while(num2!=0)
        // {
        //     int tem=num2;
        //     num2=num1%num2;
        //     num1=tem;
        // }
        // System.out.println("This is GCD of these two Numbers "+num1);
        // int gcd = num1;
        // int lcm=(a*b)/gcd;
        // System.out.println("This is LCM of these two Numbers "+lcm);
        int max= Math.max(a,b);
        // while(true)
        // {
        //     if(max%a==0 && max%b==0)
        //     {
        //         System.out.println(max);
        //         break;
        //     }
        //     max++;
        // }
        for(int i=max;i<=a*b;i++)
        {
            if(i%a==0 && i%b==0)
            {
                System.out.println(i);
                break;
            }
        }
    }
}
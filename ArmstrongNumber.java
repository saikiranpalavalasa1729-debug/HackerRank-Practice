import java.util.Scanner;

class ArmstrongNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int r;
        int sum=0;
        int temp=n;
        while(n!=0)
        {
            r=n%10;
            sum = sum+(r*r*r);
            n=n/10;
        }
        if(temp==sum)
        {
            System.out.println("armstrong");
        }
        else
        {
            System.out.println("not armstrong");
        }
    }
}
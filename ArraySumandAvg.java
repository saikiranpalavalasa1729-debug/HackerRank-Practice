import java.util.Scanner;
class ArraySumandAvg
{
    public static void main(String[] args)
    {
        int i;
        int sum = 0;

        Scanner sc = new Scanner(System.in);

        int[] num = new int[5];

        System.out.println("Enter 5 numbers:");

        for(i = 0; i < num.length; i++)
        {
            num[i] = sc.nextInt();
        }
        System.out.println("array elements");
         for(i = 0; i < num.length; i++)
        {
            System.out.println(num[i]);
        }
        System.out.println("Sum of 5 numbers:");
        for(i = 0; i < num.length; i++)
        {
            sum+=num[i];
        }

        System.out.println(sum); 
        System.out.println("find avg");
        double avg = sum/num.length;
        System.out.println(avg);
    }
}

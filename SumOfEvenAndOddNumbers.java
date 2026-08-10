import java.util.*;
public class SumOfEvenAndOddNumbers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int n = sc.nextInt();
        int i;
        int evensum=0;
        int oddsum=0;
        int[] arr = new int[n];
         System.out.println("Enter Array Elements");
        for(i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
         System.out.println("Array Elements");
        for(i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                evensum=evensum+arr[i];
            }
            else
            {
                oddsum=oddsum+arr[i];
            }
        }
        System.out.println("");
         System.out.println("Sum Of Even&Odd Numbers");
        System.out.println("Sum Of Even Numbers : "+evensum);
         System.out.println("Sum Of Odd Numbers : "+oddsum);
    }
}
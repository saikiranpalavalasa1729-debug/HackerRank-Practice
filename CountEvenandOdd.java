import java.util.*;
public class CountEvenandOdd
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int n=sc.nextInt();
        int arr[] = new int[n];
        int i;
        System.out.println("enter array elements");
        for(i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("print array elements");
        for(i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        int evencount=0;
        int oddcount=0;
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                evencount++;
            }
            else
            {
                oddcount++;
            }
            
        }
        System.out.println("count");
        System.out.println("even numbers count : "+evencount);
        System.out.println("odd numbers count : "+oddcount);
    }
}

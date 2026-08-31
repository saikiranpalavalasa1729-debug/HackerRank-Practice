import java.util.*;
public class LargestEvenAndOddNumbers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size:");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements are:");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        System.out.println("Longest Numbers");
        int evenmax = arr[0];
        int oddmax = arr[0];
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i]%2==0)
            {
                if(evenmax<arr[i])
                {
                evenmax=arr[i];
                }
            }
            else
            {
                if(oddmax<arr[i])
                {
                    oddmax=arr[i];
                }
            }
        }
        System.out.println("Longest Even Number : "+evenmax);
        System.out.println("Longest Odd Element : "+oddmax);
    
    }
}

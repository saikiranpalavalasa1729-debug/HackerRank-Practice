
import java.util.*;

class Longestelement
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
        System.out.println("Longest element");
        int max = arr[0];
        for(int i = 0; i < arr.length; i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        System.out.println("Longest element"+max);
        System.out.println("second Longest element");
        int secondlongest = arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(secondlongest<arr[i] && arr[i]!=max)
            {
                secondlongest = arr[i];
            }
        }
         System.out.println("secondlongest element"+secondlongest);
        System.out.println("Smallest element");
        int min = arr[0];
        for(int i = 0; i < arr.length; i++)
        {
            if(min>arr[i])
            {
                min=arr[i];
            }
        }
        System.out.println("Smallest element"+min);
        System.out.println("Second smallest element");
        int secondsmallest = arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(secondsmallest>arr[i] && arr[i]!=min)
            {
                secondsmallest = arr[i];
            }
        }
        System.out.println("Smallest element"+secondsmallest);

        sc.close();
    }
}
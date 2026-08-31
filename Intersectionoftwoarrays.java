import java.util.Scanner;

public class Intersectionoftwoarrays
{
    public static void main(String[] args)
    {
        int i, j;
        int k = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("arr1 size");
        int n1 = sc.nextInt();
        System.out.println("arr2 size");
        int n2 = sc.nextInt();
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        int[] arr3 = new int[Math.min(n1, n2)];
        System.out.println("enter arr1 elements");
        for(i = 0; i < n1; i++)
        {
            arr1[i] = sc.nextInt();
        }
        System.out.println("enter arr2 elements");
        for(i = 0; i < n2; i++)
        {
            arr2[i] = sc.nextInt();
        }
        System.out.println("print arr1 elements");
        for(i = 0; i < n1; i++)
        {
            System.out.println(arr1[i]);
        }
        System.out.println("print arr2 elements");
        for(i = 0; i < n2; i++)
        {
            System.out.println(arr2[i]);
        }
        System.out.println("Intersection elements:");
        for(i = 0; i < n1; i++)
        {
            for(j = 0; j < n2; j++)
            {
                if(arr1[i] == arr2[j])
                {
                    arr3[k++] = arr1[i];
                    break;
                }
            }
        }
        for(i = 0; i < k; i++)
        {
            System.out.println(arr3[i]);
        }
    }
}
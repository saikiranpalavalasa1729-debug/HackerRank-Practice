import java.util.*;
public class Removezerosarray
{
    public static void main(String[] args)
    {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("array size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("array elements");
        for(i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
         System.out.println("print array elements");
        for(i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
         System.out.println(" ");
        System.out.println("after removing zeros");
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                System.out.print(arr[i]+" ");
            }
        }
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
}

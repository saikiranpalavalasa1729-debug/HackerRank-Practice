import java.util.*;
public class BalanceFactor
{
    public static void main(String[] args)
    {
        int sum=0;
        int left=0;
        int right;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array elements:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        for(int i=0;i<n;i++)
        {
            right=sum-left-arr[i];
            if(right==left)
            {
                System.out.println("Balance factor at "+i);
                return;
            }
                left=left+arr[i];
        }
    }
           
}


import java.util.*;
class MedianofTwoSortedArrays
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++)
        {
            arr2[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr1[i]+" ");
        }
        System.out.println("");
        for(int i=0;i<m;i++)
        {
            System.out.print(arr2[i]+" ");
        }
        int y = arr1.length+arr2.length;
        int[] arr3 = new int[y];
        for(int i=0;i<n;i++)
        {
            arr3[i]=arr1[i];
        }
        for(int i=0;i<m;i++)
        {
            arr3[n+i]=arr2[i];
        }
        System.out.println("");
        for(int i=0;i<y;i++)
        {
           System.out.print(arr3[i]+" "); 
        }
        Arrays.sort(arr3);
        System.out.println("");
        for(int i=0;i<y;i++)
        {
           System.out.print(arr3[i]+" "); 
        }
        System.out.println("");
        int sum=0;
        for(int i=0;i<y;i++)
        {
            sum=sum+arr3[i];
        }
        int mean=sum/y;
        System.out.println(mean);
    }
}
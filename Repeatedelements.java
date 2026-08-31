import java.util.*;
class Repeatedelements
{
    public static void main(String[] args)
    {
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
        Arrays.sort(arr);
        System.out.println("After Sorting Array elements:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        System.out.println("Repeating Elements in Array");
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==arr[i+1])
                {
                    System.out.print(arr[i]+" ");
                    while(i<arr.length-1 && arr[i]==arr[i+1]){
                        i++;
                    }
                }
        }
    }
}

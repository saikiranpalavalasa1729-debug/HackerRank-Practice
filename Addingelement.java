import java.util.Scanner;
public class Addingelement
{    public static void main(String[] args)
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
        System.out.println("Enter new element");
        int add=sc.nextInt();
        int[] newarr = new int[arr.length+1];
        for (int i = 0; i < n; i++) {
            newarr[i]=arr[i];
        }
        newarr[arr.length]=add;
        System.out.println("After adding Array elements:");
        for (int i = 0; i < newarr.length; i++) {
            System.out.print(newarr[i] + " ");
        }
    }
} 

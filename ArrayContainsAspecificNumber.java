import java.util.*;
public class ArrayContainsAspecificNumber
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int i;
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
        System.out.println("");
        System.out.println("check Specific Numbers");
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]==7)
            {
                System.out.println("7 : Found");
            }
            else{
                System.out.println("7 : Not Found");
            }
        }
    }
}

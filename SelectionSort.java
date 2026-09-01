import java.util.*;

class SelectionSort
{
    public static void main(String[] args)
    {
        int i, j, min, temp;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        for(i = 0; i < n - 1; i++)
        {
            min = i;
            for(j = i + 1; j < n; j++)
            {
                if(arr[min] > arr[j])
                {
                    min = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        for(i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
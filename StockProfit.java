import java.util.*;

class StockProfit
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        int minprice = arr[0];
        int maxprofit = 0;

        for(int i = 1; i < n; i++)
        {
            if(minprice > arr[i])
            {
                minprice = arr[i];
            }

            int profit = arr[i] - minprice;

            if(profit > maxprofit)
            {
                maxprofit = profit;
            }
        }

        System.out.println(maxprofit);
    }
}
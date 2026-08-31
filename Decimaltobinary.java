import java.util.*;
public class Decimaltobinary
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int binary = 0;
        int base = 1;
        while (n > 0)
        {
            int digit = n % 2;
            binary = binary + digit * base;
            base = base * 10;
            n = n / 2;
        }
        System.out.println(binary);
    }
}

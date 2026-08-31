import java.util.*;
public class SubString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int start = sc.nextInt();
        int end = sc.nextInt();
        String S1=S.substring(start,end);
        System.out.println(S1);
    }
}
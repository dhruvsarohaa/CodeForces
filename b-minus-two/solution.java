import java.util.* ;
import java.io.*;
public class ANY{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0) {
            int a = sc.nextInt();
            int[] arr = new int[a];
            for (int i = 0; i < a; i++)
                arr[i] = sc.nextInt();
            int odd = 0;
            int even4 = 0;
            int even2 = 0;
            for (int i = 0; i < a; i++) {
                if (arr[i] % 2 != 0) {
                    odd++;
                } else if (arr[i] % 4 == 0) {
                    even4++;
                } else if (arr[i] % 4 == 2) {
                    even2++;
                }
            }
            int max=Math.max(odd,Math.max(even4,even2));
            System.out.println(max);
        }
    }
}
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
            int countLeft=0;
            int left=-1;
            int countRight=0;
            int right=-1;
            for(int i=0;i<arr.length;i++) {
                if(arr[i]==1)
                {
                    countLeft++;
                    break;
                }
                else if(arr[i]==-1)
                {
                    if(countLeft==0)
                    {
                        arr[i]=1;
                        left=i;
                        break;
                    }
                    else{
                        arr[i]=0;
                    }
                }
            }
            for(int i=arr.length-1;i>=0;i--)
            {
                if(arr[i]==1)
                {
                    countRight++;
                    break;
                }
                else if(arr[i]==-1)
                {
                    if(countRight==0)
                    {
                        arr[i]=1;
                        right=i;
                        break;
                    }
                    else{
                        arr[i]=0;
                    }
                }
            }
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]==-1)
                {
                    arr[i]=0;
                }
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}

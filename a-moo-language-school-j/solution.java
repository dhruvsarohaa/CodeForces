import java.util.* ;
import java.io.*;
public class ANY{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            String str=sc.next();
            int ans=0;
            for(int i=0;i<str.length();i+=b)
            {
                boolean flag=false;
                for(int j=i;j<i+b;j++)
                {
                    if(str.charAt(j)=='0')
                    {
                        flag=true;
                        break;
                    }
                }
                if(!flag)
                {
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
}

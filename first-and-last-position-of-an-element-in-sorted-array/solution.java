import java.util.* ;
import java.io.*; 
public class Solution {

    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int x) {
        int[] nums=new int[2];
        Arrays.fill(nums,-1);
        int first=-1;
        int last=-1;
        int left=0;
        int right=arr.size()-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(arr.get(mid)==x)
            {
                first=mid;
                right=mid-1;
            }
            else if(arr.get(mid)<x)
            {
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        
        if(first==-1)
        {
            return nums;
        }
        
        left=0;
        right=arr.size()-1;
        
        while(right>=left)
        {
            int mid=left+(right-left)/2;
            if(arr.get(mid)==x)
            {
                last=mid;
                left=mid+1;
            }
            else if(arr.get(mid)<x)
            {
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        nums[0]=first;
        nums[1]=last;
        return nums;
    }

};

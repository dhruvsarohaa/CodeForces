class Solution {
    public int findMin(int[] arr) {
        // write your code here 
        int left=0;
        int right=arr.length-1;
        while(left<right)
        {
            int mid=left+(right-left)/2;
            if(arr[mid]>arr[mid+1])
            {
                return arr[mid+1];
            }
            else if(arr[mid]>arr[0])
            {
                left=mid+1;
            }
            else{
                right=mid;
            }
        }
        return arr[0];
    }
}

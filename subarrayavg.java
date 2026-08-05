class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int threshold_sum=k*threshold;
        int sum=0,count=0;
        for(int i=0;i<k;i++)
        {
            sum+=arr[i];
        }
        if(sum>=threshold_sum)
        count++;
        int j=k,i=0;
        while(j<arr.length)
        {
            sum=sum-arr[i]+arr[j];
            if(sum>=threshold_sum)
            count++;
            i++;j++;
        }
        return count;
    }
}
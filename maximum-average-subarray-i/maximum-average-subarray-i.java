class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
      // 1. find sum of k-1 elements
        int sum = 0;
        for(int i = 0;i < k-1;i++){
            sum += nums[i];
        }
        
        //2 . calaculate avg
        double res = Integer.MIN_VALUE * 1.0;
        for(int i = k-1;i < nums.length;i++){
            sum += nums[i];
            double avg =  sum*1.0/k;
            res = Math.max(res,avg);
            sum -= nums[i-k+1];
        }
        return res;
    }
}
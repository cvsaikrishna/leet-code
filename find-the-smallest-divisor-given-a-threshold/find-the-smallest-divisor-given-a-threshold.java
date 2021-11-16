class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
         int max = Integer.MIN_VALUE;
        for(int val: nums){
            max = Math.max(max,val);
        }
        
        int lo = 1;
        int hi = max;
        int divisor = Integer.MAX_VALUE;
        
        while(lo <= hi){
            int mid = lo + (hi -lo) / 2;
            if(isPossible(nums,threshold,mid) == true){
                divisor = mid;
                hi = mid - 1;
            }
            else{
                lo = mid + 1;
            }
        }
        return divisor;
        
    }
    
     public static boolean isPossible(int[] nums,int threshold,int mid){
        int sum = 0;
        for(int i =0; i < nums.length; i++){
            sum += (int)Math.ceil(nums[i] * 1.0 / mid);
        }
        
        return sum <= threshold ? true:false;
    }
}
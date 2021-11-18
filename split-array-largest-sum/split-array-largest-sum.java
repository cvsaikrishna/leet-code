class Solution {
    public int splitArray(int[] nums, int m) {
        if(m > nums.length){
            return -1;
        }
        
        int sum = 0;
        int max = Integer.MIN_VALUE;
        
        for(int val: nums){
            sum += val;
            max = Math.max(max,val);
        }
        
        int lo = max;
        int hi = sum;
        int lsum  = Integer.MIN_VALUE;
        while(lo <= hi){
            int mid = lo + (hi - lo) / 2;
            if(isSumPossible(nums,mid,m)){
                lsum = mid;
                hi = mid - 1;
            }
            else{
                lo = mid + 1;
            }
        }
        return lsum;
        
    }
    
    public static boolean isSumPossible(int[] nums,int mid,int m){
        
        int pairs = 1;
        int sum = 0;
        
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            
            if(sum > mid){
                pairs++;
                sum = nums[i];
            }
        }
    return pairs <= m;    
        
    }
    
}
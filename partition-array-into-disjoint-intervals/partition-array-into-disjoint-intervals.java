class Solution {
    public int partitionDisjoint(int[] nums) {
        int ans = 0;
    int n = nums.length;
    int[] rightMin = new int[n];
    rightMin[n-1] = nums[n-1];
    
    for(int i = n-2;i>=0;i--){
        rightMin[i] = Math.min(nums[i],rightMin[i+1]);
    }
        
        int leftMax = Integer.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++){
            leftMax = Math.max(leftMax,nums[i]);
            if(leftMax<=rightMin[i+1]){
                ans = i;
                break;
            }
        }
    return ans+1;
        
    }
}
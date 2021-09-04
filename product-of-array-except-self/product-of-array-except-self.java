class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        
        left[0] = nums[0];
        
        for(int i = 1; i < left.length; i++){
            left[i] = left[i-1] * nums[i];
        }
        
        right[nums.length-1] = nums[nums.length-1];
        
        for(int i = nums.length-2;i >=0; i--){
            right[i] = right[i+1] * nums[i];
        }
        
        int[] res = new int[nums.length];
        
        res[0] = right[1];
        res[res.length-1] = left[left.length-2];
        
        for(int i = 1; i < nums.length-1;i++){
            res[i] = left[i-1] * right[i+1];
        }
        
        return res;
        
    }
}
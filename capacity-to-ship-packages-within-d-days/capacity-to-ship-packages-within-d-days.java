class Solution {
    public int shipWithinDays(int[] weights, int days) {
     if(days > weights.length){
            return -1;
        }
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int val:weights){
            sum += val;
            max = Math.max(max,val);
        }
        int lo = max;
        int hi = sum;
        
        int lsweight = Integer.MAX_VALUE;
        
        while(lo <= hi){
            int mid = lo + (hi -lo) / 2;
            if(isLeastWeightPossible(weights,mid,days) == true){
                lsweight = mid;
                hi = mid - 1;
            }
            else{
                lo = mid + 1;
            }
            
            
        }
        return lsweight;
  }
  
  public static boolean isLeastWeightPossible(int[] weights,int mid,int days){
        int pairs = 1;
        int sum = 0;
        for(int i = 0; i< weights.length;i++){
            sum += weights[i];
            
            if(sum > mid){
                pairs++;
                sum = weights[i];
            }
        }
        return pairs <= days;
    }
}
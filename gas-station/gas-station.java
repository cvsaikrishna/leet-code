class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gasSum =0;
        int costSum = 0;
        for(int i = 0 ; i <  gas.length; i++){
            gasSum += gas[i];
            costSum += cost[i];
        }
        if(gasSum - costSum < 0){
            return -1;
        }
        int index = 0;
        int prefixSum =0 ;
        int min = Integer.MAX_VALUE;
        for(int i= 0; i < gas.length;i++){
            prefixSum += gas[i] - cost[i];
            
            if(prefixSum < min){
                min = prefixSum;
                index = i;
            }
        }
        
        return (index+1) % gas.length;
    }
}
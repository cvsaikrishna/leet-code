class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int len = 0;
        //rows no of trips
        // column[0] no of passengers
        // column[1] starting of trip
        // column[2] ending of trip
        
        int[] arr = new int[1001];
        
        //travel on quer and mark impact on array
        for(int i=0; i < trips.length; i++){
            int start = trips[i][1];
            int end = trips[i][2];
            int pass = trips[i][0];
            
            arr[start] += pass;
            arr[end] -= pass;
            len = Math.max(len,end);
        }
        
        //make prefix sum to create impact of passenger count
        int prefixSum = 0;
        for(int i= 0; i <=len; i++){
            prefixSum += arr[i];
            arr[i] = prefixSum;
            
            if(arr[i] > capacity) return false;
        }
        return true;
        
    }
}
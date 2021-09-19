class Solution {
    private class Pair implements Comparable<Pair>{
        int val;
        int i;
        int j;
        public Pair(int val,int i,int j){
            this.val = val;
            this.i= i;
            this.j = j;
        }
        
        public int compareTo(Pair o){
           return  this.val - o.val;
        }
    }
    
    public int[] smallestRange(List<List<Integer>> nums) {
        
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        
        //push all values of column from 0
        int max = Integer.MIN_VALUE;
        for(int r= 0; r < nums.size();r++){
            //here column is fix and it is 0
            int val = nums.get(r).get(0);
            pq.add(new Pair(val,r,0));
            max = Math.max(max,val);
        }
        
        int sp = 0;
        int ep = 0;
        int length = Integer.MAX_VALUE;
        
        while(true){
            Pair rem = pq.remove();
            int cmin = rem.val;
            int cmax = max;
            
            if(cmax - cmin < length){
                length = cmax - cmin;
                sp = cmin;
                ep = cmax;
            }
            
            if(rem.j + 1 < nums.get(rem.i).size()){
                int val = nums.get(rem.i).get(rem.j+1);
                pq.add(new Pair(val,rem.i,rem.j+1));
                max = Math.max(max,val);
            }
            else{
                break;
            }
            
        }
        
        int[] res = {sp,ep};
        return res;
        
    }
}
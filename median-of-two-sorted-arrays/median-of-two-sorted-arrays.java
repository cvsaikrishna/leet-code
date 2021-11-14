class Solution {
    public double findMedianSortedArrays(int[] a1, int[] a2) {
         int n1 = a1.length;
        int n2 = a2.length;
        
        if(n1 > n2){
            int[] temp = a1;
            a1 = a2;
            a2 = temp;
            
            int temp2 = n1;
            n1 = n2;
            n2 = temp2;
        }
        
        int lo = 0;
        int hi = n1;
        int te = n1 + n2;
        
        while(lo <= hi){
            int ali = lo + (hi - lo) / 2; // aleft is equivalent to mid ali -> a left index
            int bli = (te + 1) / 2 - ali; //why te + 1, because we have to manage odd and even both
            
            int alm1 = ali == 0 ? Integer.MIN_VALUE : a1[ali-1];
            
            int al = ali == n1 ? Integer.MAX_VALUE : a1[ali];
            
            int blm1 = bli == 0 ? Integer.MIN_VALUE : a2[bli-1];
            
            int bl = bli == n2 ? Integer.MAX_VALUE : a2[bli];
            
            
            if(alm1 <= bl && blm1 <= al){
                
                // valid splitting
                
                double median = 0.0;
                
                if(te % 2 == 0){
                    
                    median = (Math.max(alm1,blm1) + Math.min(al,bl)) / 2.0;
                    
                    
                }
                else{
                 
                 median  = Math.max(alm1,blm1);   
                }
                
                return median;
                
            }
            
            // to move further iteratiom
            
            else if(blm1 > al){
                
                lo = ali + 1;
                
            }
            else{
                hi = ali - 1;
            }
        }
        
        return 0.0;
        
    }
}
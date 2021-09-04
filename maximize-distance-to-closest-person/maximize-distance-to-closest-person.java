class Solution {
    public int maxDistToClosest(int[] seats) {
        int distance = 0;
        int zeros = 0;
        
        for(int i=0;i<seats.length;i++){
            if(seats[i]==1){
                distance = i;
                break;
            }
        }
        for(int i = distance+1;i<seats.length;i++){
            if(seats[i] == 1){
                distance = Math.max(distance,(zeros+1)/2);
                zeros = 0;
            }
            
            else{
                zeros++;
            }
        }
        
        return Math.max(zeros,distance);
        
    }
}

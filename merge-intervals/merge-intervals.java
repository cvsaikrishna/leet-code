class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals,(val1,val2)->Integer.compare(val1[0],val2[0]));
        
        ArrayList<int[]> list = new ArrayList<>();
        int lsp = intervals[0][0];
        int lep = intervals[0][1];
        
        for(int i = 1; i < intervals.length;i++){
            int sp = intervals[i][0];
            int ep  = intervals[i][1];
            if(lep < sp){
                int sub[] = {lsp,lep};
                list.add(sub);
                
                lsp = sp;
                lep = ep;
            }
            else if(lep < ep){
                lep = ep;
            }
            else{
                
            }
        }
        
        int[] sub = {lsp,lep};
        list.add(sub);
        
        return list.toArray(new int[list.size()][0]);
        
        
    }
}
class Solution {
    static class OPair{
        int r;
        int c;
        int t;
        public OPair(int r, int c, int t){
            this.r=r;
            this.c=c;
            this.t=t;
        }
    } 
     static int xDir[] = {-1,0,1,0};
    static int yDir[] = {0,-1,0,1};
    public int orangesRotting(int[][] grid) {
        // 1. travel on grid and add rotted oranges in queue and count oranges
        int oranges = 0;
        
        
        Queue<OPair> qu = new ArrayDeque<>();
        
        for(int i =0; i < grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == 2){
                    qu.add(new OPair(i,j,0));
                }
                
                if(grid[i][j] == 1 || grid[i][j] == 2){
                    oranges++;
                }
            }
            
        }
         // 2. Appl bFS amd final remaining orange count and time as well
        
        int time = 0;
        while(qu.size()>0){
            OPair rem = qu.remove();
            if(grid[rem.r][rem.c] == -2){
                continue;
            }
            grid[rem.r][rem.c] = -2;
            oranges--;
            
            time = rem.t;
            for(int d =0; d < 4; d++){
            int x= rem.r + xDir[d];
            int y= rem.c + yDir[d];
            
            if(x>= 0  && x< grid.length && y>= 0 && y< grid[0].length && grid[x][y] != 0){
               qu.add(new OPair(x,y,rem.t+1));
            }
        }
                      
        }
                      
         return oranges == 0?time:-1;
    }
}
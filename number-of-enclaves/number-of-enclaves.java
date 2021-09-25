class Solution {
        static int xDir[] = {-1,0,1,0};
    static int yDir[] = {0,-1,0,1};
    public void numEnclaves_dfs(int[][] grid,int x,int y){
          grid[x][y] = 0;
        for(int d = 0; d < 4; d++){
            int r = x + xDir[d];
            int c = y + yDir[d];
            
            if(r >= 0  && r < grid.length && c >= 0 && c < grid[0].length && grid[r][c] != 0){
                numEnclaves_dfs(grid,r,c);
            }
    }
    }
    
    public int numEnclaves(int[][] grid) {
        
        //for 0th row
        for(int c = 0; c < grid[0].length;c++){
            if(grid[0][c] == 1)
                numEnclaves_dfs(grid,0,c);
        }
        
        //for last row
        
        for(int c = 0;c < grid[0].length;c++){
            if(grid[grid.length-1][c] == 1)
                numEnclaves_dfs(grid,grid.length-1,c);
        }
        
        //for 1st col
        for(int r = 0; r < grid.length;r++){
            if(grid[r][0] == 1)
                numEnclaves_dfs(grid,r,0);
        }
        
        //for last col
        for(int r = 0; r < grid.length; r++){
            if(grid[r][grid[0].length-1] == 1)
                 numEnclaves_dfs(grid,r,grid[0].length-1);
        }
         
        int count = 0;
        for(int i = 0; i < grid.length;i++){
            for(int j = 0; j < grid[0].length;j++){
                if(grid[i][j] == 1)
                    count++;
            }
        }
        return count;
    }
}
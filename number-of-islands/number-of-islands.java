class Solution {
    static int xDir[] = {-1,0,1,0};
    static int yDir[] = {0,-1,0,1};
    public int numIslands(char[][] grid) {
        
        int islands = 0;
        for(int i = 0; i < grid.length;i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == '1'){
                    island_dfs(grid,i,j);
                    islands++;
                }
                    
            }
        }
        return islands;
    }
    
    public void island_dfs(char[][] grid,int x, int y){
        grid[x][y] = '0';
        for(int d =0; d < 4; d++){
            int r = x + xDir[d];
            int c = y + yDir[d];
            
            if(r >= 0  && r < grid.length && c >= 0 && c < grid[0].length && grid[r][c] != '0'){
                island_dfs(grid,r,c);
            }
        }
    }
}
package Graphs;

public class MaxAreaOfIsland {

	public int maxAreaOfIsland(int[][] grid) {
        
        // error checking
        if(grid == null || grid.length == 0){
            return 0;
        }
        
        int max = 0;
        
        for(int i = 0; i < grid.length ; i++){
            for(int j = 0; j < grid[i].length ; j++){
                
                // check 1s
                if(grid[i][j] == 1){
                    max = Math.max(max, dfs(grid, i, j));
                }
            }
        }
        
        return max;
        
    }
    
    public int dfs(int[][] grid, int i, int j){
        // error check
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length 
            || grid[i][j] == 0){
            return 0;
        }
        
        // sink
        grid[i][j] = 0;
        
        int count = 1;
        count += dfs(grid, i + 1, j);
        count += dfs(grid, i - 1, j);
        count += dfs(grid, i, j + 1);
        count += dfs(grid, i, j - 1);
        
        return count;
    }
}

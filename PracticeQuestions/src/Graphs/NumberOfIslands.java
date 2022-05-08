package Graphs;

public class NumberOfIslands {
	
	public int numIslands(char[][] grid) {
        
        // error checking
        
        if(grid.length == 0 || grid == null){
            return 0;
        }
        
        int numberOfIslands = 0;
        
        for(int i = 0; i < grid.length; i ++){        
            for(int j = 0; j < grid[i].length; j ++){

                // check 1s
                if(grid[i][j] == '1'){
                    // dfs
                    numberOfIslands += dfs(grid, i, j);
                }
            }
        }
        
        return numberOfIslands;
    }
        
    
    public int dfs(char[][] grid, int i, int j){

        // error checking
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[i].length ||
           grid[i][j] == '0'){
            return 0;
        }

        // sink
        grid[i][j] = '0';

        dfs(grid, i - 1, j);
        dfs(grid, i + 1, j);
        dfs(grid, i, j - 1);
        dfs(grid, i, j + 1);

        return 1;
    }

}

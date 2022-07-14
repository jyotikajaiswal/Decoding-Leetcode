class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for(int i = 0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1' && visited[i][j] == false){
                    island(grid,i,j,visited);
                    count++;
                }
            }
        }
        return count;
    }
    
    public void island(char[][] grid, int i ,int j, boolean[][] visited){
    if(i>=grid.length || j>=grid[0].length ||i<0 || j<0 ||  visited[i][j] == true || grid[i][j]=='0'){
        return;
    }
    visited[i][j] = true;
    island(grid,i-1,j,visited);
    island(grid,i+1,j,visited);
    island(grid,i,j-1,visited);
    island(grid,i,j+1,visited);
    return;
    }
}
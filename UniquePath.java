import java.util.ArrayList;
import java.util.Arrays;

class Solution62 {
    public int uniquePaths(int m, int n) {

        int[][] visited = new int[n][m];
        findAllPathsNew(0,0,m,n,visited);
        return totalPath;
    }
    int totalPath = 0;
    private boolean findAllPathsNew(int x, int y,int m,int n, int[][] visited)
    {
        if(x == n-1 && y == m-1)
        {
            totalPath ++;
            visited[x][y] = 1;
            return true;
        }
        if(x == n-1 && y != m-1)
        {
            visited[x][y] = 1;
             return findAllPathsNew(x,y+1,m,n,visited);
        }
        if(x != n-1 && y == m-1)
        {
            visited[x][y] = 1;
             return findAllPathsNew(x+1,y,m,n,visited);
        }
        visited[x][y] = 1;
        if(findAllPathsNew(x,y+1,m,n,visited))
        {
            if(findAllPathsNew(x+1,y,m,n,visited))
            {
                return true;
            }
        }
        return false;

    }


    public static void main(String args[])
    {
        System.out.println(new Solution62().uniquePaths(23,12));
    }
}
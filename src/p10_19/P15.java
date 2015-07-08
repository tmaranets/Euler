/*
 *	@author - Theodore Maranets
 */
package p10_19;

public class P15 {

	public static void main(String[] args) {
		long[][] grid = new long[21][21];
		for (int x = 0; x <= 20; x++)
		{
			grid[20][x] = 1;
			grid[x][20] = 1;
		}
		for (int r = 19; r >= 0; r--)
		{
			for (int c = 19; c >= 0; c--)
			{
				grid[r][c] = grid[r+1][c] + grid[r][c+1]; //I realized the path calculations can be simplified to 
			}											  //a pascal's triangle
		}	
		System.out.println(grid[0][0]);	//final amount at the start of the grid
	}

}

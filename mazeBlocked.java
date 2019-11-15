package tuhinwork;

public class mazeBlocked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] maze = { { 0, 1, 0, 0 }, { 0, 0, 0, 0 }, { 0, 1, 0, 0 }, { 0, 0, 1, 0 } };
		System.out.println(blockedMaze(maze, 0, 0, "", new boolean[4][4]));
	}

	public static int blockedMaze(int[][] maze, int cr, int cc, String ans, boolean[][] visited) {
		if (cr == maze.length - 1 && cc == maze[0].length - 1) {
			System.out.println(ans);
			return 1;
		}
		if (cr < 0 || cr >= maze.length || cc < 0 || cc >= maze[0].length || maze[cr][cc] == 1 || visited[cr][cc]) {
			return 0;
		}
		visited[cr][cc] = true;
		// DTLR
		int d = blockedMaze(maze, cr + 1, cc, ans + "D", visited);
		int t = blockedMaze(maze, cr - 1, cc, ans + "T", visited);
		int l = blockedMaze(maze, cr, cc - 1, ans + "L", visited);
		int r = blockedMaze(maze, cr, cc + 1, ans + "R", visited);

		visited[cr][cc] = false;
		

		return d + t + l + r;
	}

}

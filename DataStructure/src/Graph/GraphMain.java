package Graph;
public class GraphMain {
	public static void main(String[] args) {
		int[][] arraygraph = {{0,1,0,1,0},
							  {1,0,0,0,0},
							  {0,0,1,1,0},
							  {1,0,1,0,0},
							  {0,0,0,0,1}};
		ArrayListGraph graph  = new ArrayListGraph(5);
		
		graph.insert(0,1);
		graph.insert(2,3);
		graph.insert(1,2);
		graph.insert(3,4);
		graph.insert(0,4);
		graph.insert(1,4);
		graph.PrintGraph();
		System.out.println("BFS");
		graph.bfs(0);
		System.out.println();
		System.out.println("DFS");
		graph.dfs(0);
		System.out.println();
		System.out.println("Depth First Search Using Stack");
		graph.StackDFS(0);
	}	
}

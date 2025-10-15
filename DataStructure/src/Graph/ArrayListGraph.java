package Graph;
import java.util.*;
public class ArrayListGraph {
	List<List<Integer>> graph =new ArrayList<>();
	public ArrayListGraph(int v) {
		for(int i=0;i<v;i++) {
			graph.add(new ArrayList<Integer>());
		}
	}
	public void insert(int u,int v) {
		graph.get(u).add(v);
		graph.get(v).add(u);
	}
	public void PrintGraph(){
		for(int i=0;i<graph.size();i++) {
			System.out.print("Vertex - " + i +" -");
			for(int j =0;j<graph.get(i).size();j++) {
				System.out.print(" "+ graph.get(i).get(j));
			}
			System.out.println();
		}
	}
	//bfs
	public void bfs(int v) {
		int size = graph.size();
		boolean[] visited = new boolean[size];
		Queue<Integer> qu =new LinkedList<>();
		qu.add(v);
		visited[v] = true;
		while(!qu.isEmpty()) {
			int vertex = qu.poll();
			System.out.print(vertex+" ");
			for(int i=0;i<graph.get(vertex).size();i++) {
				int  av = graph.get(vertex).get(i);
				if(!visited[av]){
					qu.add(av);
					visited[av]= true;
				}
			}
		}
	}
	//over riding?
	public void dfs(int v) {
		int s = graph.size();
		boolean[] visited = new boolean[s];
		dfs(v,visited);
	}
	private void dfs(int v,boolean[] visited) {
		visited[v] = true;
		System.out.print(v+" ");
		for(int i=0;i<graph.get(v).size();i++) {
			int av = graph.get(v).get(i);
			if(!visited[av]) {
				dfs(av,visited);
			}
		}
	}
}

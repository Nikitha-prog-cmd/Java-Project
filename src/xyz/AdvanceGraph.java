package xyz;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;

public class AdvanceGraph {
	
	static class graph{
		private Map<Integer,List<Integer>> adjlist=new HashMap<Integer,List<Integer>>();
		
		void addEdge(int u,int v) {
			adjlist.computeIfAbsent(u,k->new ArrayList<>()).add(v);
			adjlist.computeIfAbsent(v, k->new ArrayList<>()).add(u);
		}
		void printGraph() {
			for(int node:adjlist.keySet()) {
				System.out.println("Node "+node+" is connected to: ");
		    for(int neighbor:adjlist.get(node))	{
		    	System.out.println(neighbor+" ");
		    }
			}
		}
	}
	public static void main(String[] args) {
		graph g1=new graph();
		g1.addEdge(1, 2);
		g1.addEdge(1, 3);
		g1.addEdge(1, 4);
		g1.addEdge(1, 4);
		
		g1.printGraph();
	}

}

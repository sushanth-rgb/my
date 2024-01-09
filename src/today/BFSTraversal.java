package today;

import java.util.*;
import java.io.*;
class BFSTraversal{
	public int V;
	public LinkedList<Integer> adj[];
	

	@SuppressWarnings("unchecked")
	BFSTraversal(int c){
	    V = c; 
	    adj = new LinkedList[V];
	    for(int i = 0; i < V; i++) {
	        adj[i] = new LinkedList<Integer>();
	    }
	}

	void edges(int u, int v) {
	    adj[u].add(v); 
	}
	void BFS(int s) {
	    boolean visited[] = new boolean[V];
	    LinkedList<Integer> queue = new LinkedList<Integer>();

	    visited[s] = true;
	    queue.add(s);

	    while (!queue.isEmpty()) {
	        s = queue.poll();
	        System.out.print(s + " ");

	        Iterator<Integer> i = adj[s].listIterator();
	        while (i.hasNext()) {
	            int n = i.next();
	            if (!visited[n]) {
	                visited[n] = true;
	                queue.add(n);
	            }
	        }
	    }
	}

	public static void main(String[] args) {
		
		BFSTraversal g = new BFSTraversal(4);
		g.edges(0, 1);
		g.edges(0, 2);
		g.edges(1, 2);
		g.edges(2, 0);
		g.edges(3, 0);
		

 
        System.out.println(
            "Following is Breadth First Traversal "
            + "(starting from vertex 3)");
 
        g.BFS(3);
    }
}
import java.util.*;
import java.io.*;
class Position {
	int node, distance;
	Position(int node, int distance){
		this.node =node;
		this.distance = distance;
	}
}
public class Main {
    static boolean[] visit;
    static ArrayList<ArrayList<Position>> tree; 
    static int max,value;
    static int max2,value2;
    static PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
    public static void main(String[] args) throws Exception{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        tree = new ArrayList<>();
        visit = new boolean[n+1];
        for (int i = 0; i <= n	; i++) {
            tree.add(new ArrayList<>());
        }
        
        for( int i = 1 ; i < n ; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int start = Integer.parseInt(st.nextToken());
        	int end = Integer.parseInt(st.nextToken());
        	int distance = Integer.parseInt(st.nextToken());
        	addEdge(start, end, distance);
        }
        dfs(1,0,0,-1);
        visit = new boolean[n+1];
        int re = value;
        max = 0;
        pq.add(-1);
        dfs(value,0,0,-1);
        visit = new boolean[n+1];
        visit[re] = true;
        dfs(value,0,0,-1);
        pq.poll();
        System.out.println(pq.peek());
        
    }

    static void addEdge(int u, int v, int distance) {
    	Position ps1 = new Position(u,distance);
    	Position ps2 = new Position(v,distance);
        tree.get(u).add(ps2);
        tree.get(v).add(ps1);
    }
    
    static void dfs(int node , int depth,int idx,int par){
    	visit[node] = true;
    	
    	for( Position adj : tree.get(node)) {
    		if( !visit[adj.node]) {
    		visit[adj.node] = true;
    		if(!pq.isEmpty() ) {
    			pq.add(depth+adj.distance);
    		}
    		dfs(adj.node,depth+adj.distance,idx+1,node);
    		}
    	}
    	
    	if( max <= depth) {
    		max = depth;
    		value = node; 
    	}

    }
    
    
    
}


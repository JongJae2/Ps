import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
		
		for(int i = 0 ; i<= n ; i++) graph.add(new ArrayList<>());
		
		for( int i = 0 ; i < m ; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			graph.get(a).add(b);
			graph.get(b).add(a);
		}
		for (int i = 1 ; i<= n ; i++) Collections.sort(graph.get(i));

		int[] visit = new int[n+1];
		Queue<Integer> qq = new ArrayDeque<>();
		qq.add(k);
		
		int ans = 1 ;
		while(!qq.isEmpty()) {
			int temp = qq.poll();
			if( visit[temp] != 0 ) continue;
			visit[temp] = ans++;
			
			for ( int adj : graph.get(temp)) {
				if( visit[adj] == 0 ) qq.add(adj);
			}
		}
		
		for(int i =  1;  i<= n ; i++) sb.append(visit[i]+ "\n");
		System.out.println(sb);
	}
}

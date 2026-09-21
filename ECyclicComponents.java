import java.util.*;

class ECyclicComponents {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;

    static int vertices;
    static int edges;

    static void dfs(int node) {
        visited[node] = true;
        vertices++;
        edges += graph[node].size();

        for (int next : graph[node]) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        graph = new ArrayList[n + 1];
        visited = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            graph[u].add(v);
            graph[v].add(u);
        }

        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                vertices = 0;
                edges = 0;

                dfs(i);

                if (vertices * 2 == edges) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
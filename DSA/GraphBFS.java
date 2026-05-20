package DSA;
// import java.util.*;
// import java.util.LinkedList;

// public class GraphBFS {
//     private int numVertices;

//     private Map<Integer, List<Integer>> adjacencyList;

//     public GraphBFS(int numVertices) {

//         adjacencyList = new HashMap<>();
//         this.numVertices = numVertices;
//         for (int i = 0; i < numVertices; i++) {
//             adjacencyList.put(i, new LinkedList<>());
//         }
//     }

//     public void addEdge(int source, int destination) {
//         adjacencyList.get(source).add(destination);
//     }

//     public void bfs(int startVertex) {

//         boolean[] visited = new boolean[numVertices];

//         Queue<Integer> queue = new LinkedList<>();

//         visited[startVertex] = true;

//         queue.offer(startVertex);

//         while (!queue.isEmpty()) {
//             int currentVertex = queue.poll();

//             System.out.print(currentVertex + " ");

//             // 0 -> 1,2

//             // neighbor 1
//             // neighbor 2
//             for (int neighbor : adjacencyList.get(currentVertex)) {
//                 visited[neighbor] = true;
//                 queue.offer(neighbor);

//             }
//         }
//     }

//     public static void main(String[] args) {

//         int numVertices = 4;

//         GraphBFS graph = new GraphBFS(numVertices);

//         graph.addEdge(0, 1);
//         graph.addEdge(0, 2);
//         graph.addEdge(1, 2);
//         graph.addEdge(2, 3);

//         System.out.println("BFS Traversal: ");
//         graph.bfs(0);

//     }

// }
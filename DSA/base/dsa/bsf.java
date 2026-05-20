// public class bsf {
//     private int[][] adjMatrix;
//     private char[] vertexData;
//     private int size;

//     public void Graph(int size) {
//         this.size = size;
//         this.adjMatrix = new int[size][size];
//         this.vertexData = new char[size];
//     }

//     public void addEdges(int startNode, int endNode) {
//         // if (startNode >= 0 && startNode < size && endNode >= 0 && endNode < size) {
//         adjMatrix[startNode][endNode] = 1;
//         adjMatrix[endNode][startNode] = 1;
//         // }
//     }

//     public void addVertexData(int vertex, char data) {
//         if (vertex >= 0 && vertex < size) {
//             vertexData[vertex] = data;
//         }
//     }

//     public void printGraph() {
//         for (int[] row : adjMatrix) {
//             for (int cell : row) {
//                 System.out.println(cell + " ");
//             }
//             System.out.println();
//         }

//         for (int i = 0; i < size; i++) {
//             System.out.println("Vertex " + i + " : " + vertexData[i]);
//         }
//     }

//     private void dfsUtil(int endNode, boolean[] visited) {
//         visited[endNode] = true;
//         System.out.println(vertexData[endNode] + " ");

//         for (int i = 0; i < size; i++) {
//             if (adjMatrix[v][i] == 1 && !visited[i]) {
//                 dfsUtil(i, visited);
//             }
//         }
//     }

//     public void dfs(char startVertedData) {
//         boolean[] visited = new boolean[size];
//         int startVertex = new String(vertexData).indexOf(startVertedData);
//         dfsUtil(startVertex, visited);
//     }

//     public static void main(String[] args) {
//         Graph g = new Graph(7);

//         g.addVertexData(0, 'A');
//         g.addVertexData(1, 'B');
//         g.addVertexData(2, 'C');
//         g.addVertexData(3, 'D');
//         g.addVertexData(4, 'E');
//         g.addVertexData(5, 'F');
//         g.addVertexData(6, 'G');

//         g.addEdge(3, 0); // D - A
//         g.addEdge(0, 2); // A - C
//         g.addEdge(0, 3); // A - D
//         g.addEdge(0, 4); // A - E
//         g.addEdge(4, 2); // E - C
//         g.addEdge(2, 5); // C - F
//         g.addEdge(2, 1); // C - B
//         g.addEdge(2, 6); // C - G
//         g.addEdge(1, 5); // B - F

//         g.printGraph();

//         System.out.println("\nDepth First Search starting from vertex D:");
//         g.dfs('D');
//     }

// }

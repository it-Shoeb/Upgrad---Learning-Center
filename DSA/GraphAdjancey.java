package DSA;
// import java.util.Scanner;

// public class GraphAdjancey {

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         // first thing first
//         // node or vertices we required, through using scanner and assign to the two
//         // dimentional array size
//         System.out.print("Enter Vertices: ");
//         int vertices = input.nextInt();
//         int[][] graph = new int[vertices][vertices];

//         // basically edges mean how many time should loop goes depend on the node or
//         // edges and how they are connected
//         System.out.print("Enter Edges: ");
//         int edges = input.nextInt();

//         for (int i = 1; i <= edges; i++) {

//             int startNode = input.nextInt();
//             int endNode = input.nextInt();
//             // getting indexes for the two dimentional array on each time loop run
//             // and here passing the 1 at the when both indexes is meet;

//             graph[startNode][endNode] = 1;
//             graph[endNode][startNode] = 1; // if its connect clock wise or anti clock wise
//             // basically anticlock wise using because here we are using undirected graph
//             // data structure
//         }

//         for (int i = 0; i < vertices; i++) {
//             for (int j = 0; j < vertices; j++) {
//                 System.out.print(graph[i][j]);
//             }
//             System.out.println();
//         }

//     }
// }
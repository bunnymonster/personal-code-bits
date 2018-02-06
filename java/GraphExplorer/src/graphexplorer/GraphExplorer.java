/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphexplorer;

/**
 *
 * @author weber_000
 */
public class GraphExplorer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Graph graph = new Graph("1,2,3;0,2,3;0,1,3;0,1,2");
        
        System.out.println(graph.printGraphRepresentation());
        
        System.out.println();
        graph.addVertex();
        System.out.println("Adding vertex 4");
        graph.addEdge(0, 4);
        System.out.println("adding edge from vertex 0 to vertex 4");
        graph.addEdge(1,4);
        System.out.println("adding edge from vertex 1 to vertex 4");
        System.out.println();
        
        System.out.println(graph.printGraphRepresentation());
        
    }
    
}

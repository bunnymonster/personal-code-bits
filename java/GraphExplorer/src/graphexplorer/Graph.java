/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphexplorer;

import java.util.LinkedList;

/**
 *
 * @author weber_000
 */
public class Graph {
    
    private LinkedList<LinkedList> vertices;
    
    public Graph() {
        this.vertices = new LinkedList<>();
    }
    
    public Graph(String str) {
        this.vertices = new LinkedList<>();
        String[] strArray = str.split(";");
        for (String strArray1 : strArray) {
            LinkedList e = new LinkedList();
            String[] innerArr = strArray1.split(",");
            for (String innerArr1 : innerArr) {
                e.add(Integer.parseInt(innerArr1));
            }
            vertices.add(e);
        }
    }
    
    public int getVertexCount() {
        return vertices.size();
    }
    
    public void addVertex() {
        vertices.add(new LinkedList());
    }
    
    public void addEdge(int vertexOne, int vertexTwo) {
        vertices.get(vertexOne).add(vertexTwo);
        vertices.get(vertexTwo).add(vertexOne);
    }
    
    public String printGraphRepresentation() {
        StringBuilder s = new StringBuilder();
        s.append("Graph ").append(":\n");
        for(int i = 0; i<vertices.size();i++) {
            s.append("vertex ").append(i).append(" is connected to ");
            if(!vertices.get(i).isEmpty()) {
                for(int j=0;j<vertices.get(i).size();j++) {
                    s.append(vertices.get(i).get(j)).append(",");
                }
            } else {
                s.append("");
            }
            s.append("\n");
            s.replace(s.lastIndexOf(",\n"), s.lastIndexOf(",\n")+1, "");
        }
        return s.toString();
    }
    
}

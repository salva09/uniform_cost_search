package me.salva;

import java.util.ArrayList;

public class Node {
    private String name;
    private ArrayList<Edge> edges;

    public Node(String name) {
        this.setName(name);
        this.edges = new ArrayList<>();
    }

    public void addEdge(Node destination, float cost) {
        this.edges.add(new Edge(destination, cost));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Edge> getEdges() {
        return edges;
    }

    public void setEdges(ArrayList<Edge> edges) {
        this.edges = edges;
    }
}

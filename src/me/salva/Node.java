package me.salva;

import java.util.ArrayList;

public class Node {
    private final String name;
    private final ArrayList<Edge> edges;

    public Node(String name) {
        this.name = name;
        this.edges = new ArrayList<>();
    }

    public void addEdge(Node destination, float cost) {
        this.edges.add(new Edge(destination, cost));
    }

    public String getName() {
        return name;
    }

    public ArrayList<Edge> getEdges() {
        return edges;
    }
}

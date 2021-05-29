package me.salva;

import java.util.ArrayList;

public class Node {
    private final String name;
    private final ArrayList<Edge> edges;
    private float heuristic;

    public Node(String name) {
        this.name = name;
        this.edges = new ArrayList<>();
    }

    public Node(String name, float heuristic) {
        this.name = name;
        this.edges = new ArrayList<>();
        this.heuristic = heuristic;
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

    public float getHeuristic() {
        return heuristic;
    }
}

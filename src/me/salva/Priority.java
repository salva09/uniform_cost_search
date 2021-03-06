package me.salva;

import java.util.ArrayList;

public class Priority {
    private final Node node;
    private final Float cost;
    private final ArrayList<Node> path;

    public Priority(Node nodes, Float cost, ArrayList<Node> path) {
        this.node = nodes;
        this.cost = cost;
        path.add(getNode());
        this.path = path;
    }

    public ArrayList<Node> getPath() {
        return (ArrayList<Node>) path.clone();
    }

    public Float getCost() {
        return cost;
    }

    public Node getNode() {
        return node;
    }
}

package me.salva;

public class Edge {
    private final Node destination;
    private final float cost;

    public Edge(Node destination, float cost) {
        this.destination = destination;
        this.cost = cost;
    }

    public float getCost() {
        return cost;
    }

    public Node getDestination() {
        return destination;
    }
}

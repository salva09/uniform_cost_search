package me.salva;

public class Edge {
    private Node destination;
    private float cost;

    public Edge(Node destination, float cost) {
        this.setDestination(destination);
        this.setCost(cost);
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public Node getDestination() {
        return destination;
    }

    public void setDestination(Node destination) {
        this.destination = destination;
    }
}

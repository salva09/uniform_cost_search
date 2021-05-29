package me.salva;

public class Main {
    public static void main(String[] args) {
        uniformCostExample();
        aStarExample();
    }

    private static void uniformCostExample() {
        System.out.println("Uniform Cost Example");

        var city_a = new Node("A");
        var city_b = new Node("B");
        var city_c = new Node("C");
        var city_d = new Node("D");

        city_a.addEdge(city_c, 1);
        city_a.addEdge(city_d, 2);
        city_c.addEdge(city_b, 4);
        city_d.addEdge(city_b, 2);

        var solution = new UniformCost().search(city_a, city_b);

        printSolution(solution);
    }

    private static void aStarExample() {
        System.out.println("A* Example");

        var city_a = new Node("A", 5);
        var city_b = new Node("B", 3);
        var city_c = new Node("C", 1);
        var city_d = new Node("D", 0);

        city_a.addEdge(city_b, 1);
        city_a.addEdge(city_c, 2);
        city_b.addEdge(city_d, 4);
        city_c.addEdge(city_d, 2);

        var solution = new AStar().search(city_a, city_d);

        printSolution(solution);
    }

    private static void printSolution(Priority solution) {
        System.out.println("Solution");
        System.out.println("Cost: " + solution.getCost());
        System.out.print("Path: ");
        for (Node node: solution.getPath()) {
            System.out.print(node.getName() + " ");
        }
        System.out.println();
    }
}

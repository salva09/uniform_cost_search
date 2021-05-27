package me.salva;

public class Main {
    public static void main(String[] args) {
        var city_a = new Node("A");
        var city_b = new Node("B");
        var city_c = new Node("C");
        var city_d = new Node("D");
        var city_e = new Node("E");

        city_a.addEdge(city_b, 10);
        city_a.addEdge(city_c, 6);
        city_b.addEdge(city_e, 10);
        city_c.addEdge(city_d, 10);
        city_d.addEdge(city_e, 2);

        var solution = new UniformCost().search(city_a, city_e);

        printSolution(solution);
    }

    private static void printSolution(Priority solution) {
        System.out.println("Solution");
        System.out.println("Cost: " + solution.getCost());
        System.out.print("Path: ");
        for (Node node: solution.getPath()) {
            System.out.print(node.getName() + " ");
        }
    }
}

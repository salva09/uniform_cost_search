package me.salva;

import java.util.*;

public class UniformCost {
    public Priority search(Node start, Node meta) {
        ArrayList<Priority> priorityQueue = new ArrayList<>();

        priorityQueue.add(new Priority(start, 0f, new ArrayList<>()));

        while (!priorityQueue.isEmpty()) {
            var minPriority = getMinPriority(priorityQueue);

            if (minPriority.getNode() == meta) {
                return minPriority;
            }

            expandChildNodes(priorityQueue, minPriority);
            priorityQueue.remove(minPriority);
        }
        return null;
    }

    private void expandChildNodes(ArrayList<Priority> priorityQueue, Priority priority) {
        for (Edge edge : priority.getNode().getEdges()) {
            priorityQueue.add(new Priority(edge.getDestination(), edge.getCost() + priority.getCost(), priority.getPath()));
        }
    }

    public Priority getMinPriority(ArrayList<Priority> priorities) {
        Priority minCostPriority = priorities.get(0);

        for (Priority priority : priorities) {
            if (priority.getCost() < minCostPriority.getCost()) {
                minCostPriority = priority;
            }
        }

        return minCostPriority;
    }
}

package me.salva;

import java.util.*;

public class UniformCost {
    final ArrayList<Priority> priorityQueue;

    public UniformCost() {
        this.priorityQueue = new ArrayList<>();
    }

    public Priority search(Node start, Node meta) {
        priorityQueue.add(new Priority(start, 0f, new ArrayList<>()));

        while (!priorityQueue.isEmpty()) {
            var minPriority = getMinPriority();

            if (metaReached(meta, minPriority)) {
                return minPriority;
            }

            expandChildNodes(minPriority);
            priorityQueue.remove(minPriority);
        }
        return null;
    }

    boolean metaReached(Node meta, Priority minPriority) {
        return minPriority.getNode() == meta;
    }

    void expandChildNodes(Priority priority) {
        for (Edge edge : priority.getNode().getEdges()) {
            priorityQueue.add(new Priority(edge.getDestination(), edge.getCost() + priority.getCost(), priority.getPath()));
        }
    }

    Priority getMinPriority() {
        Priority minCostPriority = priorityQueue.get(0);

        for (Priority priority : priorityQueue) {
            if (priority.getCost() < minCostPriority.getCost()) {
                minCostPriority = priority;
            }
        }

        return minCostPriority;
    }
}

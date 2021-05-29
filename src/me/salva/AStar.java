package me.salva;

import java.util.ArrayList;

public class AStar extends UniformCost {
    public AStar() {
        super();
    }

    @Override
    boolean metaReached(Node meta, Priority minPriority) {
        for (Priority priority: priorityQueue) {
            if (priority.getNode() == meta) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Priority getMinPriority() {
        Priority minCostPriority = priorityQueue.get(0);

        for (Priority priority : priorityQueue) {
            var priorityWeight = priority.getCost() + priority.getNode().getHeuristic();
            var minCostPriorityWeight = minCostPriority.getCost() + minCostPriority.getNode().getHeuristic();

            if (priorityWeight < minCostPriorityWeight) {
                minCostPriority = priority;
            }
        }

        return minCostPriority;
    }
}

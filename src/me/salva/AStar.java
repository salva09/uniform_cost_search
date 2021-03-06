package me.salva;

import java.util.ArrayList;

public class AStar extends UniformCost {
    public AStar() {
        super();
    }

    @Override
    public Priority search(Node start, Node meta) {
        priorityQueue.add(new Priority(start, 0f, new ArrayList<>()));

        while (!priorityQueue.isEmpty()) {
            var minPriority = priorityQueue.get(0);

            for (Priority priority : priorityQueue) {
                if (priority.getNode() == meta) {
                    return priority;
                }

                var priorityWeight = priority.getCost() + priority.getNode().getHeuristic();
                var minCostPriorityWeight = minPriority.getCost() + minPriority.getNode().getHeuristic();

                if (priorityWeight < minCostPriorityWeight) {
                    minPriority = priority;
                }
            }

            expandChildNodes(minPriority);
            priorityQueue.remove(minPriority);
        }
        return null;
    }
}

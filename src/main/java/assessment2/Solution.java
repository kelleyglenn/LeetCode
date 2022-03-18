package assessment2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class Solution {

    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        List<List<Integer>> critical = new ArrayList<>();
        for (List<Integer> connection : connections) {
            List<List<Integer>> remaining = connections.stream().filter(x -> x != connection).collect(
                Collectors.toList());
            if (!isGraphFullyTraversable(buildGraph(n, remaining))) {
                critical.add(connection);
            }
        }
        return critical;
    }

    public Map<Integer, Set<Integer>> buildGraph(int n, List<List<Integer>> connections) {
        Map<Integer, Set<Integer>> graph = new HashMap<>(n);
        for (int i = 0; i < n; i++) {
            graph.put(i, new HashSet<>());
        }
        for (List<Integer> connection : connections) {
            int a = connection.get(0);
            int b = connection.get(1);
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        return graph;
    }

    public boolean isGraphFullyTraversable(Map<Integer, Set<Integer>> graph) {
        System.out.println();
        for (Integer i : graph.keySet()) {
            Set<Integer> visited = new HashSet<>();
            Set<Integer> unvisited = new HashSet<>(graph.keySet());
            Set<Integer> toVisit = new HashSet<>();
            toVisit.add(i);
            while (!toVisit.isEmpty()) {
                Integer current = toVisit.stream().findFirst().get();
                System.out.println("Current: " + current);
                toVisit.remove(current);
                visited.add(current);
                unvisited.remove(current);
                for (Integer neighbor : graph.get(current)) {
                    if (unvisited.contains(neighbor)) {
                        toVisit.add(neighbor);
                    }
                }
            }
            if (!unvisited.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println("Input: n = 4, connections = [[0,1],[1,2],[2,0],[1,3]]");
        System.out.println("Output: " + sol.criticalConnections(4,
            Arrays.asList(Arrays.asList(0, 1), Arrays.asList(1, 2), Arrays.asList(2, 0), Arrays.asList(1, 3))));
    }
}

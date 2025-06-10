package xyz;

import java.util.*;

public class SimpleDFS {

    private Map<String, List<String>> homemap = new HashMap<>();
    private Set<String> visited = new HashSet<>();

    // Method to add connection between two rooms (bidirectional)
    public void addRoom(String room, String connectedRoom) {
        homemap.computeIfAbsent(room, k -> new ArrayList<>()).add(connectedRoom);
        homemap.computeIfAbsent(connectedRoom, k -> new ArrayList<>()).add(room);
    }

    // Depth-First Search traversal
    public void dfs(String currentRoom) {
        if (visited.contains(currentRoom)) return;

        System.out.println(currentRoom);  // Print the current room
        visited.add(currentRoom);        // Mark room as visited

        for (String neighbor : homemap.getOrDefault(currentRoom, new ArrayList<>())) {
            dfs(neighbor);               // Visit connected rooms
        }
    }

    public static void main(String[] args) {
        SimpleDFS home = new SimpleDFS();
        home.addRoom("living room", "kitchen");
        home.addRoom("living room", "Bedroom");
        home.addRoom("Bedroom", "Bathroom");

        // Perform DFS starting from the living room
        System.out.println("DFS traversal starting from living room:\n");
        home.dfs("living room");
    }
}
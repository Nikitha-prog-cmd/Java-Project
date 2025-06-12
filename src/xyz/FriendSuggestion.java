package xyz;
import java.util.*;

public class FriendSuggestion {

    // Main method
    public static void main(String[] args) {
        // Sample network as an adjacency list
        Map<String, Set<String>> network = new HashMap<>();

        // Adding users and their friends
        addFriend(network, "Alice", "Bob");
        addFriend(network, "Alice", "Charlie");
        addFriend(network, "Bob", "David");
        addFriend(network, "Charlie", "David");
        addFriend(network, "Charlie", "Eve");
        addFriend(network, "Eve", "Frank");
        addFriend(network, "David", "Eve");

        // Show suggestions for each user
        for (String user : network.keySet()) {
            List<String> suggestions = suggestFriends(user, network);
            System.out.println("Friend suggestions for " + user + ": " + suggestions);
        }
    }

    // Adds a bidirectional friendship
    public static void addFriend(Map<String, Set<String>> network, String user1, String user2) {
        network.putIfAbsent(user1, new HashSet<>());
        network.putIfAbsent(user2, new HashSet<>());
        network.get(user1).add(user2);
        network.get(user2).add(user1);
    }

    // Suggest friends based on mutual friends
    public static List<String> suggestFriends(String user, Map<String, Set<String>> network) {
        Map<String, Integer> mutualCount = new HashMap<>();
        Set<String> userFriends = network.getOrDefault(user, new HashSet<>());

        // Loop through user's friends
        for (String friend : userFriends) {
            Set<String> friendsOfFriend = network.getOrDefault(friend, new HashSet<>());
            for (String potential : friendsOfFriend) {
                // Skip the user and already-added friends
                if (!potential.equals(user) && !userFriends.contains(potential)) {
                    mutualCount.put(potential, mutualCount.getOrDefault(potential, 0) + 1);
                }
            }
        }

        // Sort potential friends by number of mutual friends (descending)
        List<Map.Entry<String, Integer>> sorted = new ArrayList<>(mutualCount.entrySet());
        sorted.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        // Extract names from sorted list
        List<String> suggestions = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : sorted) {
            suggestions.add(entry.getKey() + " (" + entry.getValue() + " mutual friend(s))");
        }

        return suggestions;
    }
}

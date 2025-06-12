package xyz;
import java.util.*;

public class DFS {

    // Represents the adjacency list of the graph
    private Map<String, List<String>> adj;
    // Keeps track of visited people during DFS
    private Set<String> visited;

    public DFS() {
        adj = new HashMap<>();
        visited = new HashSet<>();
    }

   
    public void addPerson(String person) {
        adj.putIfAbsent(person, new ArrayList<>());
    }

    
    public void addConnection(String person1, String person2) {
        // Ensure both people exist in the graph
        addPerson(person1);
        addPerson(person2);

        // Add bi-directional connections
        adj.get(person1).add(person2);
        adj.get(person2).add(person1);
    }

    
    public Set<String> findSocialCircle(String startPerson) {
        if (!adj.containsKey(startPerson)) {
            System.out.println("Error: " + startPerson + " is not in the social network.");
            return new HashSet<>(); // Return empty set if person not found
        }

        visited.clear(); // Clear visited set for a new search
        Set<String> socialCircle = new HashSet<>();
        dfs(startPerson, socialCircle);
        return socialCircle;
    }

    
    private void dfs(String currentPerson, Set<String> socialCircle) {
        visited.add(currentPerson);
        socialCircle.add(currentPerson);

        // Iterate over all connected people
        for (String neighbor : adj.getOrDefault(currentPerson, Collections.emptyList())) {
            if (!visited.contains(neighbor)) {
                dfs(neighbor, socialCircle); // Recursively call DFS for unvisited neighbors
            }
        }
    }

    public static void main(String[] args) {
        DFS network = new DFS();

        // Adding people to the network
        network.addPerson("Alice");
        network.addPerson("Bob");
        network.addPerson("Charlie");
        network.addPerson("David");
        network.addPerson("Eve");
        network.addPerson("Frank");
        network.addPerson("Grace");

        // Adding connections (representing friendships)
        network.addConnection("Alice", "Bob");
        network.addConnection("Bob", "Charlie");
        network.addConnection("Charlie", "David"); // Alice, Bob, Charlie, David are in one circle

        network.addConnection("Eve", "Frank"); // Eve and Frank are in another circle

        // Grace is alone
        network.addPerson("Grace");


        System.out.println("Finding social circle for Alice:");
        Set<String> aliceCircle = network.findSocialCircle("Alice");
        System.out.println("Alice's social circle: " + aliceCircle); // Expected: [Alice, Bob, Charlie, David] (order might vary)

        System.out.println("\nFinding social circle for Eve:");
        Set<String> eveCircle = network.findSocialCircle("Eve");
        System.out.println("Eve's social circle: " + eveCircle); // Expected: [Eve, Frank]

        System.out.println("\nFinding social circle for Grace:");
        Set<String> graceCircle = network.findSocialCircle("Grace");
        System.out.println("Grace's social circle: " + graceCircle); // Expected: [Grace]

        System.out.println("\nFinding social circle for a non-existent person (Xavier):");
        Set<String> xavierCircle = network.findSocialCircle("Xavier");
        System.out.println("Xavier's social circle: " + xavierCircle); // Expected: empty set and error message
    }
}
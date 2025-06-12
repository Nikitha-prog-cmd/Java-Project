package xyz;

import java.util.HashMap;

public class LRUCache {
    private final int capacity;
    private final HashMap<Integer, Node> cache;
    private final DoublyLinkedList order;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();
        this.order = new DoublyLinkedList();
    }

    public int get(int key) {
        if (cache.containsKey(key)) {
            Node node = cache.get(key);
            order.moveToFront(node);
            return node.value;
        }
        return -1;
    }

    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            Node node = cache.get(key);
            node.value = value;
            order.moveToFront(node);
        } else {
            if (cache.size() == capacity) {
                Node oldest = order.removeLast();
                cache.remove(oldest.key);
            }
            Node newNode = new Node(key, value);
            cache.put(key, newNode);
            order.addFirst(newNode);
        }
    }

    private static class Node {
        int key, value;
        Node prev, next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private static class DoublyLinkedList {
        private final Node head, tail;

        DoublyLinkedList() {
            head = new Node(0, 0);
            tail = new Node(0, 0);
            head.next = tail;
            tail.prev = head;
        }

        void addFirst(Node node) {
            node.next = head.next;
            node.prev = head;
            head.next.prev = node;
            head.next = node;
        }

        void moveToFront(Node node) {
            remove(node);
            addFirst(node);
        }

        Node removeLast() {
            if (head.next == tail) return null;
            Node last = tail.prev;
            remove(last);
            return last;
        }

        void remove(Node node) {
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }
    }
        public static void main(String[] args) {
            LRUCache cache = new LRUCache(3);

            cache.put(1, 100);
            cache.put(2, 200);
            cache.put(3, 300);

            System.out.println(cache.get(2)); // Output: 200

            cache.put(4, 400); // Evicts key 1

            System.out.println(cache.get(1)); // Output: -1 (not found)
            System.out.println(cache.get(3)); // Output: 300
            System.out.println(cache.get(4)); // Output: 400
        }
    

}

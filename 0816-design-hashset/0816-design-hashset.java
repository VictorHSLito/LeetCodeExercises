class MyHashSet {

    // Nested Class that represents an LinkedList
    private static class Node {
        int value;
        Node next;

        public Node(int val) {
            this.value = val;
        }

        public int getValue() {
            return this.value;
        }

        public Node getNext() {
            return this.next;
        }
    }

    private final Node[] set; // Array of Nodes 

    public MyHashSet() {
        set = new Node[10000];
        for (int i = 0; i < set.length; i++) {
            set[i] = new Node(0);
        }
    }
    
    public void add(int key) {
        Node current = set[key % set.length];
        while (current.next != null) {
            if (current.next.value == key) return;
            current = current.next;
        }

        current.next = new Node(key);
    }
    
    public void remove(int key) {
        Node current = set[key % set.length];

        while (current.next != null) {
            if (current.next.value == key) {
                current.next = current.next.next;
                return;
            }

            current = current.next;
        }
    }
    
    public boolean contains(int key) {
        Node current = set[key % set.length];

        while (current.next != null) {
            if (current.next.value == key) return true;
            current = current.next;
        }

        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
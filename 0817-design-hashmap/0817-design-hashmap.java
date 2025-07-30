class MyHashMap {

    private static class Node {
        int key, value;
        Node next;

        public Node(int key, int value, Node next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public Node() {
            this(-1, -1, null);
        }
    }

    private final Node[] hashMap;

    public MyHashMap() {
        hashMap = new Node[10000];
        for (int i = 0; i < hashMap.length; i++) {
            hashMap[i] = new Node();
        }
    }
    
    private int generateHashKey(int key) {
        return key % hashMap.length;
    }

    public void put(int key, int value) {
        int hashNumber = generateHashKey(key);
        Node current = hashMap[hashNumber];

        while (current.next != null) {
            if (current.next.key == key) {
                current.next.value = value;
                return;
            }

            current = current.next;
        }

        current.next = new Node(key, value, null);
    }
    
    public int get(int key) {
        int hashNumber = generateHashKey(key);
        Node current = hashMap[hashNumber];

        while(current.next != null) {
            if (current.next.key == key) {
                return current.next.value;
            }
            current = current.next;
        }

        return -1;
    }
    
    public void remove(int key) {
        int hashNumber = generateHashKey(key);
        Node current = hashMap[hashNumber];

        while(current.next != null) {
            if (current.next.key == key) {
                current.next = current.next.next;
                return;
            }

            current = current.next;
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
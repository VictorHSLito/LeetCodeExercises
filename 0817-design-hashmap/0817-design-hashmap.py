class _Node:
        def __init__(self, key = -1, data = -1, next=None):
            self.key = key
            self.data = data
            self.next = next

class MyHashMap:

    def __init__(self):
        self.nodes = [ _Node() for node in range(1000)]
        self.size = len(self.nodes)

    # def hash_function(key: int) -> int:
    #     return key % self.size

    def put(self, key: int, value: int) -> None:
        index = key % self.size
        head = self.nodes[index]
        while head.next:
            if head.next.key == key:
                head.next.data = value
                return
            head = head.next
        head.next = _Node(key=key, data=value)
        
    def get(self, key: int) -> int:
        index = key % self.size
        head = self.nodes[index].next
        while head:
            if head.key == key:
                return head.data
            head = head.next
        return -1

    def remove(self, key: int) -> None:
        index = key % self.size
        head = self.nodes[index]
        while head and head.next:
            if head.next.key == key:
                head.next = head.next.next
                return
            head = head.next


# Your MyHashMap object will be instantiated and called as such:
# obj = MyHashMap()
# obj.put(key,value)
# param_2 = obj.get(key)
# obj.remove(key)
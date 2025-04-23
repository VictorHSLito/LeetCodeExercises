class MyHashSet:

    class _Node:
        def __init__(self, key, next=None):
            self.key = key
            self.next = next

    def __init__(self):
        self._slots = [MyHashSet._Node(0) for _ in range(1000)]
        self.size = len(self._slots)


    def _hash_function(self, key: int) -> int:
        return key % self.size

    def add(self, key: int) -> None:
        index = self._hash_function(key)
        head = self._slots[index]
        while head.next:
            if head.next.key == key:
                return
            head = head.next
        head.next = MyHashSet._Node(key)

    def remove(self, key: int) -> None:
        index = self._hash_function(key)
        head = self._slots[index]
        while head.next:
            if head.next.key == key:
                head.next = head.next.next
                return
            head = head.next
            

    def contains(self, key: int) -> bool:
        index = self._hash_function(key)
        head = self._slots[index]
        while head.next:
            if head.next.key == key:
                return True
            head = head.next
        return False

# Your MyHashSet object will be instantiated and called as such:
# obj = MyHashSet()
# obj.add(key)
# obj.remove(key)
# param_3 = obj.contains(key)
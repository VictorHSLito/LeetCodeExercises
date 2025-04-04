class MyHashSet:

    def __init__(self):
        self.size = 0
        self.values = set()

    def add(self, key: int) -> None:
        if key not in self.values:
            self.values.add(key)
            self.size += 1
            return self.values
        else:
            return

    def remove(self, key: int) -> None:
        if key in self.values:
            self.values.remove(key)
            self.size -= 1
            return self.values
        else:
            return

    def contains(self, key: int) -> bool:
        if key in self.values:
            return True
        else:
            return False


# Your MyHashSet object will be instantiated and called as such:
# obj = MyHashSet()
# obj.add(key)
# obj.remove(key)
# param_3 = obj.contains(key)
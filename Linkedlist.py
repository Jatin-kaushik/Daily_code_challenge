class Node():
    def __init__(self):
        self.data = None
        self.next = None
        
class LinkedList():
    def __init__(self):
        self.head = None
        self.tail = None
        self.size = 0
        
    def length(self):
        print(self.size)
        return self.size

    def addfirst(self, data):
        node = Node()
        node.data = data
        if self.head == None:
            self.head = self.tail = node
            self.size+=1
        else:
            node.next = self.head
            self.head = node
            self.size +=1
    
    def display(self):
        temp = self.head
        while(temp.next != None):
            print(temp.data, end = "-->")
            temp = temp.next
        print(temp.data, end = "")
        
ll =LinkedList()
ll.length()
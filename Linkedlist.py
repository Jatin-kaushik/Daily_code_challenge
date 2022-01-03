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
    
    def addlast(self, data):
        node = Node()
        node.data = data
        if self.head == None:
            self.head = self.tail = node
            self.size+=1
        else:
            self.tail.next = node
            self.tail = node
            self.size +=1
            
    def addatany(self, idx, data):
        node = Node()
        node.data = data
        if idx >= 0 or idx < size():  
            if idx == 0:
                addfirst(data)
            elif idx == size() -1:
                addlast(data)
            else:
                pointer = 0
                temp = self.head
                while(pointer != idx-1): # ek phle rukenge
                    temp = temp.next
                node.next = temp.next
                temp.next = node
                
            
        
    def display(self):
        temp = self.head
        while(temp.next != None):
            print(temp.data, end = "-->")
            temp = temp.next
        print(temp.data, end = "")
        print()
        
ll =LinkedList()
ll.length()
ll.addfirst(10)
ll.addfirst(20)
ll.addfirst(30)
ll.display()
ll.length()
ll.addlast(50)
ll.display()
ll.length()
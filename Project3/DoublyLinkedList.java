public class DoublyLinkedList {
    public class Node {
        private int data;
        private Node next;
        private Node previous;

        public Node(int data) {
            this.data = data;
            next = null;
            previous = null;
        }

        public int getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }

        public Node getPrevious() {
            return previous;
        }

        public void setData(int data) {
            this.data = data;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public void setPrevious(Node previous) {
            this.previous = previous;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public DoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            newNode.setPrevious(tail);
            tail = newNode;
        }
        size++;
    }
    public void removeAtIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        if (index == 0) {
            head = head.getNext();
            if (head != null) {
                head.setPrevious(null);
            } else {
                tail = null;
            }
            size--;
            return;
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        current.getPrevious().setNext(current.getNext());
        if (current.getNext() != null) {
            current.getNext().setPrevious(current.getPrevious());
        } else {
            tail = current.getPrevious();
        }
        size--;
    }
    

    public void search(int data) {
        long startTime = System.nanoTime();
        Node current = head;
        while (current != null) {
            if (current.getData() == data) {
                long endTime = System.nanoTime();
                System.out.println("Data found: " + data);
                System.out.println("Time taken: " + (endTime - startTime) + " ns");
                return;
            }
            current = current.getNext();
        }
        long endTime = System.nanoTime();
        System.out.println("Data not found: " + data);
        System.out.println("Time taken: " + (endTime - startTime) + " ns");
    }

    public void traverse() {
        Node current = head;
        while (current != null) {
            System.out.print(current.getData());
            current = current.getNext();
            if (current != null) {
                System.out.print(" <-> ");
            }
        }
        System.out.println();
    }

    public int getSize() {
        return size;
    }
}

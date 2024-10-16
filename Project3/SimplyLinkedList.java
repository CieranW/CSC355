public class SimplyLinkedList {
    public class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }

        public int getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }

        public void setData(int data) {
            this.data = data;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
    
    private Node head;
    private int size;

    public SimplyLinkedList() {
        head = null;
        size = 0;
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        size++;
    }
    public void removeAtIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        if (index == 0) {
            head = head.getNext();
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }
            current.setNext(current.getNext().getNext());
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
        System.out.println("Data not found");
        System.out.println("Time taken: " + (endTime - startTime) + " ns");
    }

    public void traverse() {
        Node current = head;
        while (current != null) {
            System.out.print(current.getData());
            current = current.getNext();
            if (current != null) {
                System.out.print(" -> ");
            }
        }
        System.out.println();
    }

    public int getSize() {
        return size;
    }
}

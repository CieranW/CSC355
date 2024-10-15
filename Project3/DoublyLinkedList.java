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

    public void remove(int data) {
        if (head == null) {
            return;
        }
        if (head.getData() == data) {
            head = head.getNext();
            head.setPrevious(null);
            size--;
            return;
        }
        Node current = head;
        while (current.getNext() != null) {
            if (current.getNext().getData() == data) {
                current.setNext(current.getNext().getNext());
                if (current.getNext() != null) {
                    current.getNext().setPrevious(current);
                } else {
                    tail = current;
                }
                size--;
                return;
            }
            current = current.getNext();
        }
    }

    public void search(int data) {
        Node current = head;
        while (current != null) {
            if (current.getData() == data) {
                System.out.println("Data found: " + data);
                return;
            }
            current = current.getNext();
        }
        System.out.println("Data not found: " + data);
    }

    public void traverse() {
        Node current = head;
        while (current != null) {
            System.out.println(current.getData());
            current = current.getNext();
        }
    }
}

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

    public void remove(int data) {
        if (head == null) {
            return;
        }
        if (head.getData() == data) {
            head = head.getNext();
            size--;
            return;
        }
        Node current = head;
        while (current.getNext() != null) {
            if (current.getNext().getData() == data) {
                current.setNext(current.getNext().getNext());
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
                System.out.println("Data found");
                return;
            }
            current = current.getNext();
        }
        System.out.println("Data not found");
    }

    public void traverse() {
        Node current = head;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }
}

import java.util.Scanner;

public class LinkedLists {    
    class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
    }

    public void removeNode(int index) {
        Node current = head;
        Node previous = null;
        int count = 0;

        if (index == 0 && current != null) {
            head = current.next;
            return;
        }

        while (current != null) {
            if (count == index) {
                previous.next = current.next;
                return;
            } else {
                previous = current;
                current = current.next;
                count++;
            }
        }
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int listSize = scanner.nextInt();
        LinkedLists list1 = new LinkedLists();

        for (int i = 0; i < listSize; i++) {
            list1.insert(scanner.nextInt());
        }

        int nthNode = scanner.nextInt();
        
        list1.removeNode(nthNode);

        list1.printList();
        
        scanner.close();
    }
}

import java.util.Scanner;


public class LinkedListTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int listSize = scanner.nextInt();

        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        SimplyLinkedList simplyLinkedList = new SimplyLinkedList();

        for (int i = 0; i < listSize; i++) {
            int data = scanner.nextInt();
            doublyLinkedList.insert(data);
            simplyLinkedList.insert(data);
        }

        
    }
}

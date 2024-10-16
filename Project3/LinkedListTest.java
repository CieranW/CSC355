import java.util.Scanner;


public class LinkedListTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the size of the list: ");
        int listSize = scanner.nextInt();

        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        SimplyLinkedList simplyLinkedList = new SimplyLinkedList();

        System.out.println("Enter the data to insert: ");
        for (int i = 0; i < listSize; i++) {
            int data = scanner.nextInt();
            doublyLinkedList.insert(data);
            simplyLinkedList.insert(data);
        }

        System.out.println("Enter the operation to perform: ");
        int choice = scanner.nextInt();
        do {
            switch (choice){
                case 1:
                    System.out.println("Enter the data to insert: ");
                    int data = scanner.nextInt();
                    doublyLinkedList.insert(data);
                    simplyLinkedList.insert(data);
                    break;
                case 2:
                    System.out.println("Enter the index to remove: ");
                    int removeIndex = scanner.nextInt();
                    doublyLinkedList.removeAtIndex(removeIndex);
                    simplyLinkedList.removeAtIndex(removeIndex);
                    doublyLinkedList.removeAtIndex(0);
                    simplyLinkedList.removeAtIndex(0);
                    doublyLinkedList.removeAtIndex(doublyLinkedList.getSize() - 1);
                    simplyLinkedList.removeAtIndex(simplyLinkedList.getSize() - 1);
                    break;
                case 3:
                    System.out.println("Enter the data to search: ");
                    int searchData = scanner.nextInt();
                    doublyLinkedList.search(searchData);
                    simplyLinkedList.search(searchData);
                    break;
                case 4:
                    System.out.println("Doubly Linked List: ");
                    doublyLinkedList.traverse();
                    System.out.println("Simply Linked List: ");
                    simplyLinkedList.traverse();
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            System.out.println("Enter the operation to perform (0 to exit): ");
            choice = scanner.nextInt();
        } while (choice != 0);

    }
}

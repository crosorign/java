import java.util.Objects;

public class CreateLinkedListInJava {

    // Creating head
    private static Node head;

    // checking if head is empty create new node add to head
    // else traverse to the end of list and add new element
    private static void addValueIntoLinkedList(int data) {
        if (Objects.isNull(head)) {
            head = new Node(data);
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(data);
        }
    }

    public static void main(String[] args) {
        addValueIntoLinkedList(10);
        addValueIntoLinkedList(20);
        addValueIntoLinkedList(30);
        addValueIntoLinkedList(40);
        addValueIntoLinkedList(50);
        System.out.println("values present in linked list ");
        displayValueInLinkedList();
//        System.out.println("creating loop");
        head.next.next.next.next.next = head;
        // printing list to check loop
        // Lets detect loop in linked list
        detectLoopInLinkedList(); // Since loop statement commented no loop created
     //   displayValueInLinkedList();

    }

    private static void detectLoopInLinkedList() {

        Node slowPointer = head;
        Node fastPointer = head;
        while (slowPointer != null && fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
            if (slowPointer == fastPointer) {
                System.out.println("Detected loop");
                break;
            }
        }
    }


    private static void displayValueInLinkedList() {
        Node temp = head;
        while (temp.next != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    // Creating node
    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


}

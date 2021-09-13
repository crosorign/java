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


        System.out.println("values present in linked list ");
        displayValueInLinkedList();

//        head = reverse(head);
        head.next.next.next = head.next; // loop created here
//        int rotateNumber = 2; // rotating linked list twice
//        rotateLinkedList(rotateNumber);
//        displayValueInLinkedList();
//        detectLoopInLinkedList();

        detectStartOfLoopInLinkedList();
    }

    private static void detectStartOfLoopInLinkedList() {
        Node slowPointer = head;
        Node fastPointer = head;
        while (slowPointer != null && fastPointer != null && slowPointer.next != null && fastPointer.next != null) {
            if (slowPointer == fastPointer) {
                System.out.println("Loop detected");
                break;
            }
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        slowPointer = head;
        // detecting start of the loop
        while (slowPointer != fastPointer) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next;
        }
        System.out.println(" start of loop " + slowPointer.data);
    }


    private static void reverseAndPrintLinkedList() {

        Node next = null;
        Node previous = null;
        Node current = head;
        while (current != null) {
            next = current.next; // pointing next node to current node's next value
            current.next = previous; // pointing current node's next tp previous so it will be rotated
            previous = current; // setting current node to previous node
            current = next; // moving current pointer to next pointer to repeat the reversing process
        }
        head = previous; // all reversed values are stored in this previous
        displayValueInLinkedList(); // printing new reversed values
    }

    static Node reverse(Node head) {
        if (head == null || head.next == null)
            return head;

        /* reverse the rest list and put
        the first element at the end */
        Node rest = reverse(head.next);
        head.next.next = head;

        /* tricky step -- see the diagram */
        head.next = null;

        /* fix the head pointer */
        return rest;
    }

    private static void rotateLinkedList(int rotateNumber) {
        Node temp = head;

        while (rotateNumber > 0) {
            temp = temp.next;
            rotateNumber--;
        }
        Node rotatedHead = temp;
        while (temp.next != null) {
            temp = temp.next; // traversing till end of list
        }
        // Now perform rotate operation
        temp.next = head;  // pointing last node to head

        head = rotatedHead.next; // creating new head
        rotatedHead.next = null; // null  inorder to avoid circular list
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
        slowPointer = head;
        while (slowPointer != fastPointer) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next;
        }
        System.out.println(" start of loop " + slowPointer.data);
    }

    private static void displayValueInLinkedList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("Completed");
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

public class Practice {
    public static void main(String[] args) {
        Node head = new Node('g', null);
        Node ryan = new Node('s', null);
        ryan.next = new Node('t', null);

        printList(head);

    }

    public static void printList(Node start){

        Node current = start;

        while(current != null){
            System.out.println(current.value);
            current = current.next;
        }
    }
}

public class MyLL <T>{
    private class Node<E> {
        public E value;
        public Node<E> prev;
        public Node<E> next;

        public Node (E value, Node<E> prev, Node<E> next){
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }

    private Node<T> head;
    private Node<T> tail;

    public MyLL(){
        head = null;
        tail = head;
    }

    public void printList(){
        Node<T> current = head;

        while(current != null){
            System.out.println(current.value);
            current = current.next;
        }
        
    }

    public void addToBack(T toAdd){
        Node<T> newNode = new Node<>(toAdd, null,null);

        if(head == null){
            head = newNode;
            return;
        }

        Node<T> current = head;
        
        while(current.next != null){
            current = current.next;
        }

        current.next = newNode;
        newNode.prev = current;
        tail = newNode;
    }

    public boolean contains(T toFind){
        Node<T> current = head;

        while(current != null){
            if(current.value.equals(toFind)){
                return true;
            }
            current = current.next;
        }

        return false;
    }

    public T remove(T toRemove){
        if(head == null){
            return null;
        }
        if(head.value.equals(toRemove)){
            head = head.next;
        }

        Node<T> current = head;

        while(current != null){
            if(current.next.value.equals(toRemove)){
                current.next = current.next.next;
                current.prev = current;
                return toRemove;
            }
            current = current.next;
        }

        return null;
    }

    public void printBackwards(){
        Node<T> current = head;

        while(current.next != null){
            current = current.next;
        }

        while(current != null){
            System.out.println(current.value);
            current = current.prev;
        }
    }

    public void printTail(){
        System.out.println(tail.value);
    }
}

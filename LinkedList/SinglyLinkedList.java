package LinkedList;


public class SinglyLinkedList {
    public static class  LinkNode<T>{
        private final T data;
        private LinkNode<T> next;
        public LinkNode(T data){
            this.data = data;
            next = null;
        }
    }
    public static void main(String[] args) {

        LinkNode<Integer> head = new LinkNode<>(0);
        LinkNode<Integer> listNode1 = new LinkNode<>(1);
        LinkNode<Integer> listNode2 = new LinkNode<>(2);
        LinkNode<Integer> listNode3 = new LinkNode<>(3);

        head.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;

        //printListNode(head);

        //printListNode(reverseLinkedList(head));

        // getSize of the LinkedList
        System.out.println("[SIZE] "+ getSize(head));
    }

    public static <T> void printListNode(LinkNode<T> head){
        LinkNode<T> current = head;
        while(current!=null){
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static <T> int getSize(LinkNode<T> head){
        int size = 0;
        LinkNode<T> current = head;
        while (current != null){
            size++;
            current = current.next;
        }
        return size;
    }
    public static <T> LinkNode<T> reverseLinkedList(LinkNode<T> head){
        LinkNode<T> current = head;
        LinkNode<T> prev = null;
        LinkNode<T> next;
        while (current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }
}

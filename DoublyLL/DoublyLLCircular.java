
public class DoublyLLCircular <E>{
    Node <E> head = null;
    Node <E> tail = null; 

public static class Node <E> {
    E data;
    Node <E> next;
    Node <E> prev;

    Node (E data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public void addFront (E data){
    if ( head == null){
        head = new Node <> (data);
        tail = head;
    } else {
        Node <E> new_Node = new Node <> (data);
        new_Node.prev = tail;
        new_Node.next = head;
        head.prev= new_Node;
        head = new_Node;
        tail.next = head; 
    }
}

public void displayList (Node <E> head){
    Node <E> current = head;
    while (current.next != head){
        System.out.println(current.data);
        current = current.next;
        if (current.next == head){
            System.out.println(current.data + "\n");
        }
    }
}

public void delFirst (){
    if (head == null){
        System.out.println("list is empty");
    } else if (head.next == null){
        head = null;
    } else {
        Node <E> new_Head = head.next;
        head.next = null;
        head.prev = null;
        new_Head.prev = tail;
        tail.next = new_Head;
        head = new_Head;
    }
}



}
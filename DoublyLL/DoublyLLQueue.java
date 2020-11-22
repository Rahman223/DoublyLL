public class DoublyLLQueue <E> {
    Node <E> rear = null;
    Node <E> front = null;

    public static class Node <E> {
        E data;
        Node <E> next;
        Node <E> prev;

        public Node (E data){
            this.data= data;
            next = null;
            prev = null;
        }
    }

public void enQueue (E data){
    if (rear == null){
        rear = new Node<> (data);
        front = rear;
    }else {
        Node <E> new_Rear = new Node<> (data);
        new_Rear.prev = null;
        new_Rear.next = rear;
        rear.prev = new_Rear;
        rear = new_Rear;
    }
}

public E deQueue (){
    if (front == null){
        System.out.println("queue is empty");
        return null;
    } else if (front.prev == null){
        E data = front.data;
        front = null;
        return data;
    } else {
        E data = front.data;
        Node <E> new_front = front.prev;
        new_front.next = null;
        front.prev = null;
        front = new_front;
        return data;

    }
}

public void displayQueue (Node <E> rear){
    Node <E> current = rear;
    while (current != null){
        System.out.println(current.data);
        current = current.next;
    }
}

public E peek (){
   return front.data;
}

}
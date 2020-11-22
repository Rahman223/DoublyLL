class DoublyLL <E> {
    Node <E> head = null ;
    Node <E> tail = null;

    
public static class Node <E> {
    private E data; 
    Node <E> next;
    Node <E> prev; 
    
    Node (E data ){
        this.data= data;
        this.next = null;
        this.prev = null;
    }

    public E getData (){
        return this.data;
    }

    public void setData (E data){
        this.data = data;
    }
}

public void addFront (E data){

    if (this.head == null){
        head= new Node <>(data);
        this.tail = head;
    }else {
         Node <E> new_Node = new Node <> (data);
         new_Node.next= head;
         head.prev = new_Node;
         this.head = new_Node;
    }
}

public void delFront (){
    if ( head == null){
        System.out.println("List is empty");
    } else if (head.next ==null) { 
        head = null;
    }else {
        Node <E> new_Head = head.next;
        new_Head.prev = null;
        head.next = null;
        head = new_Head; 
    }
}

public void displayList (Node <E> head){
    if (head==null){
        System.out.println("List is empty");
    } else {
        Node <E> current = head; 
        while (current.next!=null){
            System.out.println(current.getData());
            current= current.next;
            if (current.next== null){
                System.out.println(current.getData()+ "\n");
            }
        }
    }
}

public void addLast (E data){
    if (tail == null){
        tail = new Node <> (data);
        head = tail;
    }else {
        Node <E> new_Node = new Node <> (data);
        tail.next = new_Node;
        new_Node.prev = tail;
        new_Node.next = null; 
        tail = new_Node;
    }
}

public void delLast (){
    if (tail == null){
        System.out.println("list is empty");
    }else if (tail.prev == null){
        tail = null;
    } else {
        Node <E> new_Tail = tail.prev; 
        tail.prev = null;
        new_Tail.next = null;
        tail = new_Tail;
    }
}

public void insertAfter (Node <E> prev_Node, E data){
    Node <E> new_Node = new Node<> (data);
    if (prev_Node == null){
        System.out.println("List is empty");
    }else if (prev_Node.next == null){
        new_Node.next= null;
        prev_Node.next = new_Node;
        new_Node.prev = prev_Node;
        tail = new_Node;
    }else {
    Node <E> next_Node = prev_Node.next;
    prev_Node.next = new_Node;
    new_Node.prev = prev_Node;
    new_Node.next = next_Node;
    new_Node.prev= new_Node;
}
}

public E peek (Node <E> head){
    return head.getData();
}

public Node<E> reverseList (){
    Node<E> next = null;
    Node<E> current = this.head;
    Node<E> prev = null;
    
    while (current != null){
        next = current.next;
        prev = current.prev;
        current.next = prev;
        current.prev = next;
        head =current;
        current = next;
    }
   
    return head ; 
}

    
}
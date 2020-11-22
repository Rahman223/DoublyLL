
public class DoublyLLTest {
    public static void main (String [] args){
        DoublyLL <Integer> list = new DoublyLL<>();
        list.addLast(25);
        list.addFront(5);
        list.addFront(10);
        list.addFront(15);
        list.addFront(20);
        list.displayList(list.head); 
        list.displayList(list.reverseList());
       // list.insertAfter(list.head.next.next, 50);
       // list.displayList(list.head);
       // list.displayList(list.delFront(list.head));
       // System.out.println(list.tail.getData());
       // list.addLast(25);
       //list.delLast();
      // list.displayList(list.head);
      //System.out.println(list.tail.getData()); */

    /*  DoublyLLCircular <Integer> circularList = new DoublyLLCircular<>();
      circularList.addFront(5);
      circularList.addFront(10);
      circularList.addFront(15);
      circularList.addFront(20);
      circularList.addFront(25);
      circularList.displayList(circularList.head);
      circularList.delFirst();
      circularList.displayList(circularList.head); */


      //String prefix = "^23";

     // System.out.println(evaluatePrefix(prefix)); 

    /* DoublyLL<Integer> stack = new DoublyLL<>();
     stack.addFront(15);
     stack.addFront(10);
     stack.addFront(5);
     stack.addFront(0);
     stack.displayList(stack.head);
     stack.delFront();
     stack.delFront();
     stack.delFront();
     stack.displayList(stack.head);
     System.out.println(stack.peek(stack.head)); */

    /* DoublyLLQueue <Integer> queue = new DoublyLLQueue<>();

     queue.enQueue(5);
     queue.enQueue(10);
     queue.enQueue(15);
     queue.enQueue(20);
     queue.enQueue(25);
     queue.displayQueue(queue.rear);
     System.out.println(queue.deQueue());
     queue.displayQueue(queue.rear);
     System.out.println();
     System.out.println(queue.peek());;

     

    }

    public static int evaluatePrefix ( String prefix){
      Stack <Integer> stack = new Stack<>();
      for (int i= prefix.length() -1; i >= 0 ; i-- ){
        char element = prefix.charAt(i);
        if (Character.isDigit(element)){
          int num = Character.getNumericValue(element);
          stack.push(num);
        } else {
          int op1 = stack.peek();
          stack.pop();
          int op2 = stack.peek();
          stack.pop();
          switch (prefix.charAt(i)){
            case '+':
            stack.push(op1+op2);
            break;
            case '-':
            stack.push(op1 - op2);
            break;
            case '*':
            stack.push(op1 * op2);
            break;
            case '/':
            stack.push(op1/op2);
            break;
            case '^':
            stack.push((int)Math.pow(op1, op2));
            break;
          }
          }
        }
        
        return stack.peek();*/
      }
      
    } 

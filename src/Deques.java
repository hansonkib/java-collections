import java.util.ArrayDeque;
import java.util.Deque;

public class Deques {
    public static void main(String[] args) {
        Deque<String> deq = new ArrayDeque<String>();
        deq.add("hanson");
        deq.add("Kibet");
        deq.add("Sang");
        deq.add("ronnoh");
        System.out.println("All the elements in the deque");
        for (String k : deq){
            System.out.println(k);
        }
        deq.offerFirst("rotich");// add element at the front of the que
        System.out.println("traversing after offerFirst");
        for (String l : deq){
            System.out.println(l);
        }
        deq.pollLast();//same as the poll i.e removes the last element in the deque
        System.out.println("trversing the deque after pollLast");
        for (String m : deq){
            System.out.println(m);
        }
        System.out.println("returning the head of the deque");
        System.out.println(deq.peek());
        System.out.println("returning the tail of the deque");
        System.out.println(deq.peekLast());

    }
}

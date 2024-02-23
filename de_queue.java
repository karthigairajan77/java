import java.util.*;
public class de_queue {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.offerFirst(4);
        dq.offerFirst(3);
        dq.offerFirst(2);
        dq.offerFirst(1);
        dq.offerLast(5);
        System.out.println("Offer");
        System.out.println(dq);

        System.out.println("Peek");
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());

        System.out.println(dq);

        System.out.println("Poll");
        System.out.println(dq.pollFirst());
        System.out.println(dq.pollLast());

        System.out.println(dq);
    }
}

package part2.deque;

import java.util.Deque;
import java.util.LinkedList;

public class Main {
    static void main() {
        Deque<String> q = new LinkedList<>();
        q.offerFirst("Petya");
        System.out.println(q.pollFirst());
    }
}

package part2.queue;

import java.util.*;

public class Main {
    static void main() {
        Queue<String> queue = new PriorityQueue<>();
        queue.offer("Petya");
        queue.offer("Olya");
        queue.offer("Tanya");

        while (!queue.isEmpty()) {
            String s = queue.poll();
            System.out.println(s);
        }
    }
}

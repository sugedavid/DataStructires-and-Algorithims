package HeapPriorityQueue;
import java.util.*;

public class LastStoneWeight {

public int lastStoneWeight(int[] stones) {
        
        // Insert all stones to heap
        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> b - a);

        for (int stone: stones) {
            heap.add(stone);
        }

        // While there is more than one stone left, we need to remove the two                  largest
        // and smash them together. If there is a resulting stone, we need to put               into
        // the heap.

        while (heap.size() > 1) {
            int stone1 = heap.remove();
            int stone2 = heap.remove();
            if (stone1 != stone2) {
                heap.add(stone1- stone2);
            }
        }

        // check if there is any stone left to return or not.
        return heap.isEmpty() ? 0: heap.remove();
        
    }
}

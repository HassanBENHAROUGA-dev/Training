import java.util.*;

public class LastStoneWeight {
    public int Solution(int[] stones) {
        PriorityQueue<Integer> priorityNumbers =
                new PriorityQueue<>(Collections.reverseOrder());

        for (int stone : stones) {
            priorityNumbers.add(stone);
        }
        while(priorityNumbers.size()>1){
            int firstHeaviest = priorityNumbers.poll();
            int secondHeaviest = priorityNumbers.poll();
            int result = firstHeaviest - secondHeaviest;
            priorityNumbers.add(result);
        }
        return priorityNumbers.isEmpty() ? 0 : priorityNumbers.poll();
    }

    public static void main(String[] args) {
        LastStoneWeight lastStoneWeight = new LastStoneWeight();
        int[] stones = {2,7,4,1,8,1};
        System.out.println(lastStoneWeight.Solution(stones));
    }
}


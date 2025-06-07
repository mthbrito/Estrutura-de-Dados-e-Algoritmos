package algorithms;

import java.util.List;

public class LinearSearch {

    public static int linearSearch(List<Integer> list, int target) {
        int steps = 0;
        for (int i = 0; i < list.size(); i++) {
            steps++;
            if (list.get(i) == target) {
                return i;
            }
        }
        System.out.println("Steps taken by linear search: " + steps);
        return -1;
    }

}

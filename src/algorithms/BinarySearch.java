package algorithms;

import java.util.List;

public class BinarySearch {

    public static int binarySearch(int[] list, int target) {
        int steps = 0;
        int left = 0;
        int right = list.length - 1;
        while (left <= right) {
            steps++;
            int mid = left + (right - left) / 2;
            if (list[mid] == target) {
                return mid;
            } else if (list[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("Steps taken by binary search: "  + steps);
        return -1;
    }
}

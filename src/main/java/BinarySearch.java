import java.util.Arrays;

public class BinarySearch {

    public int search(int[] sortedNumbers, int searchItem) {
        return search(sortedNumbers, searchItem, 0);
    }

    private int search(int[] sortedNumbers, int searchItem, int offset) {
        int length = sortedNumbers.length;
        if (length == 0) {
            return -1;
        }
        int middle = length / 2;
        if (sortedNumbers[middle] == searchItem) {
            return middle + offset;
        } else if (middle > 0) {
            if (sortedNumbers[middle] > searchItem) {
                int[] sub = Arrays.copyOfRange(sortedNumbers, 0, middle);
                return search(sub, searchItem, 0);
            } else {
                int[] sub = Arrays.copyOfRange(sortedNumbers, middle, length);
                return search(sub, searchItem, offset + middle);
            }
        }
        Arrays.binarySearch()
        return -1;
    }
}

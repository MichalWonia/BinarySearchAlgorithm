public class BinarySearchAlgorithm {

    public static void main(String[] args) {

        int[] sortedIntArray = {1, 13, 14, 67, 138, 149, 221};

        int searchedElement = 138;

        System.out.println("You are looking for element " + searchedElement + " in the array: ");
        for (Integer integer : sortedIntArray) {
            System.out.print(integer + " ");
        }
        System.out.println();

        int out_index = binarySearch(sortedIntArray, searchedElement);
        if (out_index != -1) {
            System.out.println("Element found under index: " + out_index);
        } else {
            System.out.println("Element not found");
        }
    }

    public static int binarySearch(int[] sortedIntArray, int searchedElement) {

        int indexOfFoundElement = -1; // -1 means that the element was not found
        int min_index = 0;
        int max_index = sortedIntArray.length - 1;
        int mid_index = (min_index + max_index) / 2;

        while (min_index <= max_index) {
            if (sortedIntArray[mid_index] == searchedElement) {
                return mid_index;
            } else if (sortedIntArray[mid_index] > searchedElement) {
                max_index = mid_index - 1;
            } else if (sortedIntArray[mid_index] < searchedElement) {
                min_index = mid_index + 1;
            }
            mid_index = (min_index + max_index) / 2;
        }
        return indexOfFoundElement;
    }
}

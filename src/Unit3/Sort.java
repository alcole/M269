package Unit3;
/**
 * Created by Alex on 16/05/2014.
 * activity 3.1 sorting
 */
public class Sort {

    public static void bubbleSort(int[] aList) {
        int noOfSwaps = 0;
        int noOfAssignments = 0;
        int comparisons = 0;
        //add timing component?
        for ( int passNum = aList.length - 1; passNum > 0; passNum--) {
            for (int i = 0; i < passNum; i++) {
                comparisons++;
                if (aList[i] > aList[i+1]) {
                    int temp = aList[i];
                    aList[i] = aList[i+1];
                    aList[i+1] = temp;
                    noOfSwaps++;
                    noOfAssignments = noOfAssignments + 3;
                }
            }
        }
        System.out.printf("%s %d %n", "comparisons: ", comparisons );
        System.out.printf("%s %d %n", "swaps: ", noOfSwaps );
        System.out.printf("%s %d %n", "assignments: ", noOfAssignments );
    }

    public static void shortBubbleSort(int[] aList) {
        int noOfSwaps = 0;
        int noOfAssignments = 0;
        int comparisons = 0;
        boolean hasSwapped = true;
        int passNum = aList.length - 1;
        //add timing component?
        while ( passNum > 0 && hasSwapped ) {
            hasSwapped = false;
            for (int i = 0; i < passNum; i++) {
                comparisons++;
                if (aList[i] > aList[i+1]) {
                    int temp = aList[i];
                    aList[i] = aList[i+1];
                    aList[i+1] = temp;
                    noOfSwaps++;
                    noOfAssignments = noOfAssignments + 3;
                    hasSwapped = true;
                }
            }
            passNum--;
        }
        System.out.printf("%s %d %n", "comparisons: ", comparisons );
        System.out.printf("%s %d %n", "swaps: ", noOfSwaps );
        System.out.printf("%s %d %n", "assignments: ", noOfAssignments );
    }

    public static void insertionSort(int[] aList) {
        int shifts = 0;
        int noOfAssignments = 0;
        int comparisons = 0;
        //add timing component?
        for (int i = 1; i < aList.length; i++) {
            int currentValue = aList[i];
            noOfAssignments++;
            int position = i;
            comparisons++;
            while (position > 0 && aList[position-1] > currentValue) {
                aList[position] = aList[position - 1];
                shifts++;
                noOfAssignments++;
                position--;
            }
            aList[position] = currentValue;
            noOfAssignments++;
        }
        System.out.printf("%s %d %n", "comparisons: ", comparisons );
        System.out.printf("%s %d %n", "shifts: ", shifts );
        System.out.printf("%s %d %n", "assignments: ", noOfAssignments );
    }

    public static void main(String[] args) {
        //create random array
        int[] list1 = new int[4000];
        for (int i = 0; i < 4000; i++) {
            list1[i] =  (int)(Math.random() * 4000 + 1);
        }
        int[] arrayCopy = new int[4000];
        System.arraycopy(list1, 0, arrayCopy, 0, 4000 );
        System.out.println("Sorting with bubbleSort");
        bubbleSort(arrayCopy);

        System.arraycopy(list1, 0, arrayCopy, 0, 4000 );
        System.out.println("Sorting with shortBubbleSort");
        shortBubbleSort(arrayCopy);

        System.arraycopy(list1, 0, arrayCopy, 0, 4000 );
        System.out.println("Sorting with insertionSort");
        insertionSort(arrayCopy);
    }
}

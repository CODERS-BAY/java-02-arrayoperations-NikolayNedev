package exercise.arraysTDD;

import java.util.Arrays;

/**
 * Utility class which performs various operations with integer arrays.
 */
public class ArrayOperations {
    private final int[] numbers;      // array that needs to be sorted.
    private final int[] unsorted;     // reference array which stays unsorted.

    public ArrayOperations(int[] numbers) {
        this.numbers = numbers;
        this.unsorted = numbers.clone();
    }

    /* **********************************************************
     *   Please implement the following methods.                 *
     *   It is intended that they are not static.                *
     * ***********************************************************/

    /**
     * Prints out the numbers array.
     */

    public void print() {
    	System.out.println(Arrays.toString(unsorted));
    
    }

    /**
     * @return the sorted numbers array.
     * @see <a href="sorting algortihms">http://faculty.cs.niu.edu/~hutchins/csci241/sorting.htm</a>
     */
    public int[] sort() {
    	int temp;
    	for (int i = 0; i < numbers.length; i++) {
    		for (int j = i + 1; j < numbers.length; j++) {
    			if(numbers[i] > numbers[j]) {
    				temp = numbers[i];
    				numbers[i] = numbers[j];
    				numbers[j] = temp;
    			}
			}
		}
    	return numbers;
    }

    /**
     * @return the sorted array in reverse order
     */
    public int[] revertSort() {
    	int temp;
    	for (int i = 0; i < numbers.length; i++) {
    		for (int j = i + 1; j < numbers.length; j++) {
    			if(numbers[i] < numbers[j]) {
    				temp = numbers[i];
    				numbers[i] = numbers[j];
    				numbers[j] = temp;
    			}
			}
		}
    	return numbers;
    }

    /**
     * @return the unsorted array in reverted order.
     */
    public int[] reverted() {
    	int[]arr = new int[unsorted.length];
    	int counter = 0;
    	for (int i = unsorted.length -1; i >= 0; i--) {
    		arr[counter] = unsorted[i];
    		counter++;
			
		}
        return arr;
    }

    /**
     * @param value which should be searched for.
     * @return true if the array contains the value, false otherwise.
     */
    public boolean contains(int value) {
    	
    	for (int i = 0; i < unsorted.length; i++) {
    		if(unsorted[i] == value) {
    			return true;
    		}
		}
        return false;
    }

    /**
     * @return the average value of all elements summed up.
     */
    public double average() {
    	double avg = 0;
    	for (int i = 0; i < numbers.length; i++) {
    		avg = avg + numbers[i];
		}
        return avg / numbers.length;
    }

    /**
     * @return the average value of all elements summed up, but without the highest and the lowest value.
     */
    public double trimmedMean() {
		int max = numbers[0];
		int min = numbers[0];
		double sum = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			sum += numbers[i];
			if (numbers[i] > max) {
				max = numbers[i];
			} else if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		return ((sum - max - min) / (numbers.length - 2)) ;
    }

    /**
     * @return the max value of the array. In the array [1,9,3] max would be 9.
     */
    public int maxValue() {
		int max = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		return max;
    }

    /**
     * @return the min value of the array. In the array [1,9,3] min would be 1.
     */
    public int minValue() {
		int min = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		return min;
    }

    /* **********************************************************
     *   Feel free to add as many private helper methods as      *
     *   you like.                                               *
     * ***********************************************************/

    private int someHelper(int[] tmp) {
        return 1;
    }
}

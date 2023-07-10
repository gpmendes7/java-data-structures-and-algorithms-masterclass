package array;

import java.util.Arrays;

public class Exercise {

    public static int[] middle(int[] array) {
        if(array.length <= 2) {
            return new int[0]; // Return an empty array if the input array has 2 or fewer elements
        }

        // Create a new arrayy with a size of the input array lenght minus 2
        int[] middleArray = new int[array.length - 2];

        // Copy the elements from the input array, excluding the first and last elements
        int index = 1;
        while(index < array.length-1) {
            middleArray[index - 1] = array[index];
            index++;
        }

        return middleArray;
    }

    public static int sumDiagonalElements(int[][] array) {
        int sum = 0;
        int numRows = array.length;

        for(int i = 0; i < numRows; i++) {
            sum += array[i][i];
        }

        return sum;
    }

    public static int[] findTopTwoScores(int[] array) {
        int firstHighest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for(int score: array) {
            if(score > firstHighest) {
                secondHighest = firstHighest;
                firstHighest = score;
            } else if(score > secondHighest && score < firstHighest) {
                secondHighest = score;
            }
        }

        return new int[] {firstHighest, secondHighest};
    }

    public static int findMissingNumberInArray(int[] array) {
        int n = array.length + 1;
        int expectedSum = (n * (n + 1)) / 2;
        int actualSum = 0;

        for(int number: array) {
            actualSum += number;
        }

        return expectedSum - actualSum;
    }

    public static int[] removeDuplicates(int[] array) {
        int n = array.length;
        int[] uniqueArray = new int[n];
        int index = 0;

        for(int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for(int j=i + 1; j < n; j++) {
                if(array[i] == array[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate) {
                uniqueArray[index++] = array[i];
            }
        }

        return Arrays.copyOf(uniqueArray, index);
    }

    public int removeDuplicatesFromSortedArray(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }

        int i = 0;

        for(int j = 1; j < nums.length; j++){
            if(nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i+1;
    }

    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price: prices) {
            if(price < minPrice) {
                minPrice = price;
            } else if(price - minPrice > maxProfit) {
                maxProfit = price = minPrice;
            }
        }

        return maxProfit;
    }

    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }

        throw new IllegalArgumentException("No two sum soluction found");
    }

}

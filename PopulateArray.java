import java.util.*;

public class PopulateArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int max;
        int min;
        int arraySize;
        int minCount = 0;
        int maxCount = 0;
        String minLocations = " ";
        String maxLocations = " ";

        System.out.println("How many random integers should be generated?");
        arraySize = Integer.parseInt(scan.nextLine());
        int[] randArray = new int[arraySize];
        System.out.println();

        System.out.println("What is the smallest number allowed in the array?");
        min = Integer.parseInt(scan.nextLine());
        System.out.println();

        System.out.println("What is the largest number allowed in the array?");
        max = Integer.parseInt(scan.nextLine());
        System.out.println();
        scan.close();

        for (int i = 0; i < arraySize; i++) {
            int randomNumber = (int) (Math.random() * (max - min + 1) + min);
            randArray[i] = randomNumber;
        }

        System.out.print("{");
        for (int i = 0; i < arraySize; i++) {
            System.out.print(randArray[i]);
            System.out.print(" ");
        }
        System.out.print("}");
        System.out.println();

        for (int i = 0; i < randArray.length; i++) {
            if (randArray[i] == min) {
                minCount++;
                minLocations = minLocations + i + ",";
            }
        }

        for (int i = 0; i < randArray.length; i++) {
            if (randArray[i] == max) {
                maxCount++;
                maxLocations = maxLocations + i + ",";
            }
        }

        System.out.println("The minimum value in this array is: " + min);
        System.out.println("Number of times the value occurs:");
        System.out.println(minCount);
        System.out.println();
        System.out.println("Located at index: " + minLocations);

        System.out.println("The maximum value in this array is: " + max);
        System.out.println("Number of times the value occurs:");
        System.out.println(maxCount);
        System.out.println();
        System.out.println("Located at index: " + maxLocations);
    }
}
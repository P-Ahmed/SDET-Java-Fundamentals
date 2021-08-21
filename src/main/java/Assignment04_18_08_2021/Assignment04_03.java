/*3. Write a program to show the duplicates values . Given array is: {10,5,2,3,2,7,7,15,10}
Output: 2, 7, 10
*/

package Assignment04_18_08_2021;

import java.util.Arrays;

public class Assignment04_03 {
    public static void findingDuplicates(int[] array) {
        int duplicateNumber = 0;

        System.out.print("\nOutput: ");
        for (int i = 0; i < array.length; i++) {
            int counter = 0;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    counter++;
                    duplicateNumber = array[j];
                } else {
                    continue;
                }
            }
            if (counter == 1) {
                System.out.print(duplicateNumber + " ");
            } else if (counter >= 2) {
                i = counter + 1;
                System.out.print(duplicateNumber + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {10, 5, 2, 3, 2, 7, 7, 15, 10};
        Arrays.sort(array);

        findingDuplicates(array);

    }
}

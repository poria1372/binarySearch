import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom generator = new SecureRandom();
        int[] data = {4,5,6,7,8,9,10,11,12,13};
        System.out.printf("%s%n%n", Arrays.toString(data));
        System.out.printf("please enter a number  :");
        int searchInt = input.nextInt();
        while (searchInt != -1) {

            int location = BinarySearchTest.binarySearch(data, searchInt);
            if (location == -1) {
                System.out.printf("%d was not found %n%n", searchInt);
            } else {
                System.out.printf("%d was fount in position %d%n%n", searchInt, location);
            }
            System.out.printf("enter -1 quit");
            searchInt = input.nextInt();
        }
    }
}

import java.util.Scanner;

public class Array {

    public static void main(String[] args){

        final int NUM_ARRAY = 3;
        int[] array = new int[NUM_ARRAY];
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the hours worked by "+
                        NUM_ARRAY + " employees.");

        for(int index = 0; index < NUM_ARRAY; index++)
        {
            System.out.print("Employee " + (index + 1) + ": ");
            array[index] = keyboard.nextInt();
        }

        System.out.println("The array you entered is: ");
        for(int index = 0; index < NUM_ARRAY; index++)
        {
            System.out.println(array[index]);
        }
    }
}

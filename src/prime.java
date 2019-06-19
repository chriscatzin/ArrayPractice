import java.util.Scanner;

public class prime {

    public static void main(String[] args){

        final int ARRAY_SIZE = 4;

        int[] numbers = new int[ARRAY_SIZE];

        getValue(numbers);

        System.out.println("Here are the " +
                "numbers that you entered.");

        showArray(numbers);
    }

    public static void getValue(int[] array){

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the serier of " +
                    array.length + " numbers.");

        for(int index = 0; index < array.length; index++){
            System.out.print("Enter the number " +
                    (index + 1) + ": " );
            array[index] = keyboard.nextInt();
        }
    }

    public static void showArray(int[] array){

        for(int index = 0; index < array.length; index++){
            System.out.print(array[index] + " ");
        }
    }
}


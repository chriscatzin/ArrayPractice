public class Array {

    public static void main(String[] args) {

        final int NUMBER = 50;
        for (int index = 1; index <= 50; index++) {
            if (index % 3 == 0) {
                System.out.println("Fizz");
            } else if (index % 5 == 0) {
                System.out.println("Buzz");
            } else if (index % 5 == 0 && index % 3 == 0) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(index);
            }


        }
    }
}



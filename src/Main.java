public class Main {

    public static void main(String[] args) {

        // for loop for comparison
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        System.out.println();

        // while loop
        int j = 1;
        while (j <= 5) {
            System.out.println(j);
            j++;
        }

        System.out.println();

        int k = 1;
        while (true) {
            if (k > 5) {
                break;
            }
            System.out.println(k);
            k++;
        }

        System.out.println();


        // do while loop
        int m = 1;
        boolean isReady = false;
        do {
            if (m > 5) {
                break;
            }
            System.out.println(m);
            m++;
            isReady = (m > 0);
        } while (isReady);

        System.out.println();



        // while loop
        int number = 0;
        while (number < 50) {
            number += 5;
            if (number % 25 == 0) {
                continue;
            }
            System.out.print(number + "_");
        }
    }
}
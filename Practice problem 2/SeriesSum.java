public class SeriesSum {
    public static void main(String[] args) {

        
        int evenSum = 0, oddSum = 0;

        System.out.println("Using For Loop:");

        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
            evenSum += i;
        }
        System.out.println("\nEven Sum = " + evenSum);

        for (int i = 1; i <= 19; i += 2) {
            System.out.print(i + " ");
            oddSum += i;
        }
        System.out.println("\nOdd Sum = " + oddSum);

    
        evenSum = 0;
        oddSum = 0;

        System.out.println("\n\nUsing While Loop:");

        int i = 2;
        while (i <= 20) {
            System.out.print(i + " ");
            evenSum += i;
            i += 2;
        }
        System.out.println("\nEven Sum = " + evenSum);

        i = 1;
        while (i <= 19) {
            System.out.print(i + " ");
            oddSum += i;
            i += 2;
        }
        System.out.println("\nOdd Sum = " + oddSum);

        
        evenSum = 0;
        oddSum = 0;

        System.out.println("\n\nUsing Do-While Loop:");

        i = 2;
        do {
            System.out.print(i + " ");
            evenSum += i;
            i += 2;
        } while (i <= 20);
        System.out.println("\nEven Sum = " + evenSum);

        i = 1;
        do {
            System.out.print(i + " ");
            oddSum += i;
            i += 2;
        } while (i <= 19);
        System.out.println("\nOdd Sum = " + oddSum);
    }
}
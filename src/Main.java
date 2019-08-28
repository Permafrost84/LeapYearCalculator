public class Main {

    public static void main(String[] args) {

        int myYear = 1800;  // for testing purpose
        System.out.println("It is " + LeapYear.isLeapYear(myYear) + " that " + myYear + " is a leap year!");

        /* Testing values:

        Leap Years:
            just divisible by 4
                1804
                2016
                2020
                2024
            divisible by 4 and 400
                1200
                1600
                2000
                2400

         Common Years:
            not divisible by 4
                2100
                2200
            divisible by 4, but also by 100, but not by 400
                ...
         */

    }
}

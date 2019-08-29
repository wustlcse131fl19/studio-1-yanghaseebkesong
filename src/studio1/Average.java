package studio1;

import support.cse131.ArgsProcessor;

public class Average {
    public static void main(String[] args)
    {
        ArgsProcessor ap = new ArgsProcessor(args);
        int n1 = ap.nextInt("Enter first number: ");
        int n2 = ap.nextInt("Enter second number: ");

        double average = (double)(n1 + n2)/2;

        System.out.println(average);

    }
}

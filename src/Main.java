//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {

    public static double calculateLineLength(double x1, double y1, double x2, double y2){
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Line Comparison Computation Program on Master Branch");

        System.out.println("Enter Co-ordinated for this First Line");
        System.out.println("Enter x1 : ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        System.out.println("Enter co-ordinates of second line ");
        System.out.println("Enter x3 : ");
        double x3 = sc.nextDouble();
        System.out.print("Enter y3: ");
        double y3 = sc.nextDouble();
        System.out.print("Enter x4: ");
        double x4 = sc.nextDouble();
        System.out.print("Enter y4: ");
        double y4 = sc.nextDouble();

        double length1 = calculateLineLength(x1, y1, x2, y2);
        double length2 = calculateLineLength(x3, y3, x4, y4);


        System.out.printf("The length of the line between points (%.2f, %.2f) and (%.2f, %.2f) is: %.2f\n",
                x1, y1, x2, y2, length1);

        System.out.printf("The length of the line between points (%.2f, %.2f) and (%.2f, %.2f) is: %.2f\n",
                x3, y3, x4, y4, length2);


        if(Double.valueOf(length1).equals(Double.valueOf(length2))){
            System.out.println("The two lines are equal.");
        } else {
            System.out.println("The two lines are not equal.");
        }

        sc.close();
    }
}
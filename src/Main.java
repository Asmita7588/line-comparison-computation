//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*
As a fan of geometry, I want to
model a line based on a point
consisting of (x, y) co

-ordinates
using the Cartesian system,
So that I can calculate its
length
.

- A Length as 2 Points (x1, y1) and (x2, y2) - Length of a Line = sqrt( (x2 - x1) ^ 2 + (y2

- y1) ^ 2)
 */

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

        double length = calculateLineLength(x1, y1, x2, y2);

        System.out.printf("The length of the line between points (%.2f, %.2f) and (%.2f, %.2f) is: %.2f\n",
                x1, y1, x2, y2, length);

    }
}
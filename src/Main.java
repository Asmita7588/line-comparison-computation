//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

 class Point{
   private double x;
     private double  y;

   public Point(double x,double y){
       this.x = x;
       this.y= y;
   }

   public double getY(){
       return y;
   }

     public double getX(){
         return x;
     }

}

class Line{
     private Point startPoint;
     private Point endPoint;

     public Line(Point startPoint, Point endPoint){
         this.startPoint = startPoint;
         this.endPoint = endPoint;
     }

    public double calculateLength() {
        return Math.sqrt(Math.pow((endPoint.getX() - startPoint.getX()), 2) +
                Math.pow((endPoint.getY() - startPoint.getY()), 2));
    }

    // Method to check equality of two lines using the equals() method
    public boolean isEqual(Line otherLine) {
        return Double.valueOf(this.calculateLength()).equals(Double.valueOf(otherLine.calculateLength()));
    }

    // Method to compare two lines using compareTo()
    public int compareTo(Line otherLine) {
        return Double.valueOf(this.calculateLength()).compareTo(Double.valueOf(otherLine.calculateLength()));
    }

}

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

        // Create Points for both lines
        Point startPoint1 = new Point(x1, y1);
        Point endPoint1 = new Point(x2, y2);
        Point startPoint2 = new Point(x3, y3);
        Point endPoint2 = new Point(x4, y4);

        // Create Lines using Points
        Line line1 = new Line(startPoint1, endPoint1);
        Line line2 = new Line(startPoint2, endPoint2);

        // Calculate lengths of both lines
        double len1 = line1.calculateLength();
        double len2 = line2.calculateLength();

        System.out.println("Length of the first line: " + len1);
        System.out.println("Length of the second line: " + len2);


        double length1 = calculateLineLength(x1, y1, x2, y2);
        double length2 = calculateLineLength(x3, y3, x4, y4);


        System.out.printf("The length of the line between points (%.2f, %.2f) and (%.2f, %.2f) is: %.2f\n",
                x1, y1, x2, y2, length1);

        System.out.printf("The length of the line between points (%.2f, %.2f) and (%.2f, %.2f) is: %.2f\n",
                x3, y3, x4, y4, length2);


        if(line1.equals(line2)){
            System.out.println("The two lines are equal.");
        } else {
            System.out.println("The two lines are not equal.");
        }

        int compareResult = line1.compareTo(line2);

        if(compareResult == 0){
           System.out.println("The both lines are equal");
        }else if (compareResult > 0) {
            System.out.println("The first line is longer than the second line.");
        } else {
            System.out.println("The first line is shorter than the second line.");
        }
        sc.close();
    }
}
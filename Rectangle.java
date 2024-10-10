import java.util.Scanner;

// Class to represent a Rectangle
class Rectangle
{
    private double length;
    private double width;

    // Constructor for square (when length and width are the same)
    public Rectangle(double side)
    {
        this.length = side;
        this.width = side;
    }

    // Constructor for rectangle (when length and width are different)
    public Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }

    // Override the toString() method to print rectangle dimensions
    @Override
    public String toString()
    {
        return "rectangle with length " + length + ", width " + width;
    }
}

public class Main
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Input for first rectangle (square)
        System.out.println("Type a number for length and width:");
        double side = scanner.nextDouble();
        
        // Input for second rectangle (different length and width)
        System.out.println("Type a length:");
        double length = scanner.nextDouble();
        System.out.println("Type a width:");
        double width = scanner.nextDouble();
        
        // Creating rectangles
        Rectangle square = new Rectangle(side);
        Rectangle rectangle = new Rectangle(length, width);
        
        // Print the results using the toString() method
        System.out.println(square);
        System.out.println(rectangle);
    }
}
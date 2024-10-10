import java.util.Scanner;

// Class to represent a regular polygon (equilateral triangle or square)
class RegularPolygon
{
    private int sides;
    private double sideLength;

    // Constructor for polygons (such as equilateral triangle and square)
    public RegularPolygon(int sides, double sideLength)
    {
        this.sides = sides;
        this.sideLength = sideLength;
    }

    // Override toString method to print polygon description
    @Override
    public String toString()
    {
        if (sides == 3) {
            return "equilateral triangle with side length " + sideLength;
        } else if (sides == 4) {
            return "square with side length " + sideLength;
        } else {
            return "polygon with " + sides + " sides, each of length " + sideLength;
        }
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Get side length input from user
        System.out.println("Type a side length:");
        double sideLength = scanner.nextDouble();

        // Create equilateral triangle and square
        RegularPolygon equilateralTriangle = new RegularPolygon(3, sideLength);
        RegularPolygon square = new RegularPolygon(4, sideLength);

        // Print the descriptions using the toString method
        System.out.println(equilateralTriangle);
        System.out.println(square);
    }
}
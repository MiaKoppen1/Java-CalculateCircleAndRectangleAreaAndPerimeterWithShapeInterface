// rectangle subclass implementing shape

public class Rectangle implements Shape
    {
    private double width;
    private double length;

// constructor for width and length
    public Rectangle(double width, double length)//constructor
        {
        this.length = length;
        this.width = width;
        }

// implemented the getArea method
    public double getArea()//area
        {
        return length * width;
        }

// implemented the getPerimeter method
    public double getPerimeter()//perimeter
        {
        return 2 * (length + width);
        }
    }

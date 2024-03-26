// circle subclass implementing shape

public class Circle implements Shape
    {
    private double radius;

// constructor for the radius
    public Circle(double radius) //constructor
        {
        this.radius = radius;
        }
    
// implemented the getArea method
    public double getArea()
        {
        return Math.PI * radius * radius;// a circle's area is PIr^2
        }
// implemented the getPerimeter method
    public double getPerimeter()
        {
        return 2 * Math.PI * radius;// a circle's perimeter is 2PIr
        }
    }

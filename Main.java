// main

public class Main 
    {
    public static void main(String[] args) 
        {
// created instances
        Shape rectangle = new Rectangle(5, 7);
        Shape circle = new Circle(12);

// message before printing out the results
        System.out.println("Calculating Results.......");
        System.out.println("  ");// blank line

// circle's results
        System.out.println("Circle:");
        System.out.println("Area:" + circle.getArea());
        System.out.println("Perimeter:" + circle.getPerimeter());

        System.out.println("  ");// blank line

// rectangle's results
        System.out.println("Rectangle:");
        System.out.println("Area:" + rectangle.getArea());
        System.out.println("Perimeter:" + rectangle.getPerimeter());
        }
    }

public class Prob5 {

    public static void main(String[] args) {
    
        double length = 36.0;
        double breadth = 36.0;
        double radius = 36.0;


        double rectangleArea = length * breadth;
        double rectanglePerimeter = 2 * (length + breadth);

   
        double circleArea = Math.PI * radius * radius;
        double circleCircumference = 2 * Math.PI * radius;

      
        System.out.println("Rectangle:");
        System.out.println("Area: " + rectangleArea);
        System.out.println("Perimeter: " + rectanglePerimeter);

        System.out.println("Circle:");
        System.out.println("Area: " + circleArea);
        System.out.println("Circumference: " + circleCircumference);
    }
}

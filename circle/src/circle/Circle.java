package circle;

public class Circle
{
   private final double pi = 3.14159;
   private double radius; //The circle's radius

   public Circle()
    {
       radius = 0.0;
   }

   public Circle(double r)
    {
       radius = r;
   }

   public void setRadius(double r) 
   {
       radius = r;
   }

   public double getRadius()
    {
       return radius;
   }

   public double getArea()
    {
       return pi * radius * radius;
   }

   public double getDiameter()
    {
       return radius * 2;
   }

   public double getCircumference()
    {
       return 2 * pi * radius;
   }
}

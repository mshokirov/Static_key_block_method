

public class MathFunctions {

    static double pi = 3.14159265359;
    static double e = 2.71828182846;


    public MathFunctions(double pi, double e) {
        MathFunctions.pi = pi;
        MathFunctions.e = e;

    }

   static public double CircleArea(double radius) {
        double area = pi* radius * radius;
        return area;
    }

    static public double Square(double a) {
        return Math.pow(e, a) ;
    }

    static public double Triangle(double a, double b, double c) {
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));

    }




}

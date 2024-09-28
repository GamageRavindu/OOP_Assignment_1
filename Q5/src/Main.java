
class Circle {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double computeArea(){
        return Math.PI * radius * radius;
    }

    public double computeCircumference(){
        return 2 * Math.PI * radius;
    }


}

public class Main {
    public static void main(String[] args) {
        double ri = 4.0;
        double ro = 5.0;

        Circle innerCircle = new Circle(ri);
        Circle outerCircle = new Circle(ro);

        double areaOfTheCircularRegion = outerCircle.computeArea() - innerCircle.computeArea();

        System.out.println("The area of the circular region is: " + areaOfTheCircularRegion);

    }
}
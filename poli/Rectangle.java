/**
 * Rectangle
 */
package poli;

public class Rectangle extends Figure {

    private double base;
    private double height;

    public Rectangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void calculateArea() {
        // TODO Auto-generated method stub
        double area = base * height;
        System.out.println("El área del Rectangle es: " + area + " PI=" + super.PI);
    }

}
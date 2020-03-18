/**
 * Triangle
 */
package poli;

public class Triangle extends Figure {

    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void calculateArea() {
        // TODO Auto-generated method stub
        double area = base * height / 2;
        System.out.println("El área del Triangle es: " + area);
    }

}
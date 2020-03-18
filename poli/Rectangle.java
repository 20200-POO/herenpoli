/**
 * Rectangle
 */
package poli;

public class Rectangle implements Figure {

    private double base;
    private double height;

    @Override
    public void calculateArea() {
        // TODO Auto-generated method stub
        super.area = base * height;
        System.out.println("El área del Rectangle es: " + super.area);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

}
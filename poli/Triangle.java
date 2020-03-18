/**
 * Triangle
 */
package poli;

public class Triangle implements Figure {

    private double base;
    private double height;

    @Override
    public void calculateArea() {
        // TODO Auto-generated method stub
        super.area = base * height/2;
        System.out.println("El área del Triangle es: " + super.area);
    }
    
}
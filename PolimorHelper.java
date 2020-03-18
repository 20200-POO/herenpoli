
/**
 * PolimorHelper
 */
import poli.Figure;
import poli.Rectangle;
import poli.Triangle;

public class PolimorHelper {
    public static void main(String[] args) {
        Figure f= null;

        int OPC=1;
        if( OPC == 1 ){
            f= new Rectangle(2,10);
        }
        if( OPC == 2 ){
            f= new Triangle(2,10);
       
        }
        f.calculateArea();

    }

}
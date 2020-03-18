
/**
 * HerenciaHelper
 */
import heren.Person;
import heren.Customer;
import heren.User;

public class HerenciaHelper {

    public static void main(String[] args) {

        Customer c = new Customer();
        c.add();

        User u = new User();
        u.add();

        Person p = new Person();
        p.eat();
    }
}
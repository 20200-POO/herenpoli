/**
 * Person
 */
package heren;

public class Person {

    private String name;

    public void eat() {
        System.out.println("Comer en Person");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
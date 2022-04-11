public class Pen {
    /**
     * Instance Variables
     */
    private String name;
    private int id;
    /**
     * Constructor
     */
    Pen(String inputName){
        this.name = inputName;
        System.out.println("The New Pen Name is " + this.name);
    }
    /**
     * 
     * Overloading Constructors
     */

    Pen(int inputId){
        this.id = inputId;
        System.out.println("The New Pen ID is " + this.id);
    }
    
}

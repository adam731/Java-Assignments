/**
 * Method class for Assignment #6, CP2280
 *
 * @author David Cantwell <david.cantwell@cna.nl.ca>
 * @version November 22, 2021
 */
public class Method {

    // class variable to hold method name
    private String name;

    // class variable to hold method variables
    private String[][] variables;

    /**
     * Class constructor
     *
     * @param name Name of method
     */
    public Method(String name) {
        setName(name);
    }

    /**
     * Class constructor
     *
     * @param name Name of method
     * @param variables Variables associated with method
     */
    public Method(String name, String[][] variables) {
        setName(name);
        setVariables(variables);
    }

    /**
     * Accessor method for name - returns the name of the method
     *
     * @return Name of method
     */
    public String getName() {
        return name;
    }

    /**
     * Mutator method for name - accepts the name as a parameter
     *
     * @param name Name of method
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Accessor method for variables - returns the variables associated with
     * the method
     *
     * @return Variables array
     */
    public String[][] getVariables() {
        return variables;
    }

    /**
     * Mutator method for variables - accepts a two-dimensional array to store
     * as the method's variables.
     *
     * @param variables Method variables
     */
    public void setVariables(String[][] variables) {
        this.variables = variables;
    }

    /**
     * This method will output the method information including the name
     * and associated variables.
     */
    public void displayInfo() {
        System.out.println("Method name: " + getName());
        if (getVariables() != null){
            System.out.println("Variables:");
            for (String[] pair : getVariables()) {
                System.out.printf("     - %s : %s%n", pair[0], pair[1]);
            }
            System.out.println();
        }
        else{
            System.out.println("There are no variables");
        }
        System.out.println();

    }
}

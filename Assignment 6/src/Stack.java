/** Represents an StackMethod Assignement.
 * @author Adam Elliott
 * @version November 30th, 2021
 */

import java.util.ArrayList;

public class Stack {
    private String name;
    private ArrayList<Method> methods = new ArrayList<Method>();
    private int size;

    /**
     * Class SetName
     * @param name Sets Name Of the Method
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Class GetName
     * @return Gets the name of the Method
     */
    public String getName() {
        return name;
    }

    /**
     * Class SetSize
     * @param size Gets the set size of the Method
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * Class GetSize
     * @return Gets the size of the stack associated with the object
     */
    public int getSize() {
        return size;
    }

    /**
     * Class GetMethod
     * @return Gets the method of the arrayList
     */
    public ArrayList<Method> getMethods() {
        return methods;
    }

    /**
     * Class 
     * @param method Pushes the user made objects into an ArrayList
     */

    public void push(Method method) {
        try {
            if (this.getSize() > this.methods.size()) {
                methods.add(method);
            } else {
                throw new ArrayIndexOutOfBoundsException();
            }
        } catch (Exception e) {
            System.out.printf("%s%n%n", e);
        }
    }


    public void pop() {
        Method test = methods.get(methods.size() - 1);
        methods.remove(test);
    }

    public void showStack() {
        int counter = 0;
        for (Method display : methods) {
            System.out.println("Stack Position " + counter);
            display.displayInfo();
            counter++;
        }
    }


    public Stack(String name, int size) {
        this.name = name;
        this.size = size;
    }

    }

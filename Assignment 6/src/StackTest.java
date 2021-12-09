/** Represents an MethodTest Assignement.
 * @author Adam Elliott
 * @version November 30th, 2021
 */
public class StackTest {
    public static void main(String[] args) {
        // first sample variables
        String[][] myVariables = {
                {"lastName", "Elliott"},
                {"firstName", "Adam"}
        };

        String[][] myVariables2 = {
                {"this", "test"},
                {"water", "lava"}
        };

        String[][] myVariables3 = {
                {"favColour", "Red"},
                {"height", "1'2"}
        };


        Method m1 = new Method("myMethod", myVariables);
        Method m2 = new Method("mySecondMethod",myVariables2);
        Method m3 = new Method("myThirdMethod",myVariables3);
        Stack myStack = new Stack("MyFirstMethod",3);
        myStack.push(m1);
        myStack.push(m2);
        myStack.push(m3);
        myStack.showStack();
        myStack.pop();
        myStack.showStack();
    }
}
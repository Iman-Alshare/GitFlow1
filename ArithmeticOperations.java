package GitFlow;

public class ArithmeticOperations {
    public static Object pow(Object num1, Object num2) {
        /*
        Cases not handled:
            1. It will accept char if it's a number
             however, it will raise exception if it's an alphabetic char
            2. Raise exception on string
            3. we can go further and take care of the returned type based on the input
         */
        Object div;
        div = Math.pow(Double.parseDouble(num1.toString()),Double.parseDouble(num2.toString()));
        if (num1 instanceof Integer && num2 instanceof Integer )
            return Double.valueOf(div.toString()).intValue();
        return Double.valueOf(div.toString());
    }
}

public class App {
    /**
     * Method that adds 2 numbers (int)
     */
    private static int sum2Numbers(int num1, int num2){
        return num1 + num2;
    }

    /**
     * Method that adds 3 numbers (int)
     * 
     */
    private static int sum3Numbers(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    /**
     * 
     * Overloading methods
     */

    /**
     * 
     * Compute sum of two numbers (int)
     */
    private static int computeSum(int num1, int num2){
        return num1 + num2;
    }

    /**
     * 
     * Compute sum of three numbers (int)
     */
    private static int computeSum(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }


    public static void main(String[] args) throws Exception {
        System.out.println("Overloading....");
        /**
         * Invoke Methods
         */
        System.out.println("The sum of 25 and 50 is " + App.sum2Numbers(25, 50));
        System.out.println("The sum of 25 and 50 and 100 is " + App.sum3Numbers(25, 50, 100));
        System.out.println("==================");
        /**
         * Invoking methods by overloading
         */
        System.out.println("The sum of 25 and 50 is " + App.computeSum(25, 50));
        System.out.println("The sum of 25 and 50 and 100 is " + App.computeSum(25, 50, 100));

        /**
         * Invoke Constructor from Pen Class, and Overload it
         */
        System.out.println("----------------------");
        Pen p1 = new Pen("G-Tech Pilot");
        Pen p2 = new Pen("G-Tech Pilot 0.04");
        Pen p3 = new Pen(100);
    }
}

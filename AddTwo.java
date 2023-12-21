class AddTwo {
    public static void main(String args[]) {

        // Parse command-line arguments
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        // Print the result
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }
}
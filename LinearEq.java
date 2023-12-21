class LinearEq {
    public static void main(String args[]) {

        // Parse and declare command-line arguments
        double x = 0.0;
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        // Solve the linear equation
        x = (c-b)/a;

        // Print the equation and the solution
        System.out.println(a + " * " + "x " + "+ " + b + " = " + c);
        System.out.println("X" + " = " + x);
    }
}
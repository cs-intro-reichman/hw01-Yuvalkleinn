class AddTwo {
    public static void main(String [] args) {

        // Parse command-line arguments
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        // Print the result
        System.out.println(x + " + " + y + " = " + (x + y));
    }
}
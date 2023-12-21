class Triangle {
    public static void main(String [] args) {
        
        // parse command-line args
        int side1 = Integer.parseInt(args[0]);
        int side2 = Integer.parseInt(args[1]);
        int side3 = Integer.parseInt(args[2]);

        //check if sides can be form a triangle
        boolean check_if_triangle = (side1 + side2 > side3) && (side2 + side3 > side1) && (side3 + side1 > side2);

        // print the sides and the result
        System.out.println (side1 + ", " + side2 + ", " + side3 + " " + check_if_triangle);
    }
}
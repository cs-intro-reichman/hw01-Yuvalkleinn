class Coins {
    public static void main(String [] args) {

        // Parse command-line argument
        int coins = Integer.parseInt(args[0]);

        // Calculate the number of quarters and remaining cents
        int quarters = coins / 25;
        int cent = coins % 25;

        // Print the result
        System.out.println("Use " + quarters + " quarters and " + cent + " cents");
    }
}
import java.util.Random;

class GenThree {
    public static void main(String [] args) {

        // Parse command-line args
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        // Generate three random numbers in the range [a, b) and find the minimal number
        Random random = new Random();
        int random1 = random.nextInt(Math.max(num1, num2) - Math.min(num1, num2)) + Math.min(num1, num2);
        int random2 = random.nextInt(Math.max(num1, num2) - Math.min(num1, num2)) + Math.min(num1, num2);
        int random3 = random.nextInt(Math.max(num1, num2) - Math.min(num1, num2)) + Math.min(num1, num2);
        int min_num = Math.min(Math.min(random1, random2), random3);

        // Print the generated random numbers and the minimal number
        System.out.println(random1 + "\n" + random2 + "\n" + random3);
        System.out.println("The minimal generated number was " + min_num);
    }
}

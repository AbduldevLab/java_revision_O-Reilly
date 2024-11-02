public class Main {
    public static void main(String[] args) {
        int height = 5; // Height of the pyramid

        for (int i = 0; i < height; i++) {
            System.out.print(i+1 + ": ");
            for (int j = 0; j < height - i - 1; j++) {
                System.out.print(" ");
            }
            // Print the message
            for (int k = 0; k <= i; k++) {
                System.out.print("Welcome to 'abduldevlab' world! - ");
            }
            // Move to the next line
            System.out.println();
        }
    }
}
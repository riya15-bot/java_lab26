public class Main {
    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int upper = 0, lower = 0, digits = 0, spaces = 0;

        // Loop through each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                upper++;
            } 
            else if (ch >= 'a' && ch <= 'z') {
                lower++;
            } 
            else if (ch >= '0' && ch <= '9') {
                digits++;
            } 
            else if (ch == ' ') {
                spaces++;
            }
        }

        // Display results
        System.out.println("\nStatistics:");
        System.out.println("Uppercase characters: " + upper);
        System.out.println("Lowercase characters: " + lower);
        System.out.println("Digits: " + digits);
        System.out.println("Spaces: " + spaces);
    }
}

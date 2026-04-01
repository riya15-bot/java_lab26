import java.util.Scanner;
public class ReplaceCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String result = str.replace('d','f');
        System.out.println("String after replacement: " + result); 
        sc.close();
    }
}

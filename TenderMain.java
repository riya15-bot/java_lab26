import java.util.Scanner;

class Tender {
    String companyName;
    double cost;

    void input(Scanner sc) {
        System.out.print("Enter company name: ");
        companyName = sc.next();
        System.out.print("Enter cost: ");
        cost = sc.nextDouble();
    }
}

public class TenderMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Tender[] t = new Tender[5];

        // Input
        for (int i = 0; i < 5; i++) {
            System.out.println("\nEnter details for company " + (i + 1));
            t[i] = new Tender();
            t[i].input(sc);
        }

        // Find minimum cost
        double minCost = t[0].cost;
        String minCompany = t[0].companyName;

        for (int i = 1; i < 5; i++) {
            if (t[i].cost < minCost) {
                minCost = t[i].cost;
                minCompany = t[i].companyName;
            }
        }

        // Output
        System.out.println("\nCompany with Minimum Cost:");
        System.out.println("Company Name: " + minCompany);
        System.out.println("Cost: " + minCost);
    }
}
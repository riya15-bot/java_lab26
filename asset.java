// Abstract class
abstract class Asset {
    String descriptor;
    String date;
    double current_value;

    // Constructor
    Asset(String d, String dt, double val) {
        descriptor = d;
        date = dt;
        current_value = val;
    }

    // Abstract method
    abstract void displayDetails();
}

// Stock class
class Stock extends Asset {
    int num_shares;
    double share_price;

    Stock(String d, String dt, double val, int n, double sp) {
        super(d, dt, val);
        num_shares = n;
        share_price = sp;
    }

    void displayDetails() {
        System.out.println("\n--- Stock Details ---");
        System.out.println("Descriptor: " + descriptor);
        System.out.println("Date: " + date);
        System.out.println("Current Value: " + current_value);
        System.out.println("Shares: " + num_shares);
        System.out.println("Share Price: " + share_price);
    }
}

// Bond class
class Bond extends Asset {
    double interest_rate;

    Bond(String d, String dt, double val, double rate) {
        super(d, dt, val);
        interest_rate = rate;
    }

    void displayDetails() {
        System.out.println("\n--- Bond Details ---");
        System.out.println("Descriptor: " + descriptor);
        System.out.println("Date: " + date);
        System.out.println("Current Value: " + current_value);
        System.out.println("Interest Rate: " + interest_rate);
    }
}

// Savings class
class Savings extends Asset {
    double interest_rate;

    Savings(String d, String dt, double val, double rate) {
        super(d, dt, val);
        interest_rate = rate;
    }

    void displayDetails() {
        System.out.println("\n--- Savings Details ---");
        System.out.println("Descriptor: " + descriptor);
        System.out.println("Date: " + date);
        System.out.println("Current Value: " + current_value);
        System.out.println("Interest Rate: " + interest_rate);
    }
}

// Main class
class Main {
    public static void main(String[] args) {

        // Creating objects
        Asset a1 = new Stock("Equity", "01-01-2026", 50000, 100, 500);
        Asset a2 = new Bond("Gov Bond", "02-01-2026", 30000, 5.5);
        Asset a3 = new Savings("Bank Saving", "03-01-2026", 20000, 4.0);

        // Display details
        a1.displayDetails();
        a2.displayDetails();
        a3.displayDetails();
    }
}

// Abstract class
abstract class AbstractProduct {
    int product_id;
    String title;
    double price;

    AbstractProduct(int id, String t, double p) {
        product_id = id;
        title = t;
        price = p;
    }

    abstract void display();
}

// Travel Guide class
class TravelGuide extends AbstractProduct {
    String place;

    TravelGuide(int id, String t, double p, String pl) {
        super(id, t, p);
        place = pl;
    }

    void display() {
        System.out.println("\n--- Travel Guide ---");
        System.out.println("Product ID: " + product_id);
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
        System.out.println("Place: " + place);
    }
}

// CD class
class CD extends AbstractProduct {
    String artist;

    CD(int id, String t, double p, String a) {
        super(id, t, p);
        artist = a;
    }

    void display() {
        System.out.println("\n--- CD ---");
        System.out.println("Product ID: " + product_id);
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
        System.out.println("Artist: " + artist);
    }
}

// Main class
class Main {
    public static void main(String[] args) {
        TravelGuide tg = new TravelGuide(1, "India Travel", 500, "Goa");
        CD cd = new CD(4, "Music Album", 300, "Riya");

        tg.display();
        cd.display();
    }
}
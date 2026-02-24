
class OuterClass {
    int outerData = 10;

    // Inner class
    class InnerClass {
        void display() {
            System.out.println("Value of outerData: " + outerData);
        }
    }

    public static void main(String[] args) {
        OuterClass outerObj = new OuterClass();
        OuterClass.InnerClass innerObj = outerObj.new InnerClass();
        innerObj.display();
    }
}
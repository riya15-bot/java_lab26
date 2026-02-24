class NumberCheck {
    int num;

    NumberCheck(int n) {
        num = n;
    }

    void checkNumber() {
        if (num > 0)
            System.out.println("Positive Number");
        else if (num < 0)
            System.out.println("Negative Number");
        else
            System.out.println("Zero");
    }

    public static void main(String[] args) {
        NumberCheck obj = new NumberCheck(-5);
        obj.checkNumber();
    }
}
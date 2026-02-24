class Factorial {
    // Member function to calculate factorial
    int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Factorial obj = new Factorial();
        int number = 5; // constant input number
        System.out.println("Factorial of " + number + " is: " + obj.factorial(number));
    }
}

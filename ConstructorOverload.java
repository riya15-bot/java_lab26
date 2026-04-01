public class ConstructorOverload {
    ConstructorOverload()
    {
        System.out.println("Default constructor");
    }
    ConstructorOverload(int a)
    {
        System.out.println("Constructor with one parameter: " + a);
    }
    public static void main(String[] args)
    {
        ConstructorOverload obj1 = new ConstructorOverload();
        ConstructorOverload obj2 = new ConstructorOverload(70);
    }
}


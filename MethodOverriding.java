public class MethodOverriding {
    void sound(){
        System.out.println("Animal makes a sound");

    }
}
class Dog extends MethodOverriding{
    void sound(){
        System.out.println("Dog barks");
    }
    public static void main(String[]args){
        MethodOverriding obj = new Dog();
        obj.sound();
    }
}

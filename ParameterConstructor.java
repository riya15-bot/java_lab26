public class ParameterConstructor {
    int num;
    ParameterConstructor(int n){
        num = n;
    }
    public static void main(String[]args){
        ParameterConstructor obj= new ParameterConstructor(100);
        System.out.println(obj.num);
    }
}

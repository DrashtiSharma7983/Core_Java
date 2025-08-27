package LearnObjectClass;
class Laptop{
    String model;
    int price;
}


public class Demo {
    public static void main(String[] args) {
        Laptop obj = new Laptop();
        System.out.println(obj); //line 11 and 12 both are same because bydefault it calls toString method
        System.out.println(obj.toString());
    }

}

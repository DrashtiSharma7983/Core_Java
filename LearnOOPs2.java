class ExampleSuper{
    int x;
    int y;
    void fun2(int x,int y){
        this.x = x;
        this.y = y;
        System.out.println("i am fun2" + x + " & " + y);
    }
}


class Example extends ExampleSuper{
    int x;
    int y;
    void fun1(int x,int y){
        this.x = x;
        this.y = y;
        System.out.println("I am fun1 " + x + " & " + y);
        System.out.println(this.x + " & " + this.y);
        System.out.println("I am super "+ super.x + " & " + super.y);
    }
}

public class LearnOOPs2{
    public static void main(String[] a){
        Example ex1 = new Example();
        ex1.fun1(10,20);
        ex1.fun2(11,22);
    }
}

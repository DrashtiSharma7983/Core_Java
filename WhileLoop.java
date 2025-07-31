import java.util.Scanner;
class WhileLoop{
    public static void main(String []a){
        Scanner sc = new Scanner(System.in);
        boolean hasLearnt = false;
        
        while(!hasLearnt){
            System.out.println("Have you learnt something in Java");
            System.out.println("You are following java video to learn");
            hasLearnt = sc.nextBoolean();
        }
    }
}
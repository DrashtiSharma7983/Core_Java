
class Students{
    public static void getMarksSum(int[] marks){
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
            System.out.println(sum);
        }
    }
}
public class PrblmOnArray {
    public static void main(String[] args) {
        //find the sum of integers
        int marks[] = {23,12,6,7,15,3,2,56};

        Students.getMarksSum(marks);
//        int sum = 0;
//
//        for(int n:marks){
//            sum+= n;
//        }
//        System.out.println(sum);
//
//        //using for loop
//
//        int marks2[] = {23,12,6,7,15,3,2,56};
//        int s = 0;
//        for (int i = 0; i < marks2.length; i++) {
//            s+=marks2[i];
//        }
//        System.out.println("Using for loop sum of integers is " + s);
    }

}

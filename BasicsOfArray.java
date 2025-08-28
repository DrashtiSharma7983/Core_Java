//Creating array of Objects

class Student{
    int roll;
    String name;
    int age;

    Student(int roll, String name, int age){
        this.roll = roll;
        this.name = name;
        this.age = age;
    }
}


public class BasicsOfArray {
    public static void main(String []a){
        Student[] stu;
        stu = new Student[3];
        stu[0] = new Student(1,"Drashti", 26);
        stu[1] = new Student(2, "Gauri", 24);
        stu[2] = new Student(3, "Jhanvi", 16);

        for(int i=0;i<stu.length;i++){
            System.out.println(stu[i].roll+" "+stu[i].name+" "+stu[i].age);
        }



//        int myAgeArray[];  //declaration
//        myAgeArray = new int[10]; //allocation
//
//        int age[] = new int[5];
//
//        age[0] = 10;
//        age[1] = 20;
//
//        System.out.println(age[0]);
//        System.out.println(age[1]);
//        System.out.println(age[2]);
//        String names[] = {"bittu","gauri","ritik","jhanvi","kalpit"};

        //Array iteration using for loop
//        for (int i = 0; i < names.length; i++) {
//            System.out.println("Names is "+ names[i]);
//
//        }

        //Array iteration using for each loop


    }
}

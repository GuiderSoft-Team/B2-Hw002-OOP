package day25.odev;

public class Student {
    String firstName;
    String lastName;
    int age;
    int[] grades;


    public Student(String f, String l, int a, int[] g) {
        this.firstName = f;
        this.lastName = l;
        this.age = a;
        this.grades = g;
    }

    public void showInfo(){
        System.out.printf("%s %s [%d]",firstName,lastName,age);

    }

    public double getGPA(){
        int average=0;
        for (int i = 0; i < grades.length; i++) {
            average+=grades[i];
        }
        return (double)average/grades.length;
    }
}

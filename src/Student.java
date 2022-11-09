package Day23;

public class Student {
    String firstName;
    String lastName;
    int age;
    int[] grades;


    public Student(String firstName, String lastName, int age, int[] grades) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.grades = grades;
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

import java.util.Arrays;

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

    void showInfo() {
        System.out.printf("%s %s [%d] %s", firstName, lastName, age, Arrays.toString(grades));
    }

    //    double getGPA(){
//        return Math.round(((double)grades[0] + grades[1] + grades[2]) / 3);
//    }
    double getGPA() {
        int sum=0;
        for (int grade : grades) {
            sum += grade;
        }
        return Math.round((double)sum/grades.length);
    }
    public static double compare(double x, double y){
        return (Math.max(x, y));
    }
}

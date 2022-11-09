public class Student {

    public String  firstName;
    public String lastName;
    public int age;
    public int[ ] grades;

    public Student(String first, String last, int a, int[] g) {
        firstName = first;
        lastName = last;
        age = a;
        grades = g;
    }
    public void showInfo(){
        System.out.printf("%s %s [%5.2f]",firstName,lastName,getGPA());
    }
    public double getGPA(){
        double toplam=0;
        double ortalama;
        for (int i = 0; i <grades.length; i++) {
            toplam+=grades[i];
        }
       ortalama=toplam/grades.length;
        return ortalama;
    }

}

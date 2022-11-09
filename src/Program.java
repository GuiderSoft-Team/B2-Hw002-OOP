package Day23;

public class Program {
    public static void main(String[] args) {

        Student ogr1=new Student("Recep","Tako",70,new int[]{60,70,90});

        Student ogr2=new Student("Ali","Hırsız",56,new int[]{30,70,40});

        if (ogr1.getGPA()> ogr2.getGPA()){
            System.out.printf("En yüksek Not Ortalamsı %5.2f ile %s %s.",ogr1.getGPA(),ogr1.firstName,ogr1.lastName);

        }else {
            System.out.printf("En yüksek Not Ortalamsı %5.2f ile %s %s.",ogr2.getGPA(),ogr2.firstName,ogr2.lastName);
        }

    }
}

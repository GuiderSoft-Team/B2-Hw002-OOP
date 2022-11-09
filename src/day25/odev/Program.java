package day25.odev;

public class Program {
    public static void main(String[] args) {
        Student ogr1=new Student("Mehmet","UÇAR",35,new int[]{70,80});

        Student ogr2=new Student("Ahmet","ASLAN",30,new int[]{65,85});

        if (ogr1.getGPA()> ogr2.getGPA()){
            System.out.printf("En Yüksek Not Ortalamsı  = %5.2f ile %s %s.",ogr1.getGPA(),ogr1.firstName,ogr1.lastName);

        }else {
            System.out.printf("En Yüksek Not Ortalamsı = %5.2f ile %s %s.",ogr2.getGPA(),ogr2.firstName,ogr2.lastName);
        }

    }
}

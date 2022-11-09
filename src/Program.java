public class Program {
    public static void main(String[] args) {
        //TODO: Lütfen md file içerisinde belirtilen Ödevi uygun şekilde yerine getiriniz.
        Student s1 = new Student("Ahmet", "Dursun", 47, new int[]{40,50,60});
        Student s2 = new Student("Okan", "Buruk", 35, new int[]{60,70,80});

        s1.showInfo();
        System.out.println();
        s2.showInfo();

        System.out.println();
        System.out.println(s1.getGPA());
        System.out.println(s2.getGPA());

//        if(s1.getGPA()> s2.getGPA()){
//            System.out.printf("%s %s isimli öğrencinin ortalaması büyüktür.", s1.firstName, s1.lastName);
//        }else{
//            System.out.printf("%s %s isimli öğrencinin ortalaması büyüktür.", s2.firstName, s2.lastName);
//        }

       String result= Student.compare(s1.getGPA(), s2.getGPA())==s1.getGPA()?(s1.firstName + " " + s1.lastName):(s2.firstName+ " " + s2.lastName);
       System.out.println("Ortalaması büyük olan: " + result);

    }
}

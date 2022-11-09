public class Program {
    public static void main(String[] args) {
      Student s1=new Student("Veli","Sancak",15, new int[]{78,64,84,98});
      Student s2=new Student("Ali","Bayrak",14,new int[]{65,92,48,92});

      if (s1.getGPA()> s2.getGPA()){
          s1.showInfo();
      }else {
          s2.showInfo();
      }





    }
}

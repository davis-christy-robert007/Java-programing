package newstudent;

class Studentstatic {
    String name;

    static int stucount = 0;

    Studentstatic(String name) {
        this.name = name;
        stucount++;
    }

    public static int getstucount() {
        return stucount;
    }
}

public class Main {
    public static void main(String[] args) {
        Studentstatic student1 = new Studentstatic("Alex");
        Studentstatic student2 = new Studentstatic("Alvin");
        Studentstatic student3 = new Studentstatic("Abhi");

        System.out.println("Number of students created: " + Studentstatic.getstucount());
    }
}


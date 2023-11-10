public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to the Student Management System");

        Course math= new Course("Math", "MATH101", "MATH");

        Course physics= new Course("Physics", "PHY101", "PHY");

        Course chemistry= new Course("Chemistry", "CHEM101","CHEM");

        Teacher t1=new Teacher("Sedat Koc","905500000","MAT");
        Teacher t2=new Teacher("Tom Highfully", "905500001","PHY");
        Teacher t3=new Teacher("Wout Weghourst", "9900550003","CHEM");

        math.addTeacher(t1);
        physics.addTeacher(t2);
        chemistry.addTeacher(t3);

        Student s1 = new Student("Kim South", 4, "12345", math, physics,chemistry);
        s1.addBulkExamNote(50,20,40);
        s1.isPass();

        Student s2 = new Student("Larin North", 4, "54321", math, physics,chemistry);
        s2.addBulkExamNote(100,50,40);
        s2.isPass();

        Student s3 = new Student("Richy West", 4, "24681", math, physics,chemistry);
        s3.addBulkExamNote(60,50,40);
        s3.isPass();

    }
}
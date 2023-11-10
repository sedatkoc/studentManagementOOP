public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;

    int score;


    public Course(String name, String code, String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.score=0;
    }


    public void addTeacher(Teacher t){
        if(this.prefix.equals(t.branch)){
            this.courseTeacher=t;
            System.out.println("Teacher Is Added to This Specific Subject Successfully!");
        }else{
            System.out.println(t.name+" is not allowed to designated this subject!!");
        }
    }

    public void printTeacher(){
        if(courseTeacher !=null){
            System.out.println(this.name+ " is teacher of the course: " + courseTeacher.name  );
        }else{
            System.out.println("No teacher has been assigned to the "+ this.name);
        }
    }

}

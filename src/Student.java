public class Student {
    String name, stuNo;
    int classes;
    double average;
    boolean isPass;

    Course math;
    Course chemistry;
    Course physics;

    Student(String name, int classes, String StuNo, Course math, Course physics, Course chemistry){
            this.name=name;
            this.classes=classes;
            this.stuNo=stuNo;
            this.math=math;
            this.physics=physics;
            this.chemistry=chemistry;
            this.isPass=false;


    }

    public void addBulkExamNote(int mathScore, int physicsScore, int chemistryScore){
        if(mathScore>=0 && mathScore <=100){
            this.math.score=mathScore;
        }
        else{
            System.out.println("math score: out of boundries");
        }
        if(physicsScore>=0 && physicsScore<=100){
            this.physics.score=physicsScore;
        }
        else{
            System.out.println("physics score: out of boundries");
        }
        if(chemistryScore>=0 && chemistryScore<=100){
            this.chemistry.score=chemistryScore;
        }
        else{
            System.out.println("chemistry score: out of boundries");
        }
    }

    public void isPass(){
        if(this.math.score==0 || this.physics.score==0 || this.chemistry.score==0){
            System.out.println("Seems like Scores are not Entered!!! ");
        }else{
            this.isPass=isCheckPass();
            printNote();
            System.out.println("Average: "+ this.average);
            if(this.isPass){
                System.out.println("Congrats, Passed!");
            }else{
                System.out.println("unfortunately, Failed! ");
            }
        }
    }

    public void calcAverage(){
        this.average=(this.physics.score+this.math.score+this.chemistry.score)/3;
    }

    public boolean isCheckPass(){
        calcAverage();
        return this.average>55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Student : " + this.name);
        System.out.println("Math Score : " + this.math.score);
        System.out.println("Physics Score : " + this.physics.score);
        System.out.println("Chemistry Score : " + this.chemistry.score);
    }
}

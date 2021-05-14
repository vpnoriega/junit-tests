import java.util.ArrayList;

public class Student {
   private String name;
   private Long user_id;
   private ArrayList<Integer> grades;


    public Student(long id, String name) {
        this.user_id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public long getId(){
        return this.user_id;
    }

    public String getName() {
        return this.name;
    }

//    // returns the student's id
//    public long getId(){...}
//
//    // returns the student's name
//    public String getName(){...}
//
//    // adds the given grade to the grades list
//    public void addGrade(int grade){...}
//
//    // returns the list of grades
//    public ArrayList<Integer> getGrades(){...}
//
//    // returns the average of the students grades
//    public double getGradeAverage(){...}

}
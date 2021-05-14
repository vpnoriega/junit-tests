import java.util.ArrayList;

public class Student {
    String name;
    Long user_id;
    ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
    }


    public Student(long id, String name) {
    }

    public void Grades(int grade) {
        this.grades = new ArrayList<>();
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
import java.util.ArrayList;
public class Student extends Person {
    // ArrayList i Student kaldet passedCourses og currentCourses.
    ArrayList<String> passedCourses = new ArrayList<>();
    ArrayList<String> currentCourses = new ArrayList<>();
    public Student(String name, ArrayList<String> passedCourses) {
        super(name);
        this.passedCourses=passedCourses;

    }
@Override
        public boolean addCourse(String course){
            if (passedCourses.contains(course)){
                return false;
            } currentCourses.add(course);
            return true;

    }
}

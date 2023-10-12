import java.util.ArrayList;

public class Teacher extends Person {
    //ArrayList i Teacher kaldet canTeach og currentCourses.
    ArrayList<String> canTeach = new ArrayList<>();
    ArrayList<String> currentCourses = new ArrayList<>();

    public Teacher(String name, ArrayList<String> canTeach) {
        super(name);
        this.canTeach = canTeach;
    }
    @Override
        public boolean addCourse(String course){
            if (canTeach.contains(course) && !currentCourses.contains(course)){

                currentCourses.add(course);
                return true;
            }
            return false;
    }
}

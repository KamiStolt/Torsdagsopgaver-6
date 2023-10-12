import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Teacher t1 =  new Teacher("Steve", new ArrayList<>(Arrays.asList("Religion", "Kemi", "Geografi")));
        Teacher t2 = new Teacher("Bob", new ArrayList<>(Arrays.asList("Matematik", "Dansk", "Biologi", "java 1.0")));
            System.out.println(t1.addCourse("Religion"));
            System.out.println(t1.addCourse("Spansk"));
        System.out.println(t1.addCourse("IT"));

        Student s1 = new Student("Geo", new ArrayList<>(Arrays.asList("Matematik","Geografi","Dansk", "java 1.0")));
        Student s2 = new Student("Nikolaj",new ArrayList<>(Arrays.asList("Kemi","Dansk","Biologi")));
        Student s3 = new Student("Kaj",new ArrayList<>(Arrays.asList("Religion","Matematik","Biologi", "java 1.0")));
        //ArrayList <String> list = new ArrayList<>();
        //list.add("Fagets navn")
        // Student s1 = new Student ("geo",list);
            System.out.println(s1.addCourse("Dansk"));
            System.out.println(s1.addCourse("Spansk"));

            ArrayList<Person> persons = new ArrayList<>();
            persons.add(t1); // underviser
            persons.add(t2); // underviser
            persons.add(s1); // studerende
            persons.add(s2); // studerende
            persons.add(s3); // studerende

        for (int i = 0; i < persons.size(); i++) {
            if(!persons.get(i).addCourse("java 1.0")) {
               // System.out.println(persons.get(i).getName());
            if(persons.get(i) instanceof Teacher) {
                System.out.println(persons.get(i).getName() + " Kan ikke undervise dette fag");
            } else {
                System.out.println(persons.get(i).getName() + " Har allerede bestået dette kursus");
            }
            }

        }
        //for (Person person : persons) {
          //  if(!person.addCourse("java 1.0")) {
            //    System.out.println(person.getName());
          //  }
       // }
    }
}
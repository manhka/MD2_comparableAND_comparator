import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students= new ArrayList<>();
        students.add(new Student("manh",25));
        students.add(new Student("tien",20));
        students.add(new Student("chung",23));
        Collections.sort(students, new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2){
                return o1.getAge()-o2.getAge();
            }
        });
        for (Student element: students
             ) {
            System.out.println(element);
        }

    }
}

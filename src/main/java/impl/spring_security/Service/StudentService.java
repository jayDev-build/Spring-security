package impl.spring_security.Service;

import impl.spring_security.Model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    List<Student> students = new ArrayList<>(List.of(
            new Student("Yashit", 94),
            new Student("Robin", 91)
    ));

    public List<Student> getStudents(){
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }
}

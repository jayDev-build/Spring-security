package impl.spring_security.Controller;

import impl.spring_security.Model.Student;
import impl.spring_security.Service.StudentService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/")
    public List<Student> getStudents(){
        return studentService.getStudents();
    }

    @PostMapping("/")
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }

    @GetMapping("/logout")
    public CsrfToken getCSRF(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }
}

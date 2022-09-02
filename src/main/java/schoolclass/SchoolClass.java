package schoolclass;

import lombok.Builder;
import lombok.Getter;
import valueobjects.Parallel;

import java.util.List;
@Builder
public class SchoolClass {
    Parallel parallel;
    private static List<Student> students;
    private static List<Teacher> teachers;

    public Teacher getTeacherByUid(String uid){
        return null;
    }

    public Student getStudentByUid(String uid){
        return null;
    }

    public void addTeacher(Teacher teacher){

    }

    public void addStudent(Student student){

    }
}

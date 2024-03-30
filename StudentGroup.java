package seminar3;

import lombok.Data;
import lombok.Getter;
import lombok.ToString;

import java.util.*;

@Getter
@ToString
//@Data
public class StudentGroup implements Iterable<Student> {

    private final List<Student> studentsList;

    public StudentGroup() {
        studentsList = new ArrayList<>();
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(studentsList);
    }


    public void addStudent(Student student) {
        studentsList.add(student);
    }
    public void sortStudents(Student student) {
        studentsList.sort((Comparator<? super Student>) student);
    }
}

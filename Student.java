package seminar3;

import lombok.*;

//@Getter
//@AllArgsConstructor
//@Setter
//@ToString
//@EqualsAndHashCode
@Data
public class Student implements Comparable<Student> {

    private final Long id;
    private final String fullName;

    @Override
    public int compareTo(@org.jetbrains.annotations.NotNull Student o) {
        return fullName.compareTo(o.fullName);
    }
}

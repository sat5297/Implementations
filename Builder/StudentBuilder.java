
import java.util.List;

public abstract class StudentBuilder {
    String name;
    int rollNo;
    List <String> subs;

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setRollNo(int rollNo) {
        this.rollNo = rollNo;
        return this;
    }

    public abstract StudentBuilder setSubjects();

    public Student build() {
        return new Student(this);
    }
}
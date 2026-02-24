
import java.util.List;

public class Student {
    int rollNumber;
    String name;
    List<String> subjects;

    public Student(StudentBuilder builder){
        this.rollNumber = builder.rollNo;
        this.name = builder.name;
        this.subjects = builder.subs;
    }

    @Override
    public String toString(){
        return ""+ " roll number: " + this.rollNumber +
                " name: " + this.name +
                " subjects: " + subjects.get(0) + "," + subjects.get(1);
    }
}

public class Director {

    StudentBuilder studentBuilder;

    Director(StudentBuilder studentBuilder){
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent(){

        if(studentBuilder instanceof EngineeringStudentBuilder){
            return createEngineeringStudent();
        }
        else if(studentBuilder instanceof MBAStudentBuilder){
            return createMBAStudent();
        }
        return null;
    }


    private Student createEngineeringStudent(){

        return studentBuilder.setRollNo(1).setName("shakti").setSubjects().build();
    }

    private Student createMBAStudent(){

        return studentBuilder.setRollNo(2).setName("ratan").setSubjects().build();

    }
}

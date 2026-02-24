public class Main {
    public static void main(String[] args) {
        Director dir = new Director(new EngineeringStudentBuilder());
        Student student = dir.createStudent();

        System.out.println(student.toString());


        Director dir1 = new Director(new MBAStudentBuilder());
        Student student1 = dir1.createStudent();

        System.out.println(student1.toString());
    }
}
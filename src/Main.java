public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject("Science", 4);
        ClassroomCourse cc = new ClassroomCourse(subject, "Instructor", 5000, "School","Session");
        Learner learner = new Learner("Ram", cc);
    }
}
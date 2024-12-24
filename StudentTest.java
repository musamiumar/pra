public class Student {
    private String name;
    private double finalGrade;

    public Student(String name, double finalGrade) {
        this.name = name;
        this.finalGrade = finalGrade;
    }}

    

public class StudentTest {

    @Test
    public void testCalculateGrade() {
        Student student = new Student("Ahmed", 82.0);
        String grade = student.calculateGrade();
        assertEquals("B", grade, "Grade should be B");
    }
}


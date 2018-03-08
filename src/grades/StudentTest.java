package grades;

public class StudentTest{

    public static void main(String[] args) {
        Student test = new Student("Edwin");

        test.addGrade(80);
        test.addGrade(90);
        test.addGrade(95);
        test.addGrade(98);

        System.out.println(test.getName());
        System.out.println(test.getGradeAverage());



    }
}

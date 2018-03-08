package grades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student {
    private String name;
    private List<Integer> grades;
    private int grade;

    public Student(String name) {
        this.name = name;
        grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public List<Integer> getGrades(){
        return grades;
    }

    public double getGradeAverage() {
        double sum = 0;
        for(int d : grades) {
            sum += d;
        }
        return sum/grades.size();
    }
}

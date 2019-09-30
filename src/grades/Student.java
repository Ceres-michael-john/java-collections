package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades;

    public Student(String studentName){
        this.name = studentName;
        this.grades = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public double getGradeAverage(){
        double sum = 0;

        for (int grade : grades){
            sum += grade;
        }

        return sum / grades.size();
    }
//
//    public static void main(String[] args) {
//        Student michael = new Student("Michael");
//        Student john = new Student("John");
//
//        michael.addGrade(100);
//        michael.addGrade(96);
//        System.out.println(michael.getGradeAverage());
//
//
//    }

}

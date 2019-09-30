//  Welcome message
//1.  display students(ask for student)
//2.  process of choice if invalid ask again
//2.  process of choice if correct display info
//3.  user is asked to continue



package grades;

import java.util.HashMap;
import util.Input;


public class GradesApplication {

    private static Input input = new Input();

    public static void main(String[] args) {

        HashMap<String, Student> students = createStudents();
        displayStudents(students);

    }

    private static HashMap<String, Student> createStudents(){
        HashMap<String, Student> students = new HashMap<>();

        Student s1 = new Student("Michael");
        s1.addGrade(100);
        s1.addGrade(50);
        s1.addGrade(70);

        Student s2 = new Student("John");
        s2.addGrade(100);
        s2.addGrade(90);
        s2.addGrade(80);

        Student s3 = new Student("fer");
        s3.addGrade(90);
        s3.addGrade(80);
        s3.addGrade(70);

        Student s4 = new Student("Justin");
        s4.addGrade(80);
        s4.addGrade(70);
        s4.addGrade(60);

        students.put("Michaelgithub", s1);
        students.put("Johngithub", s2);
        students.put("fergithub", s3);
        students.put("Justingithub", s4);

        return students;
    }

    private static void displayStudents(HashMap<String, Student> students){
        System.out.println("Here are the GitHub usernames of our students:");
        for(String userName : students.keySet()){
            System.out.print("|" + userName + "| ");
        }
        System.out.println("\n");
        processUserChoice(input.getString("What student would you like to see more information on?"), students);
        checkContinue(students);
    }

    private static void processUserChoice(String userChoice, HashMap<String, Student> students) {
        if (students.containsKey(userChoice)) {
            System.out.format("Name: %s - GitHub Username: %s %n", students.get(userChoice).getName(), userChoice);
            System.out.format("Current Average: %,.2f%n",students.get(userChoice).getGradeAverage());
            System.out.println("\n");
        } else {
            System.out.println("I'm sorry, that student does not exist.");
        }
    }

    private static void checkContinue(HashMap<String, Student> students){
        boolean userContinue = input.yesNo("Would you like to see another student?");

        if (userContinue){
            displayStudents(students);
        }else {
            System.out.println("Goodbye.");
        }

    }

}

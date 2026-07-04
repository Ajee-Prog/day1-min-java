import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner stInput = new Scanner(System.in);

        while (true) {
            System.out.print("Enter Your Name: ");
            String name = stInput.next();
            if (name.equals("exit") || name.equals("Exit")) {
                break;
            }
            System.out.println("Enter GPA");
            double gpa = stInput.nextDouble();

            stInput.nextLine(); // Hit the Enter key
            Student oneStudent = new Student(name, gpa);

            students.add(oneStudent);

            System.out.println("New Student Added!");
            System.out.println("Total available Students Added are: " + students.size());

        }

        System.out.println("\n---All Students ---");

        for (Student s : students) {

            System.out.println(s.name + " | " + s.gpa);

        }

    }

}

public class Student {

    String name;
    double gpa;

    Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public static void main(String[] args) {
        Student s1 = new Student("YusTech", 4.2);
        System.out.println("My Company name as Student: " + s1.name + "\t Rating in GPA: " + s1.gpa);
    }
}

class Student {
    int id;
    String name;
    String program;

    void setStudent(int id, String name, String program) {
        this.id = id;
        this.name = name;
        this.program = program;
    }

    void showStudent() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Program: " + program);
    }
}

class Instructor {
    int id;
    String name;
    String department;
    String title;

    void setInstructor(int id, String name, String department, String title) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.title = title;
    }

    void showInstructor() {
        System.out.println("Instructor ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Title: " + title);
    }
}

class Course {
    int id;
    String syllabus;
    String title;
    double credits;
    String prerequisite;

    void setCourse(int id, String syllabus, String title, double credits, String prerequisite) {
        this.id = id;
        this.syllabus = syllabus;
        this.title = title;
        this.credits = credits;
        this.prerequisite = prerequisite;
    }

    void showCourse() {
        System.out.println("Course ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Syllabus: " + syllabus);
        System.out.println("Credits: " + credits);
        System.out.println("Prerequisite: " + prerequisite);
    }
}

class CourseOffering {
    int studentId;
    int instructorId;
    int courseId;
    String time;
    int sectionNo;
    int roomId;
    int year;
    String semester;

    void setCourseOffering(int studentId, int instructorId, int courseId,
                           String time, int sectionNo, int roomId,
                           int year, String semester) {
        this.studentId = studentId;
        this.instructorId = instructorId;
        this.courseId = courseId;
        this.time = time;
        this.sectionNo = sectionNo;
        this.roomId = roomId;
        this.year = year;
        this.semester = semester;
    }

    void showCourseOffering() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Instructor ID: " + instructorId);
        System.out.println("Course ID: " + courseId);
        System.out.println("Time: " + time);
        System.out.println("Section No: " + sectionNo);
        System.out.println("Room ID: " + roomId);
        System.out.println("Year: " + year);
        System.out.println("Semester: " + semester);
    }
}

public class CourseSystem {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setStudent(101, "Rana", "Software Engineering");

        Instructor i1 = new Instructor();
        i1.setInstructor(201, "Dr. Rahman", "CSE", "Professor");

        Course c1 = new Course();
        c1.setCourse(301, "OOP concepts", "Object Oriented Programming", 3.0, "Structured Programming");

        CourseOffering co1 = new CourseOffering();
        co1.setCourseOffering(101, 201, 301, "10:00 AM", 1, 505, 2025, "FA");

        System.out.println("----- Student Info -----");
        s1.showStudent();

        System.out.println("\n----- Instructor Info -----");
        i1.showInstructor();

        System.out.println("\n----- Course Info -----");
        c1.showCourse();

        System.out.println("\n----- Course Offering Info -----");
        co1.showCourseOffering();
    }
}
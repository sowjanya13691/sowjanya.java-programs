import java.util.Scanner;
class College {
    private String collegeName;
    private String facultyName;
    private String teacherId;

    public String getCollegeName() {
        return collegeName;
    }
    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }
    public String getFacultyName() {
        return facultyName;
    }
    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }
    public String getTeacherId() {
        return teacherId;
    }
    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }
}
class School extends College {
    private String studentId;
    private String studentName;
    private String department;
    private String branch;
    private double grade;
    private double attendance;
    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }
    public double getGrade() {
        return grade;
    }
    public void setGrade(double grade) {
        this.grade = grade;
    }
    public double getAttendance() {
        return attendance;
    }
    public void setAttendance(double attendance) {
        this.attendance = attendance;
    }
    public boolean isEligibleForScholarship() {
        return grade >= 8.0;
    }
    public void displayDetails() {
        System.out.println("\n---- College Information ----");
        System.out.println("College Name: " + getCollegeName());
        System.out.println("Faculty Name: " + getFacultyName());
        System.out.println("Teacher ID: " + getTeacherId());
        System.out.println("\n---- Student Information ----");
        System.out.printl
    n("Student ID: " + getStudentId());
        System.out.println("Student Name: " + getStudentName());
        System.out.println("Department: " + getDepartment());
        System.out.println("Branch: " + getBranch());
        System.out.println("Grade: " + getGrade());
        System.out.println("Attendance: " + getAttendance() + "%");
        System.out.println("Scholarship Eligibility: " + (isEligibleForScholarship() ? "Eligible" : "Not Eligible"));
    }
}
public class CollegeManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        School school = new School();
        System.out.print("Enter College Name: ");
        school.setCollegeName(sc.nextLine());
        System.out.print("Enter Faculty Name: ");
        school.setFacultyName(sc.nextLine());
        System.out.print("Enter Teacher ID: ");
        school.setTeacherId(sc.nextLine());
        System.out.print("Enter Student ID: ");
        school.setStudentId(sc.nextLine());
        System.out.print("Enter Student Name: ");
        school.setStudentName(sc.nextLine());
        System.out.print("Enter Department: ");
        school.setDepartment(sc.nextLine());
        System.out.print("Enter Branch: ");
        school.setBranch(sc.nextLine());
        double grade = 0;
        while (true) {
            System.out.print("Enter Student Grade (0.0 - 10.0): ");
            try {
                grade = Double.parseDouble(sc.nextLine());
                if (grade < 0.0 || grade > 10.0) {
                    System.out.println("Invalid grade. Please enter between 0.0 and 10.0.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid decimal number.");
            }
        }
        school.setGrade(grade);
        double attendance = 0;
        while (true) {
            System.out.print("Enter Student Attendance (0 - 100 %): ");
            try {
                attendance = Double.parseDouble(sc.nextLine());
                if (attendance < 0 || attendance > 100) {
                    System.out.println("Invalid attendance. Please enter between 0 and 100.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid decimal number.");
            }
        }
        school.setAttendance(attendance);
        school.displayDetails();
        sc.close();
    }
}

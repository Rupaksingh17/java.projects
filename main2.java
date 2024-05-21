import java.util.ArrayList;

class Student {
  private String name;
  private int grade;
  private ArrayList<String> courses;

  public Student(String name, int grade) {
    this.name = name;
    this.grade = grade;
    this.courses = new ArrayList<String>();
  }

  public String getName() {
    return name;
  }

  public int getGrade() {
    return grade;
  }

  public ArrayList<String> getCourses() {
    return courses;
  }

  public void addCourse(String course) {
    courses.add(course);
  }

  public void printStudentDetails() {
    System.out.println("Name: " + name);
    System.out.println("Grade: " + grade);
    System.out.println("Courses: ");
    for (String course : courses) {
      System.out.println("- " + course);
    }
  }
}

public class Main {
  public static void main(String[] args) {
    Student student1 = new Student("Rupak kumar", 11);
    Student student2 = new Student("Rupak kumar", 12);  

    
    student1.addCourse("Math");
    student1.addCourse("Science");
    student2.addCourse("History");
    
    student1.printStudentDetails();
    student2.printStudentDetails();
  }
}
import java.util.*;

public class School {
    ArrayList<Student> students = new ArrayList<>(50);
    ArrayList<Teacher> teachers = new ArrayList<>(1500);

    String name;
    int buildYear;
    boolean isItPrestigious;

    public School(String name, int buildYear, boolean isItPrestigious){
        this.name = name;
        this.buildYear = buildYear;
        this.isItPrestigious = isItPrestigious;
    }

//    public static String getName(){
//        return this.name;
//    }
//    public static void setName(String name){
//        this.name = name;
//    }

//    public int getBuildYear(){
//        return this.buildYear;
//    }
//    public void setBuildYear(int buildYear){
//        this.buildYear = buildYear;
//    }
//
//    public boolean getIsItPrestigious(){
//        return this.isItPrestigious;
//    }
//    public void setIsItPrestigious(boolean isItPrestigious){
//        this.isItPrestigious = isItPrestigious;
//    }

    public void addTeacher(Teacher t) {
        teachers.add(t);
    }
    public void removeTeacher(int t) {
        teachers.remove(t);
    }
    public void addStudent(Student s) {
        students.add(s);
    }
    public void removeStudent(int s) {
        students.remove(s);
    }
    public void displayStudents() {
        System.out.println(students);
    }
    public void displayTeachers() {
        System.out.println(teachers);
    }
}

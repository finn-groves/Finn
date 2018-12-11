import javax.swing.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        School school = new School("Windermere" , 1961, false);
        school.addTeacher(new Teacher("Paul","Zaremba","Programming", 7));
        school.addTeacher(new Teacher("Jason","Tryssenaar","English", 6));
        school.addTeacher(new Teacher("Vagner","'The Legend' Castilho","Life", 42));
        school.addStudent(new Student ("Finn", "Groves", 4, 633419));
        school.addStudent(new Student ("Sunny", "Shew", 69, 810547));
        school.addStudent(new Student ("Joshua", "Lactose", 80, 701253));
        school.addStudent(new Student ("Jonathon", "Yong", 40,505808));
        school.addStudent(new Student ("Damon", "Hutchings", 76, 908476));
        school.addStudent(new Student ("Nima", "Wadsworth", 20, 323232));
        school.addStudent(new Student ("Hail", "Satan", 666, 666666));
        school.addStudent(new Student ("Daisy", "Martin-Moore", 86, 633784));
        school.addStudent(new Student ("Clara", "Sun", 96, 838959));
        school.addStudent(new Student ("Katie", "Wan", 106, 100000));
        school.displayTeachers();
        school.displayStudents();
        System.out.println("-----------------------------------------------------------------");
        school.removeTeacher(0);
        school.removeStudent(0);
        school.removeStudent(1);
        school.displayTeachers();
        school.displayStudents();
    }
}

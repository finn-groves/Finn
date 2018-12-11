public class Student {
    private String firstName;
    private String lastName;
    private int grade;
    private int studentNumber;



    public Student(String firstName, String lastName, int grade, int studentNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.studentNumber = studentNumber;
    }

    @Override
    public String toString() {
        return "\nName: " + firstName + lastName + " | Grade(%): " + grade + " | Student Number: " + studentNumber;
    }

//    public String getFirstName(){
//        return this.firstName;
//    }
//    public void setFirstName(String firstName){
//        this.firstName = firstName;
//    }
//
//    public String getLastName(){
//        return this.lastName;
//    }
//    public void setLastName(String lastName){
//        this.lastName = lastName;
//    }
//
//    public int getGrade(){
//        return this.grade;
//    }
//    public void setGrade(int grade){
//        this.grade = grade;
//    }
//
//    public int getStudentNumber(){
//        return this.studentNumber;
//    }
//    public void setStudentNumber(int studentNumber){
//        this.studentNumber = studentNumber;
//    }
}
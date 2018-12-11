public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    private int numOfClasses;

    public Teacher(String firstName, String lastName, String subject, int numOfClasses){
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.numOfClasses = numOfClasses;
    }

    @Override
    public String toString() {
        return "\nName: " + firstName + lastName + " | Subject: " + subject + " | Number of Classes: " + numOfClasses;
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
//    public String getSubject(){
//        return this.subject;
//    }
//    public void setSubject(String subject){
//        this.subject = subject;
//    }
//
//    public int getNumOfClasses(){
//        return this.numOfClasses;
//    }
//    public void setNumOfClasses(int numOfClasses){
//        this.numOfClasses = numOfClasses;
//    }
}

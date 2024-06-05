public class Student_New_Details {
    public static void main(String[] args) {
     StudentDetails student_1 = new StudentDetails();
     //updating studentId using getter And setter methods
     student_1.getStudentId();
     student_1.setStudentId("ICT/600/S23/015");
     //updating studentName using getter And setter methods
     student_1.getStudentName();
     student_1.setStudentName("Peter Muthiani");
     //updating studentGPA using getter And setter methods
     student_1.getUpdatedGpa();
     student_1.setUpdatedGpa(3.5);
     System.out.println("STUDENT ID: " + student_1.getStudentId());
     System.out.println("STUDENT NAME: " + student_1.getStudentName());
     System.out.println("STUDENT GPA: " + student_1.getUpdatedGpa());
    }
}

class StudentDetails {
    //attributes of the student
    private String studentId;
      private String studentName;
      private double studentGpa;

   //updating student Id using the getter and setter method
 public String getStudentId(){
    return this.studentId;
}
public void setStudentId(String student_Id){
    this.studentId = student_Id;
}

 //updating student name using the getter and setter method
 public String getStudentName(){
    return this.studentName;
}
public void setStudentName(String name){
    this.studentName = name;
}



      //updating gpa using the getter and setter method
       public double getUpdatedGpa(){
        return this.studentGpa;
    }
    public void setUpdatedGpa(double gpa_no){
       if(gpa_no >= 0.0 && gpa_no <= 4.0){
        this.studentGpa = gpa_no;
       }
       else{
        System.out.println("The entered GPA is invalid!");
       }
    }
}



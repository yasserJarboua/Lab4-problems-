package instructor;


import student.Person;
public class Instructor extends Person {
     private String employeeNumber;
     public Instructor(String employeeNumber){
          this.employeeNumber=employeeNumber;
     }

     public String getEmployeeNumber() {
          return employeeNumber;
     }
     public void setEmployeeNumber(String employeeNumber){
          this.employeeNumber=employeeNumber;
     }
     public String cleanEmployeeNumber(){
          return this.employeeNumber.trim().replace(" ","");
     }
     public String summaryLine() {
          String s = String.format("Instructor[employeeNumber=%s, lastName=%s, firstName=%s]",
                  this.employeeNumber,this.secondName,this.firstName);
          return s;
     }
     public String toCArd(){
          StringBuilder sb=new StringBuilder("Instructor\n");
          sb.append("-------------\n");
          sb.append("Employee#:").append(this.employeeNumber).append("\n");
          sb.append("Name     :").append(this.firstName).append(",").append(this.secondName).append("\n");
          sb.append("Email    :").append(this.email).append("\n");
          sb.append("Phone    :").append(this.phone).append("\n");
          return sb.toString();
     }
     public String displayName(){
          StringBuilder sb=new StringBuilder();
          if(this.firstName!=null){
               sb.append("First name: ").append(this.firstName);
          }else if(this.secondName!=null){
               sb.append(" Last name: ").append(this.secondName);
          }
          return sb.toString();

     }
}

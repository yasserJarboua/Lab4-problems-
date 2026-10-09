package student;

public class Student extends Person {
    private String cne;
    private Major major;

    public Student(String nom, String prenom, String phone, String email, String cne, Major major) {
        super(prenom,nom,phone,email);
        this.cne=cne;
        this.major=major;
        major.addStudent(this);
    }
    public Student(String nom, String prenom, String phone, String email, String cne) {
        super(prenom,nom,phone,email);
        this.cne=cne;
    }
    public Student(){

    }
    // Getters
    public Major getMajor(){
        return this.major;
    }
    public String getCne(){
        return this.cne;
    }

    // Setters
    public void setMajor(Major major){
        this.major=major;
    }
    public void setCne(String cne){
        this.cne=cne;
    }
    @Override
    public String toString(){
        return super.toString()+" -cne: "+this.cne+" -major: "+this.email;
    }

    public String getFullNameFormatted(){
        StringBuilder sb=new StringBuilder(this.firstName.toUpperCase());
        sb.append(",");
        sb.append(this.secondName);
        return sb.toString();
    }

}


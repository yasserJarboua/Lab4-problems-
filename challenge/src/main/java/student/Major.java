package student;

public class Major {
    private static int nextId = 1;
    private int id;
    private String code;
    private String name;
    private Student[] students;
    private int studentCount;

    public Major(String code, String name) {
        this.code=code;
        this.name=name;
        this.id=nextId++;
        this.students=new Student[50];

    }
    public Major(){
        this("23","Computer Science");
    }

    // Method to add a student
    public void addStudent(Student s) {
        if(this.students.length>50){
            System.out.println("A major can't exceed 50 student");

        }else {
            this.students[this.studentCount]=s;
            this.studentCount++;
            }

    }

    // Getters
    public int getId(){
        return this.id;
    }
    public String getCode(){
        return this.code;
    }
    public String getName(){
        return this.name;
    }
    public Student[] getStudent(){
        return this.students;
    }
    //Setters
    public void setId(int id){
        this.id=id;
    }
    public void setCode(String code){
        this.code=code;
    }
    public void setName(String name){
        this.name=name;
    }

    @Override
    public String toString(){
        return "Major name: "+this.name+" -id: "+this.id+" -code: "+this.code;
    }

    // Display all students in the major
    public void displayStudents() {
        System.out.println("Students in the "+this.name+" major are: ");
        for(int i=0;i<studentCount;i++){
            System.out.println(students[i]);
        }
    }
    public Student findStudentByCNE(String cne){
        for (int i=0;i<this.studentCount;i++){
            if(this.students[i].getCne()==cne){
                return this.students[i];
            }
        }
        return null;
    }
    public int getStudentCount(){
        int count=0;
        for (int i=0;i<this.studentCount;i++){
            if(this.students[i].getMajor()!=null){
                count++;
            }
        }
        return count;
    }
    public boolean removeStudent(String cne){
        if((this.findStudentByCNE(cne)==null)){
            return false;
        }else{
            for(int i=0;i<studentCount;i++){
                if(this.students[i].getCne()==cne){
                    this.students[i]=this.students[this.studentCount-1];
                    this.students[this.studentCount-1]=null;
                    this.studentCount--;
                    break;
                }
            }

        }
        return true;
    }
    public String getOccupancyRate(){
        String s=String.format("%s capacity: 50 students\nCurrent enrollment: %d students\nOccupancy rate = %.2f%%",
                this.name,this.studentCount,(double)100*this.studentCount/50);
        return s;
    }

    public String getStudentListAsString(){
        StringBuilder sb=new StringBuilder();
        sb.append("Students in the "+this.name+" major are: \n");
        for(int i=0;i<this.studentCount;i++){
            sb.append(this.students[i]);
            sb.append("\n");
        }
        return sb.toString();
    }
}


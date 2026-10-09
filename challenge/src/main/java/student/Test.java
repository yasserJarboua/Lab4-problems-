package student;

public class Test {
    public static void main(String[] args) {
        Major m1= new Major("2121","math");
        Major m2= new Major();
        Student s1=new Student("hamza","khalo","0623854293",
                "hamza@um6p.ma","RU3253",m1);
        Student s2=new Student("Amin","Sami","0724736495",
                "Amin@um6p.ma","A39459",m2);
        Student s3=new Student("Hafssa","tanta","06128437593",
                "hafssa@um6p.ma","YE32945",m2);
        Student s4=new Student("Kamal","mami","0712847529","Kamal@um6p.ma","EA258",m1);

        // Display computer science students
        m2.displayStudents();
        System.out.println(s1.getFullNameFormatted());
        System.out.println(m1.findStudentByCNE("RU3253"));
        System.out.println(m2.getStudentCount());
        System.out.println(m2.removeStudent("AB1234"));
        System.out.println(m2.getOccupancyRate());
        System.out.println(m1.getStudentListAsString());

    }
}


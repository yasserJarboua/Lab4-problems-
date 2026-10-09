package instructor;

import java.util.Locale;

public class Subject {
    private int id;
    private String code;
    private String title;
    public Subject (int id,String code,String title){
        this.id=id;
        this.code=code;
        this.title=title;
    }
    public void  setId(int id){
        this.id=id;
    }
    public void setCode(String code){
        this.code=code;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public int getId(){
        return this.id;
    }
    public String getCode(){
        return this.code;
    }
    public String getTitle(){
        return this.title;
    }
    public String normalizedCode(){
        return this.code.trim().toUpperCase();
    }
    public String properTitle(){
        StringBuilder sb=new StringBuilder();
        String[] st=this.title.split(" ");
        for(String s:st){
            sb.append(Character.toUpperCase(s.charAt(0)));
            sb.append(s.substring(1).toLowerCase());
            sb.append(" ");
        }
        return sb.toString().trim();
    }
    public boolean isIntroCourse(){
        return this.title.contains("Intro")||this.code.startsWith("INTRO-");
    }
    public  String syllabusLine(Instructor inst){
        StringBuilder sb=new StringBuilder();
        sb.append(this.code).append("-").append(this.title).append("(Instructure:");
        sb.append(inst.getFirstName()).append(inst.getSecondName()).append(")");
        return sb.toString();
    }

}

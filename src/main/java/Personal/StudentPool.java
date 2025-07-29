package Personal;


import java.util.ArrayList;
public class StudentPool {
    ArrayList<Student> std = new ArrayList<Student>();

    public void addStudent(Student s){
        std.add(s);
    System.out.println("Add data student number "+std.size()+" success" );
    }

    public String onSerchIDButonClick(String id) {
        String name = "";
        for (Student s : std) //เอา std ลูป ใส่เข้าไปใน s
        {
            if (s.getterID().equals(id)) {
                name = s.getterName();
                break;
            }
        }
        return name;
    }

    public String display
}

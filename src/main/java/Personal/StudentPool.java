package Personal;


import java.util.ArrayList;
public class StudentPool {
    ArrayList<Student> std = new ArrayList<Student>();

    public void addStudent(Student s){
        std.add(s);
    System.out.println("Add data student number "+std.size()+" success" );
    }

//    public String onSerchIDButonClick(String id) {
//
//    }

    public void displayStudentInfor(){
        for(int i = 0; i < std.size(); i++){
            System.out.println(std.get(i));
        }
    }
}

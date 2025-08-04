package Personal;

import java.util.Scanner;
public class Main {
    public  static void  main(String[] args){
        Scanner scanner = new Scanner(System.in);
//        Student stds = new Student();
//
//
//      System.out.print("Enter your score : ");
//        stds.setterScore(scanner.nextInt());
//
//        System.out.println(stds.id);
//       System.out.println(stds.name);
//        System.out.println(stds.score);
//
//       Student s1 = new Student();
//       Student s2 = new Student();
//
//        StudentPool sPool = new StudentPool();
//       sPool.addStudent(stds);
//        sPool.addStudent(s1);
//
//
//
//      System.out.println("Serch success");
//
//      // Create a Student object
//        StudentPool n = new StudentPool();
//        StudentPool s = new StudentPool();
//
//        n.displayStudentInfor();


//        Alumni ven = new Alumni();
//        System.out.print("Enter your ID: ");
//        ven.setName(scanner.nextLine());
//
//        System.out.print("Enter your Name: ");
//        ven.setId(scanner.nextLine());
//
//        System.out.print("Enter your Occupation: ");
//        ven.setOccupation(scanner.nextLine());
//
//        System.out.println("Alumni Name: " + ven.getName());
//        System.out.println("Alumni Name: " + ven.getId());
//        System.out.println("Alumni Name: " + ven.showOccupation());

        Alumni s = new Alumni();
        s.setName("John Doe");
        s.setId("12345");
        s.showInfo();
    }
}

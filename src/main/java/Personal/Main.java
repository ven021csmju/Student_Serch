package Personal;

import java.util.Scanner;
public class Main {
    public  static void  main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Student stds = new Student();
        System.out.print("Enter your ID : ");
        stds.setterID(scanner.nextLine());

        System.out.print("Enter your Name : ");
        stds.setterName(scanner.nextLine());

        System.out.print("Enter your score : ");
        stds.setterScore(scanner.nextInt());

        System.out.println(stds.id);
        System.out.println(stds.name);
        System.out.println(stds.score);

        Student s1 = new Student();
        Student s2 = new Student();

        StudentPool sPool = new StudentPool();
        sPool.addStudent(stds);
        sPool.addStudent(s1);
        sPool.onSerchIDButonClick(s1.id);


    }
}

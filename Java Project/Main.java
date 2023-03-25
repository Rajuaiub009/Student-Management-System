import java.io.File;
import java.util.Arrays;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        AddStudent access = new AddStudent();

        System.out.println("Please Login Here:");
        access.NewAccount();
        access.Addstudent();

        System.out.println("Please enter your choice:");
        int choice = s.nextInt();
        System.out.println("1.Add Student");
        System.out.println("2.Display Student");
        System.out.println("3.Exit");
        if(choice==2){
            access.display();
        }

    }
}
interface Student {
    void AddStudent();
    void Display();
    void Calculator();
}
interface Login{
    void NewAccount();
    void CheckSid();
}


public class TeacherLogin implements Login {
    private String username;
    private String password;
    protected in chocie;
    Scanner s = new Scanner(System.in);
    public void NewAccount(){
        System.out.println("Enter your name:");
        String name = s.next();
        System.out.println("Enter your password:");
        String password = s.next();
        this.username = username;
        this.password = pass;
    }
    public void CheckSid(){
    String useername;
    String pass;
    do{
        System.out.println("Enter your name and password to login:");
        System.out.println("Enter your name:");
        username = s.next();
        System.out.println("Enter your password:");
        pass = s.next();
    }
    while(!username.equalsIgnoreCase(username)&&!pass.equals(password));
    if(username.equalsIgnoreCase(username)&&pass.equals(password)){
        System.out.println("Enter your choice:");
        int choice = s.nextInt();
        System.out.println("1.Add Student");
        System.out.println("2.Display Student");
        System.out.println("3.Exit");

    }
    }
}
public class AddStudent extends TeacherLogin implements Student  {
    Scanner s= new Scanner(System.in);
    String [] Studentsname;
    double [] cgpa;
    String[] id;
    int[] midterm;
    int [] finalgarde;
    public void AddStudent(){
        super.CheckSid();
        if(choice==1){
            System.out.println("How many students do you want to input:");
            int numberofStudents= scanner.nextInt();
            Studentsname= new String[numberofStudents];
            id=new String[numberofStudents];
            midterm= new int[numberofStudents];
            finalgarde= new int[numberofStudents];
            cgpa=new double[numberofStudents];
            int k=1;
            for(int i=0; i<Studentsname.length; i++){
                System.out.println(k++ + ". "+ " Student name:-");
                Studentsname[i]=scanner.next();
                System.out.println("What's the id of this student?");
                id[i]=scanner.next();
                System.out.println("Midterm garde");
                midterm[i]=scanner.nextInt();
                System.out.println("Final Grade");
                finalgarde[i]=scanner.nextInt();
            }
        }
    }

    public void Calculator() {
        for (int i = 0; i < Studentsname.length; i++) {
            if ((midterm[i] * 0.4 + finalgarde[i] * 0.6) >= 90) {
                cgpa[i] = 4.0;
            } else if ((midterm[i] * 0.4 + finalgarde[i] * 0.6) >= 85 && (midterm[i] * 0.4 + finalgarde[i] * 0.6) < 90) {
                cgpa[i] = 3.75;
            } else if ((midterm[i] * 0.4 + finalgarde[i] * 0.6) >= 80 && (midterm[i] * 0.4 + finalgarde[i] * 0.6) < 85) {
                cgpa[i] = 3.50;
            } else {
                cgpa[i] = 0.0;
            }
        }
        public void Display(){

            try{
                File f = new File("Student Result management system.txt");
                boolean value = f.createNewFile();
                if(value){
                    System.out.println("File created");
                }
                else{
                    System.out.println("File already exists.");
                }
                FileWriter fw = new FileWriter("Student Result management system.txt");
                fw.write("Student Result Management System");

                for(int i=0; i<Studentsname.length; i++){
                    Calculator();

                  fw.write("Student name:"
                            +Studentsname[i]+". "+"Student id:- "+id[i]+ ". Midterm"+":- " +
                            ""+ +midterm[i]+". "+ "Final"+":- "+ finalgarde[i]+ " CGPA:- "+ cgpa[i]);

                }
                fw.close();
            }

            catch(IOExcption e){
                System.out.println("problem" +e);

            }

            }
        }
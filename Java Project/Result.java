import javax.swing.*;
import java.util.Arrays;
import java.io.*;
import java.io.IOException;
import java.util.Scanner;

public class Result {
    public static void main(String[] args) throws IOException{
        Scanner s = new Scanner(System.in);
        AddStudent access = new AddStudent();

        System.out.println("Please Login Here:");

        access.newAccount();

        access.addstudent();

        System.out.println("Please enter your choice:");
        System.out.println("1.Add Student .  2.Display Student. 3.Exit");
        int choice = s.nextInt();
        if(choice==2) {
            access.display();
        }
    }
}


interface student {
    void addstudent();
    void display();
    void calculator();
}
interface Login{
    void newAccount();
    void checkSid();
}

 class TeacherLogin implements Login {
    private String username;
    private String password;
    protected int choice;
    Scanner s = new Scanner(System.in);
    public void newAccount(){
        System.out.println("Enter your name:");
        String name = s.next();
        System.out.println("Enter your password:");
        String password = s.next();
        this.username = username;
        this.password = password;
    }
    public void checkSid(){
    String username;
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

        System.out.println("1.Add Student .  2.Display Student. 3.Exit" );
        int choice = s.nextInt();
        this.choice = choice;


      }
    }
}


 class AddStudent extends TeacherLogin implements student  {
    Scanner s= new Scanner(System.in);
    String [] Studentsname;
    double [] cgpa;
    String[] id;
    int[] midterm;
    int [] finalgrade;

    public void addstudent(){
        super.checkSid();
        if(choice==1){
            System.out.println("How many students do you want to take input:");
            int numberofStudents= s.nextInt();

            Studentsname= new String[numberofStudents];
            id=new String[numberofStudents];
            midterm= new int[numberofStudents];
            finalgrade= new int[numberofStudents];
            cgpa=new double[numberofStudents];
            int k=1;
            for(int i=0; i<Studentsname.length; i++){

                System.out.println(k++ + ". "+ " Student name:-");
                Studentsname[i]=s.next();
                System.out.println("Enter your id:");
                id[i]=s.next();
                System.out.println("Midterm grade");
                midterm[i]=s.nextInt();
                System.out.println("Final Grade");
                finalgrade[i]=s.nextInt();
            }
        }
    }

    public void calculator(){
        for(int i=0; i<Studentsname.length; i++){
            if((midterm[i]+finalgrade[i])/2>=90){
                cgpa[i]=4.0;
            }
            else if((midterm[i]+finalgrade[i])/2>=80&& (midterm[i]+finalgrade[i])/2<90){
                cgpa[i]=3.0;
            }
            else if((midterm[i]+finalgrade[i])/2>=70&& (midterm[i]+finalgrade[i])/2<80){
                cgpa[i]=2.0;
            }

            else {
                cgpa[i]=0.0;
            }
        }

    }
     public void display() throws IOException{
        String[]s = new String[Studentsname.length];
        FileWriter fileWriter = new FileWriter("/Users/User/Desktop/Result.text");
                 int o=1;

             for(int i=0; i<Studentsname.length;i++){

                 calculator();
                s[i] = ("\n"+o+++". "+"Student name:-"
                         +Studentsname[i]+". "+"Student id:- "+id[i]+ ". Midterm"+":- " +
                         ""+ +midterm[i]+". "+ "Final"+":- "+ finalgrade[i]+ " Gpa:- "+ cgpa[i]);
                fileWriter.write(s[i]);
             }
             fileWriter.close();

         }

     }




import java.util.Scanner;
public class Choice {

public static void main(String[]args){
  Scanner input = new Scanner(System.in);
  int ch = 0;
do
{
System.out.println("Enter your choice");
ch = input.nextInt();

switch(ch){
case 1:
System.out.println("1)ADD STUDENT");
break;
case 2:
System.out.println("2)Display student");
break;
case 3:
System.out.println("3)Exit");
break;

  }
}
while(ch!=3);
}
}
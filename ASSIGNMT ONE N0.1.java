package oddeven;
import java.util.Scanner;

public class Oddeven {
//declearing variables
    String name;
    int age;
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       String name;
       int age;
       System.out.println("Enter the sirname");
       name=sc.next();
       System.out.println("Enter your age");
       age=sc.nextInt();
       
       System.out.println("Name:"+name);
       System.out.println("Age:"+age);
       if(age%2==0){
           System.out.println(age+ "is even");}
       else{
           System.out.println(age+ "is odd");}
           
       }
    }
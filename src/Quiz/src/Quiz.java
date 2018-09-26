import java.net.*; 
import java.io.*; 
import java.util.*;
public class Quiz {
    static int choice;
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("1) Login as a teacher\n2) Login as a student \n3)Exit");
        while(true)
            {
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    Teacher t=new Teacher();
                    menu1();
                    break;
                case 2:
                    Student s=new Student();
                    menu2();
                    break;
                case 3:
                    return ;
                default:
                    break;
            }
        }
    }
    public static void menu1()
    {
        int ch;
        System.out.println("1) add new subject \n2) add new quiz \n3)add new section \n4)add solution \n5)reply to query  \n6)exit");
        while(true)
            {
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    return ;
                default:
                    break;
            }
        }
    }
    public static void menu2()
    {
        int ch;
        System.out.println("1) take quiz \n2) ask query \n3)exit");
        while(true)
            {
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    return ;
                default:
                    break;
            }
        }
    }
}

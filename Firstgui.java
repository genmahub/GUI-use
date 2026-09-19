
package firstgui;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Firstgui {

    
    public static void main(String[] args) {
        // TODO code application logic here
        String name;
        int age;
        int year;
        
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter your name: ");
        name=scanner.nextLine();
        System.out.print("Enter the year you were born: ");
        year=scanner.nextInt();
        
        age=2026-year;
        
        if(age>=18){
            System.out.println(name+" "+"you are allowed to vote!!");
        }
        else{
            System.out.println(name+" "+"you cant vote");
        }
        
        JOptionPane.showConfirmDialog(null, age );
        
        scanner.close();
    }
    
}

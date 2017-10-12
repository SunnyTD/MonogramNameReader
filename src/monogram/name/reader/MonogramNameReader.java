/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monogram.name.reader;

/**
 *
 * @author Daniel
 */
import java.util.Scanner;
public class MonogramNameReader 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Put your first name here!: ");
        String first = in.next();
        System.out.print("Put your middle name here!: ");
        String middle = in.next();
        System.out.print("Put your last name here!: ");
        String last = in.next();
        System.out.println(first + middle + last);
        String i1 = first.substring(0,1);
        String i2 = middle.substring(0,1);
        String i3 = last.substring(0,1);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        
//        String[] arrayPrompts = 
//        {
//            "Put your first name here!: ",
//            "Put your middle name here!: ",
//            "Put your last name here!: "
//        };
//        
//        Scanner in = new Scanner(System.in);
//        String initials = "";
//        String fullName = "";
//        for (String s: arrayPrompts)
//        {
//            System.out.print(s);
//            String input = in.next();
//            fullName = fullName + input + " ";
//            String initial = input.substring(0,1);
//            initials = initials + initial;
//        }
//        System.out.println(fullName);
//        System.out.println(initials);      
    }
    
}

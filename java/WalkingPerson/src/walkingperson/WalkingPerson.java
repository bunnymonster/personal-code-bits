/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package walkingperson;

/**
 *
 * @author weber_000
 */
import java.util.Scanner;
public class WalkingPerson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to walkingPerson.");
        System.out.println("Please enter a path consisting of ");
        System.out.println("the symbols F,R,L,B.  The person starts out at 0,0, facing towad the positive x axis.");
        System.out.println("F moves the person forward 1 spot in their current direction.");
        System.out.println("B moves the person backward 1 spot in their current direction.");
        System.out.println("L turns the person 90 degrees left.");
        System.out.println("R turns the person 90 degrees right.");
        System.out.println("Press Q and then enter to quit.");
        Scanner scanner = new Scanner(System.in);
        String walkPath = scanner.nextLine();
        Person walker = new Person();
        while(!walkPath.equals("Q")) {
             walker.parsePath(walkPath);
             walker.clearPath();
             walkPath = scanner.nextLine();
        }
    }   
}

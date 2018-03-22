/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuleronetoten;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 *
 * @author weber_000
 */
public class ProjectEulerOneToTen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Select which Euler Problem you wish to compute
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        
        //Find class with name containing num and call its method.
        findMethod(num);
    }
    
    public static void findMethod(int num) {
        
        String[] numToStrArray = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
        try{
            //load the AppTest at runtime
            Class cls = Class.forName("projectproblems.Problem"+numToStrArray[num]);
            Object obj = cls.newInstance();

            //call the printIt method
            Method method = cls.getDeclaredMethod("compute", null);
            method.invoke(obj, null);
			
	}catch(Exception ex){
		System.out.println("This problem has not been implemented yet.  Please select another problem.");
	}
    }
    
}

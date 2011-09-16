/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inf2005;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Random;

/**
 *
 * @author patrick
 */
public class GitTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    private String sayTheDateTime(){
        Date today = new Date();
        
        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyyMMddhhmmss");
        
        StringBuilder todayAsString = new StringBuilder(dateFormatter.format(today));
        return todayAsString.toString();
    }
    private int giveRandomInt(){
        
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(101);
        
        
        return randomNumber;
    }
    
}

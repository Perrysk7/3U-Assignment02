
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author katop7929
 */
public class counting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a city 
        City kw = new City(); 
        
        //create a robot  
        Robot karel = new Robot(kw,1,1,Direction.EAST);
        
        //craete a counter variable 
        int count = 0; 
        
        //loop 5 times 
        while(count <5){ 
            //move robot 
            karel.move(); 
            //count 1 step
            count = count +1; 
        }
        karel.turnLeft();
        karel.turnLeft();
        
        //counting using a for loop 
        for(int i = 0; i < 5; i = i + 1){
            //move robot 
            karel.move(); 
        }
        count = 0; 
        count += 2; 
        
        
        
        
    }
}

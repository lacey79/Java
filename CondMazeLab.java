///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           Maze Lab
// Course:          CS200, Spring, 2023
//
// Author:          Lacey Dinh
// Email:           cldinh@wisc.edu 
// Lecturer's Name: Jim Williams
//
///////////////////////////////// CITATIONS ////////////////////////////////////
//
// Source or Recipient; Description
// No help given or received.
/////////////////////////////// 80 COLUMNS WIDE ////////////////////////////////
/**
 * The class determine who is the winner in the game 
 * Rock - Paper- Scissors (either the program or the user is a winner
 * , else results in a Tie).
 *
 * @author Lacey
 */
public class CondMazeLab extends Maze {
    
    /** cause the program to start the Puss In Boots maze simulation.
     * 
     * @param args unused
     */
    public static void main(String[] args) { 
       
        // Step 1: Run Maze Simulation
        CondMazeLab myMaze = new CondMazeLab();
    }
    
    /**
     * Instructions for how Puss should proceed in each step.
     * @param None
     */
    public void step(){           
     // Steps 2 and 3: Implement HERE
      //You do not need to write any loops. This method will be called repetitively.
      puss.right();
      if(puss.isFacingWall()) {
          puss.left();
      }
      if(puss.isFacingMud()) {
            
            /*puss.left();
            if(!puss.isFacingWall() && (!puss.isFacingGully()) && 
                (!puss.isFacingDog()) && (!puss.isFacingMud())){
                    puss.forward();
            }
            puss.right();*/
            
            if(puss.isTipToeing()) {
                puss.stopTipToe() ;
                puss.putOnBoots();
            }else if(!puss.isInBoots()) {
                puss.putOnBoots();
                
            }
            puss.forward();
        }
        else if(puss.isFacingDog()) {
            if(puss.isInBoots()) {
                puss.takeOffBoots();}
            puss.startTipToe();
            puss.forward();
        }
        
        else if(puss.isFacingGully()) {
        
            
            if(puss.isTipToeing()) {
                puss.stopTipToe();
                //puss.putOnBoots();
            }
            if(puss.isInBoots()) {
               puss.takeOffBoots();
            }
            //puss.takeOffBoots();
            puss.jump();
            //puss.forward();
        }
        else if (puss.isFacingWall()){
            puss.right();
            if(puss.isFacingWall()) {
                puss.left();
                puss.left();
                //if(puss.isFacingWall()){
                    //puss.left();
                if(puss.isFacingWall()){
                     puss.left();
                    }
                }
               // puss.left();
            
            //puss.forward();  
        }
        else{
            puss.forward();
            /*puss.left();
            if(!puss.isFacingWall()){
                puss.forward();
            }else{ 
                puss.right();
                puss.forward();
                }*/
           }
       
        
    }       
    
    /**
     * This file contains software for running the Puss In Boots 
     * maze simulation that the code will interact with.
     * @param None
     */
    public CondMazeLab() { super(true); }
}
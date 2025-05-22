/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jyche
 */
public class Intermediate extends Level{
    //array for fake facts
    private String [] fakeFacts = {"Cracking your knuckles gives you arthritis.", "Goldfish have a 3 second memory.", "We eat 8 spiders every year in our sleep.", "You have to wait 30 minutes after eating before swimming.", "Sugar makes kids hyperactive."};
    //array for real facts
    private String [] realFacts = {"Water boils at 100°C.", "The femur is the longest bone in the human body.", "Penguins are birds that cannot fly.", "As reported by National Geographic, elephants are the largest land animals currently living on Earth.", "A study published in the New England Journal of Medicine found that regular physical activity reduces the risk of heart disease."};
    private static int score = 0;
    private final static int MAX_SCORE = 5;
    
    //resets the score back to 0
    public void resetScore(){
        score = 0;
    }
    
    //displays the user's score 
    public String displayScore(){
        //there are 5 real facts out of 10 so if the user gets them all right, it prints out correct
        if (score == MAX_SCORE){
            return "All answers are correct!";
        //if the user doesn't get all the answers correct, it prints the users current score out of 5
        }else{
            return "Your score is " + score + "/5";
        }
    }
    
    //method to display the facts into the checkboxes
    public void displayFacts(){
        //for each loop to print out the fake facts and real facts
        for (String facts : fakeFacts){
            System.out.println(facts + "Fake");
        }
        for (String facts : realFacts){
            System.out.println(facts + "True");
        }
    }
    
    //checks if the selected answer is in the fake fact array 
    public boolean checkAnswers(String answer){
        //for each loop for the fake facts
        for (String facts : fakeFacts){
            //if the user identifies the real facts, their score goes up by 1 for each correct factS
            if (facts.equals(answer)){
                //add score if user correctly identifies the fake fact
                score++;
                return true;
            }
        }
        //returns false if user can't find the fake fact
        return false;
    }
    
    //puts the two arrays of fake and real facts into one to disply in the checkboxes
    public String [] getFacts(){
        //inializes the facts into an array
        String [] facts = new String [10];
        //loops through and assigns the fake facts and real facts
        for (int i = 0; i< 5; i++){
            //first 5 in array are the fake facts
            facts[i] = fakeFacts[i];
            //the last 5 facts are the real facts
            facts[i+5] = realFacts[i];
        }
        //returns array 
        return facts;
    }
    
}

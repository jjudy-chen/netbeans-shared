/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jyche
 */
public class Intermediate extends Level{
    private String [] fakeFacts = {"Cracking your knuckles gives you arthritis.", "Goldfish have a 3 second memory.", "We eat 8 spiders every year in our sleep.", "You have to wait 30 minutes after eating before swimming.", "Sugar makes kids hyperactive."};
    private String [] facts = {"Water boils at 100°C.", "The femur is the longest bone in the human body.", "Penguins are birds that cannot fly.", "As reported by National Geographic, elephants are the largest land animals currently living on Earth.", "A study published in the New England Journal of Medicine found that regular physical activity reduces the risk of heart disease."};
    
    public void displayFacts(){
        for (String facts : fakeFacts){
            System.out.println(facts + " (Fake)");
        }
        for (String facts : facts){
            System.out.println(facts + " (True)");
        }
    }
    

    public boolean checkAnswer(String answer){
        for (String fake : fakeFacts){
            if (fake.equalsIgnoreCase(answer)){
                setScore(getScore() + 1);
                return true;
            }
        }
        return false;
    }
    
}

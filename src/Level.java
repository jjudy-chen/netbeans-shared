/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lilya
 */
public class Level {
    private int score;
    private static int highestScore = 0;
    private String answers;
    
        public Level(String answers){//constructor 1
        this.score = 0;
        this.answers = answers;
    }
        
    public Level(){//consctructor 2
        this.score = 0;
    }
    
    public String displayText(String text){
        return text;
    }
    
    public boolean checkAnswer(String userAns, int score){
        boolean isTrue = false;
        if (userAns.equals(answers)){
            isTrue = true;
            this.score += score;
        }
        return isTrue;
    }
    
    public int getScore(){
        return score;
    }
    
    public void setScore(int score){
        this.score = score;
    }
    
public static void updateHighestScore(int score) {
    if (score > highestScore) {
        highestScore = score;
    }
}

public static int getHighestScore() {
    return highestScore;
}
}

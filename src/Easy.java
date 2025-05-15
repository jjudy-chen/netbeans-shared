/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lilya
 */
public class Easy {
    private String answers;
    private String userAnswers;
    private String titles;
    
    public Easy(String answers, String userAnswers, String titles){
        this.answers = answers;
        this.userAnswers = userAnswers;
        this.titles = titles;
    }
    
    
    public boolean checkAnswers(){
        boolean passed = false;
        if(userAnswers.equals(answers)){
            passed = true;
        }
        return passed;
    }
    
}

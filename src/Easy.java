/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lilya
 */
import java.util.Arrays;

public class Easy extends Level{
    private String answers;
    private String userAnswers;
    
    public Easy(String answers, String userAnswers){
        super(answers);
        this.userAnswers = userAnswers;
    }
    
    public String getAnswers(){
        return answers;}
    
    public String getUserAnswers(){
        return userAnswers;
    }
public boolean checkAnswers(){
    if (userAnswers != null){
        
    
    String[] correct = answers.split(",");
    String[] user = userAnswers.split(",");

    if (correct.length != user.length)
        return false;

    // Clean up each answer
    for (int i = 0; i < correct.length; i++) {
        correct[i] = correct[i].trim();
        user[i] = user[i].trim();
    }

    Arrays.sort(correct);
    Arrays.sort(user);

    return Arrays.equals(correct, user);
    }else{
        return false;
    }
}

    
}

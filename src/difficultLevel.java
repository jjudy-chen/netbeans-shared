import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vivianwu
 */

public class difficultLevel extends Level {
    private String[] fakeFacts;
    private String[] facts;
    private Article[] fakeArticle;
    private String[] title;
    
    public difficultLevel(String[] fakeFacts, String[] facts, Article[] fakeArticle, String[] title) {
        this.fakeFacts = fakeFacts;
        this.facts = facts;
        this.fakeArticle = fakeArticle;
        this.title = title;
    }
        
    public String displayFacts () {        
        return "Real Facts: " + Arrays.toString(facts);
    }
    
    public String displayTask (String task) {
        return "Task: " + task;
    }
    
    public boolean checkAnswer (String ans) {
        for (String fakeFact : fakeFacts) {
            if (fakeFact.equalsIgnoreCase(ans)) {
                return true;
            }
        }
         return false;
    }
    
    public String displayTitle() {
        return "Titles: " + Arrays.toString(title);
    } 
    
    public String displayArticle(String articleTitle) {
        for (Article article : fakeArticle) {
            if (article.getTitle().equalsIgnoreCase(articleTitle)) {
                return article.getContent();
            }
        }
        return "Article is not found";
    }
    
}


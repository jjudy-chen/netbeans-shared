
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jyche
 */
public class Article {
    private String title;
    private String content;
    private boolean isFake;
    
    public Article (String title, String content, boolean isFake){
        this.title = title;
        this.content = content;
        this.isFake = isFake;
    }
    
    public String getTitle(){
        return title;
    }
    
    public String getContent(){
        return content;
    }
    
    public boolean getIsFake(){
        return isFake;
    }
    
    public void setTitle(String title){
        this.title = title;
    }
    
    public void setContent (String content){
        this.content = content;
    }
    
    public void setIsFake (boolean isFake){
        this.isFake = isFake;
    }
    
    
    public static Article [] readArticlesFromFile(String filename){
        List<Article> articleList = new ArrayList<>();
        try {
            Scanner reader = new Scanner(new File(filename));
            while(reader.hasNext()){
                String stuff = reader.nextLine();
                String [] parts = stuff.split("_");
                
                if(parts.length ==4){
                    String title = parts[0].trim();
                    String author = parts[1].trim();
                    String content = parts[2].trim();//this is unused...
                    boolean isTrue = Boolean.parseBoolean(parts[3].trim());
                    
                    Article article = new Article(title, author, isTrue);
                    articleList.add(article);
                }
            }
            reader.close();
        }catch(IOException e){
            System.out.print("Error found: " + e);
        }
    return articleList.toArray(new Article[0]);
    
}
}

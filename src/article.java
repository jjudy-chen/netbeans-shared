/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jyche
 */
public class article {
    private String title;
    private String content;
    private boolean isFake;
    
    public article (String title, String content, boolean isFake){
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
    
}

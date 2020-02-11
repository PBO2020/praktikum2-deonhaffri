/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KOPI;

/**
 *
 * @author Praktikan
 */
public class Component {
    private String JenisKopi;
    private String Asalkopi;
    private String Topping;
    public void setJenisKopi(String JenisKopi){
        this.JenisKopi=JenisKopi;
    }
    public void setAsal (String Asal){
        this.Asalkopi=Asalkopi;
    }
    public String getJenisKopi(){
        return JenisKopi;
    }
    public void setAsalkopi(String Asalkopi){
        this.Asalkopi=Asalkopi;
        
    }
    public String getAsalkopi(){
        return Asalkopi;
    }
    public String getTopping(){
        return Topping;
    }
    public void setTopping(String Topping){
        this.Topping=Topping;
        
    }
}

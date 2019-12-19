/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkhaussystem;

/**
 *
 * @author phili
 */
public class Schranke {
    protected boolean isOffen;
    
    Schranke(){
        this.isOffen = false;
    }
    public void öffnen(){
        isOffen = true;
        
    }
    
    @Override
    public String toString(){
        String s;
        s = "Status: "+ (this.isOffen ? "offen": "geschlossen");
        return s;
    }
}

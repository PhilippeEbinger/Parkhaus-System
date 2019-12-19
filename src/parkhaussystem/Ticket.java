/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkhaussystem;

import org.joda.time.*;
/**
 *
 * @author phili
 */
public class Ticket {
    protected DateTime ausgabe;
    protected DateTime verfall;
    protected final double PREIS = 2.50;
    public Ticket(){
        
    }
    public double getBetrag(){
        return 0;
    }
    
    @Override
    public String toString(){
        String s = "";
       s += "Ausgabe: " + this.ausgabe.toString()+"\n";
       s += "Verfall: " + this.verfall.toString()+"\n";
       s += "Preis: " + this.getBetrag();
  
       return s;
    }
}
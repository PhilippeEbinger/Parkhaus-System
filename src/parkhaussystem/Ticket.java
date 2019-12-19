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
        ausgabe = new DateTime(DateTimeZone.UTC);
        verfall = ausgabe.plusSeconds(10);
    }
    
    public double getBetrag(){
        DateTime jetzt = new DateTime(DateTimeZone.UTC);
        int sekunden = Seconds.secondsBetween(verfall, jetzt).getSeconds();
        if (sekunden <= 0){
            return 0;
        }else{
            return sekunden * PREIS;
        }
    }
    
    public void setVerfall(){
        DateTime jetzt = new DateTime(DateTimeZone.UTC);
        verfall = jetzt.plusSeconds(10);
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
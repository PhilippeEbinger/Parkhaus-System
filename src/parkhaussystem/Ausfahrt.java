/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkhaussystem;
import java.util.TreeMap;
import org.joda.time.*;
/**
 *
 * @author phili
 */
public class Ausfahrt extends Schranke{
    public void ausfahrt(TreeMap<Integer, Ticket> tickets, int key){
        DateTime jetzt = new DateTime(DateTimeZone.UTC);
        
        Ticket ticket = tickets.get(key);
        
        if(ticket.verfall.isAfterNow()){
            this.öffnen();
            tickets.remove(key);
        }
    }
}
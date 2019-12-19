/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkhaussystem;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;
/**
 *
 * @author phili
 */
public class Leitsystem {
    
    protected final int MAX_PLÄTZE = 100;
    
    protected Kasse kasse = new Kasse();
    protected Einfahrt einfahrt = new Einfahrt();
    protected Ausfahrt ausfahrt = new Ausfahrt();
    protected TreeMap<Integer, Ticket> tickets = new TreeMap<Integer, Ticket>();
    
    
    public int GetFreiePlätze(){
        return MAX_PLÄTZE - this.GetBelegtePlätze();
    }
    public int GetBelegtePlätze(){
        return tickets.size();
    }
    
    public String getMenu(){
        String x = "";
        if (this.GetFreiePlätze() > 0){
            x += "E - Einfahrt\t";
        }
        if (this.GetBelegtePlätze() > 0){
            x += "A - Ausfahrt\t";
            x += "Z - Zahlen\t";
        }
        x += "S - Status\t";
        x += "X - Beenden\t";
        
        return x;
    }
    
    
    @Override
    public String toString(){
        String s;
        s = "Anzahl Plätze\n";
        s += "Verfügbar:\t" + this.MAX_PLÄTZE + "\n";
        s += "Belegt\t\t" + this.GetBelegtePlätze() + "\n";
        s += "Frei:\t\t" + this.GetFreiePlätze() + "\n";
        s += "Einfahrtschranke:\n" + einfahrt + "\n";
        s += "Ausfahrtschranke:\n" + ausfahrt + "\n";
        s += "Tickets:\n";
        
        for (Iterator i = this.tickets.entrySet().iterator(); i.hasNext();){
            Entry e = (Entry) i.next();
            s += "Nr: " + e.getKey() + "\t" + e.getValue()+"\n";
        }
        return s;
    }
}

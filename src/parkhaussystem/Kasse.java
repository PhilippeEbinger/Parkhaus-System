/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkhaussystem;
import java.util.TreeMap;
/**
 *
 * @author phili
 */
public class Kasse {
    public void zahlen(TreeMap<Integer, Ticket> tickets, int key){
        Ticket ticket = tickets.get(key);
        ticket.setVerfall();
    }
}

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
public class Einfahrt extends Schranke{
    public Ticket einfahrt(){
        this.öffnen();
        return new Ticket();
    }
}
    

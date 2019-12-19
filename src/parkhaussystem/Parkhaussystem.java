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
public class Parkhaussystem {

    static Leitsystem mySystem = new Leitsystem();
    
    public static void main(String[] args) {
        
        char taste; 
        do{
            taste = showMenu();
            execMenu(taste);
        } while (taste != 'X'); //Beenden
    }
    
    public static char showMenu(){
        for (int i = 0; i < 50; ++i){
            System.out.println();
        }
        
        System.out.println(mySystem.getMenu());
        
        return CLesen.readChar();
    }
    public static void execMenu(char pos){
        int key;
        switch(pos){
            case 'E': //Einfahrt
                mySystem.einfahrt();
                break;
            case 'A': //Ausfahrt
                System.out.println("Mit welchem Ticked soll ausgefahren werden?");
                key = CLesen.readInt();
                mySystem.ausfahrt(key);
                break;
            case 'Z': //Zahlen
                System.out.println("Welches Ticket soll bezahlt werden?");
                key = CLesen.readInt();
                mySystem.zahlen(key);
                break;
            case 'S': //Statutus
                System.out.println(mySystem);
                System.out.println("...Bitte Taste drücken...");
                new java.util.Scanner(System.in).nextLine();
                break;
        }
    }
    
}

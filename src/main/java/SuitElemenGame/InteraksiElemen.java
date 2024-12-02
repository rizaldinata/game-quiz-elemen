/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SuitElemenGame;

/**
 *
 * @author rizal
 */
public class InteraksiElemen {
    public static boolean seranganCritical(String attacker, String defender) {
        return (attacker.equals("api") && defender.equals("angin")) ||
                (attacker.equals("air") && defender.equals("api")) ||
                (attacker.equals("tanah") && defender.equals("air")) ||
                (attacker.equals("angin") && defender.equals("tanah"));
    }
    
    public static boolean seranganLemah(String attacker, String defender) {
        return (attacker.equals("angin") && defender.equals("api")) ||
                (attacker.equals("api") && defender.equals("air")) ||
                (attacker.equals("air") && defender.equals("tanah")) ||
                (attacker.equals("tanah") && defender.equals("angin"));
    }
}

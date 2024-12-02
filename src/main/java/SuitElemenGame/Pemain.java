/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SuitElemenGame;

/**
 *
 * @author rizal
 */
public class Pemain {
    private String nama;
    private int hp = 100;
    private String elemen;
    String pilihan;
    
    public Pemain(String nama){
        this.nama = nama;
    }
    
    public void setPilihan(String pilihan){
        this.pilihan = pilihan;
    }
    
    public void setElemen(String elemen){
        this.elemen = elemen;
    }
    
    public void setHp(int damage) {
        this.hp -= damage;
    }
    
    public String getNama() {
        return nama;
    }
    
    public int getHp() {
        return hp;
    }
    
    public String getElemen() {
        return elemen;
    }
    
    public String getPilihan() {
        return pilihan;
    }
    
}

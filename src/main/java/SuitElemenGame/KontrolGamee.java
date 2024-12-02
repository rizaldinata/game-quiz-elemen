/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SuitElemenGame;

import java.util.Random;

/**
 *
 * @author rizal
 */
public class KontrolGamee {
    public static void tentukanMenangKalahSeri(Pemain pemain1, Pemain pemain2) {
        int hasil = LogicSuit.tentukanPemenangSuit(pemain1, pemain2);
        String hasilRonde;
        
        if(hasil == 1) {
            LogicSuit.hitungDamage(pemain1, pemain2);
        } else if(hasil == 2) {
            LogicSuit.hitungDamage(pemain2, pemain1);
        } else {
            hasilRonde = "Seri!!!";
        }
    }
    
//    public static void cekGameSelesaiAtauLanjut(Pemain pemain1, Pemain pemain2) {
//        if(pemain1.getHp() > 0 && pemain2.getHp() > 0)
//    }
    public static void randomPilihan(Pemain sesiPemain) {
        String[] pilihanSuit = {"gunting", "batu", "kertas"};
        
        Random random = new Random();
        
        int randomIndex = random.nextInt(pilihanSuit.length);
        String randomPilihanSuit = pilihanSuit[randomIndex];
        
        sesiPemain.setPilihan(randomPilihanSuit);
    }
    
    public static void randomElemen(Pemain sesiPemain) {
        String[] pilihanElemen = {"api", "air", "angin", "tanah"};
        
        Random random = new Random();
        
        int randomIndex = random.nextInt(pilihanElemen.length);
        String randomPilihanElemen = pilihanElemen[randomIndex];
        
        sesiPemain.setElemen(randomPilihanElemen);
    };
    
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saya;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Saya {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("mengkoversi suhu celcius ke fehrenheit");
        int o,c;
        System.out.println("masukanlah nilai celcius");
        o=input.nextInt();
        c=(o*9)/5+32;
        System.out.println("hasil konversi="+c+"derajat fahrenheit");
    
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saya2;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Saya2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner input=new Scanner(System.in);
System.out.println("menghitung luas lingkaran");
double o,Luas;
System.out.println("masukan jari jari:");
o= input.nextDouble();
Luas=0.5+3.14*o*o;
System.out.println ("luas lingkaran= (int)"+Luas);
    }
    
}


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Lingkaran {
     void rumuslingkaran(){
        Scanner in = new Scanner(System.in);
        //mendefinisikan atribut
        double phi=3.14;
        int jari;
        
        System.out.println("Masukkan jari jari : ");
        jari=in.nextInt();
        
     
        System.out.println("Luas Lingkaran : "+(phi*jari*jari));
     }
    
}

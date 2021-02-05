
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
public class Persegi {
    void rumuspersegi(){
        Scanner in = new Scanner(System.in);
        int sisi;
        
        System.out.println("Masukkan sisi : ");
        sisi=in.nextInt();
        
        System.out.println("Luas Persegi : "+(sisi*sisi));
    }
}

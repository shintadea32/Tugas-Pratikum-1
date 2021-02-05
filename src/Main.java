
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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
      System.out.println("1. Menghitung Luas Persegi : ");
      System.out.println("2. Menghitung Luas Lingkaran : ");
      System.out.println("Masukkan Pilihan : ");
      
      int pilihan = in.nextInt();
      
      switch (pilihan){
          case 1:
             Persegi rumus = new Persegi();
             rumus.rumuspersegi();
          break;
          case 2:
             Lingkaran Rumus = new Lingkaran();
             Rumus.rumuslingkaran();
          break;
      }
    }
    
}

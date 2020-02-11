/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KOPI;
import java.util.ArrayList;
import java.util.Scanner;
public class KopiMAIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

 Scanner SCAN = new Scanner(System.in);
        ArrayList<String> Kopi = new ArrayList<String>();
        ArrayList<String> Topping = new ArrayList<String>();
        ArrayList<String> Asal = new ArrayList<String>();
 
        Component Arabica = new  Component();
        Arabica.setJenisKopi("Arabica");
        Arabica.setAsalkopi("Timur Tengah");
        Kopi.add(Arabica.getJenisKopi());
        Asal.add(Arabica.getAsalkopi());
 
        Component Robusta = new Component();
        Robusta.setJenisKopi("Robusta");
        Robusta.setAsalkopi("Eropa");
        Kopi.add(Robusta.getJenisKopi());
        Asal.add(Robusta.getAsalkopi());
 
        Component Florest = new Component();
        Florest.setJenisKopi("Florest");
        Florest.setAsalkopi("Asia");
        Kopi.add(Florest.getJenisKopi());
        Asal.add(Florest.getAsalkopi());
 
        kopiTOPPING TOP = new kopiTOPPING();
        TOP.setTopping("Caramel");
        Topping.add(TOP.getTopping());
        TOP.setTopping("Cream");
        Topping.add(TOP.getTopping());
 
        try {
 
            System.out.println("==============Menu Kopi Today==============");
            for (int i = 0; i < Kopi.size(); i++) {
                int j = i + 1;
                System.out.println("[" + j + "] Kopi " + Kopi.get(i) + " Asal " + Asal.get(i));
            }
 
            System.out.print("Pilih Kopi : ");
            int pilihkopi = SCAN.nextInt() - 1;
            System.out.println("=============TOPPING================");
 
            for (int i = 0; i < Topping.size(); i++) {
                int j = i + 1;
                System.out.println("[" + j + "] Tambah Topping " + Topping.get(i));
            }
 
            System.out.print("Pilih Tambahan Topping : ");
            int pilihtopping = SCAN.nextInt() - 1;
            System.out.println("==============PESANAN ANDA===========");
 
            System.out.println("Pesanan anda adalah Kopi    : ");
            System.out.println(Kopi.get(pilihkopi));
            System.out.println("Berasal Dari                : ");
            System.out.println(Asal.get(pilihkopi));
            System.out.println("Dengan Tambahan Topping     : ");
            System.out.println(Topping.get(pilihtopping));
        } catch (Exception x) {
            System.out.println("Inputan anda tidak benar!");
            System.out.println(x + "\n");
        }
 
    }
}
 
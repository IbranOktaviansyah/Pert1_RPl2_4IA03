/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pert1_50422843;
import java.util.Scanner;
/**
 *
 * @author ibran
 */
public class Pert1_50422843 {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);   
        
        System.out.println("Masukan nilai anda: ");
        int nilai = input.nextInt();
        
        if (nilai >= 60) {
            System.out.println("Selamat, anda LULUS!");
        } else {
            System.out.println("Maaf, Anda TIDAK LULUS.");
        }
    }
}

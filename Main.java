/**
 *
 * @author Amdzak
 */

package com.main.programdiskonintermediet;

import java.util.Scanner;

public class ProgramDiskonIntermediet {
    public static void main(String[] args) {
        //PEMBUATAN OBJEK SCANNER 
        Scanner input = new Scanner(System.in);
        
        //TIPE DATA
        int belanja,diskon,total;
        char member;
        
        //INPUT USER
        System.out.println("=== Program Diskon Menengah ===");
        System.out.print("Apakah anda memiliki kartu member? (y/n) : ");
        member = input.next().charAt(0);
        System.out.print("Masukan total belanja anda : ");
        total = input.nextInt();
        
        //PERCABANGAN PENENTUAN MEMBER SERTA PENCARIAN DISKON
        if(member == 'y' || member == 'Y'){
            if (total >= 500000) {
                diskon = (total - 50000);
                System.out.println("\nSelamat anda mendapatkan potongan Rp 50.000\nTotal belanja anda sekarang Rp " + diskon);
            }else if (total >= 100000) {
                diskon = (total - 15000);
                System.out.println("\nSelamat anda mendapatkan potongan Rp 15.000\nTotal belanja anda sekarang Rp " + diskon);
            }else{
                diskon = (total - 1000);
                System.out.println("\nSelamat anda mendapatkan potongan Rp 1.000\nTotal belanja anda sekarang Rp " + diskon);
            }
        } else {
            if (total >= 500000) {
                diskon = (total - 5000);
                System.out.println("\nSelamat anda mendapatkan potongan Rp 5.000\nTotal belanja anda sekarang Rp " + diskon);
            } else {
                System.out.println("\nTotal belanja anda adalah Rp " + total);
            }
        }
    }
}

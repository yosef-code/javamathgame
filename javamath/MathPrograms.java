package mathgame1;

import java.util.Scanner;

public class MathPrograms {

    public int pilihan_menu, pilihan_menu_dua, last_level, last_score;
  
    
  

    public void Playthegame() {
        Scanner in = new Scanner(System.in);
        Scanner un = new Scanner(System.in);
        MathMainClass cplus = new MathMainClass();
        MathMainClass cmin = new MathSubClass();
        Scanner input = new Scanner(System.in);
        String nama;
        System.out.println ("Masukkan nama Anda : ");
        nama=input.nextLine();
        System.out.println("****************************");
        System.out.println("    Math Game Kelompok 8    ");
        System.out.println("****************************");
        System.out.println("Silakan pilih permainan anda");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Keluar");
        System.out.println("Pilih nomor menu :");
        pilihan_menu = in.nextInt();
        switch (pilihan_menu) {
            case 1:
                if (pilihan_menu == 1) {
                System.out.println("*****************************");
                System.out.println("   Math Game - Penjumlahan   ");
                System.out.println("*****************************");
               
                System.out.println("Masukkan Level Terakhir : ");
                last_level = in.nextInt();
                System.out.println("Masukkan Score Terakhir : ");
                last_score = in.nextInt();
                cplus.Playplus(last_score, last_level, nama);
                }
            case 2:
                if (pilihan_menu == 2 ) {
                System.out.println("*****************************");
                System.out.println("   Math Game - Pengurangan   ");
                System.out.println("*****************************");
 
                System.out.println("Masukkan Level Terakhir : ");
                last_level = in.nextInt();
                System.out.println("Masukkan Score Terakhir : ");
                last_score = in.nextInt();
                cmin.Playmin(last_score, last_level, nama);
                }
            case 3:
                if (pilihan_menu == 3){
                    System.out.println(" Anda telah keluar. Terima kasih "+nama);
                }
        }
    }
}
             

    

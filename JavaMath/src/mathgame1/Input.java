
package mathgame1;
import java.util.Scanner;
public class Input {
    public static void main (String[] args){
            Scanner input = new Scanner(System.in);
            MathMainClass mc = new MathMainClass();
            MathSubClass ms = new MathSubClass();
            System.out.println ("Masukkan nama Anda : ");
            String nama=input.nextLine();
            System.out.println(""
                    + "################ \n"
                    + "Math Game Kel 8 \n"
                    + "################ \n"
                    + "Masukkan Pilihan Anda : \n"
                    + "1. Penjumlahan \n"
                    + "2. Pengurangan \n"
                    + "3. Keluar \n");
            int userInput = input.nextInt();
            switch (userInput){
                case 1:
                    mc.Play(nama);
                    break;
                case 2:
                    ms.Playmin(nama);
                    break;
                default:
                    break;
            }
                        
            
    }
}


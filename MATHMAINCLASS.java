/*
developed by Moo.
 */
package mathgame;
import java.text.*;
import java.util.*;
//inheritance

public class MathMainClass extends MathData {
    protected String number_display1, number_display2;
    public void Play() {
//      Instansiasi
        MathNumberFormat mf1 = new MathNumberFormat();
        MathNumberFormat mf2 = new MathNumberFormat();
        MathMainClass data = new MathMainClass();
        MathMainClass ar1 = new MathMainClass();
        MathMainClass ar2 = new MathMainClass();
        Scanner in = new Scanner(System.in);
        Scanner un = new Scanner(System.in);
//        
//
        System.out.println("Masukkan nama kamu :");
        String username = un.next();
        data.setLevel(1);
        data.setNyawa(3);
        data.setSkor(0);
        int score = data.getSkor();
        int lives = data.getNyawa();
        int lvl = data.getLevel();
        int lvl2 = lvl + 1;
        int lvl3 = lvl2 + 1;
        while (true) {
            while (score >= 0 && score < 101) {
                if (lives > 0) {
                    ar1.setRandom(11);
                    ar2.setRandom(11);
                    int bilangan1 = ar1.getRandom();
                    int bilangan2 = ar2.getRandom();
                    mf1.NumberFormat(bilangan1);
                    mf2.NumberFormat(bilangan2);
                    number_display1 = mf1.getFormat();
                    number_display2 = mf2.getFormat();
                    
//                    User Interface
                    System.out.println("****************************");
                    System.out.println("     Math - Penjumlahan     ");
                    System.out.println("****************************");
                    System.out.println("Berapakah hasil dari " + number_display1 + " + " + number_display2 + " ?");
                    int angka = in.nextInt();
                    hasilPenjumlahan = bilangan1 + bilangan2;
                    if (angka == hasilPenjumlahan) {
                        score = score + 4;
                        System.out.println("[Hallo " + username + "][Score: " + score + "][Lives: " + lives + "][level: " + lvl + "]");
                        System.out.println("___________________________________");
                    } else {
                        score = score - 1;
                        lives = lives - 1;
                        System.out.println("[Hallo " + username + "][Score: " + score + "][Lives: " + lives + "][leve1"
                                + "l: " + lvl + "]");
                        System.out.println("___________________________________");
                    }
                } else {
                    System.out.println("[Maaf " + username + " kamu kehabisan nyawa, silakan mulai ulang game ini]");
                    break;
                }
            }
            if (score == -1) {
                System.out.println("[Maaf " + username + " skor kamu tidak valid]");
                break;
            }
            while (score > 100 && score < 201) {
                if (lives > 0) {
                    ar1.setRandom(11);
                    ar2.setRandom(11);
                    int bilangan1 = -1 * (1 + ar1.getRandom());
                    int bilangan2 = -1 * (1 + ar2.getRandom());
                    mf1.NumberFormat(bilangan1);
                    mf2.NumberFormat(bilangan2);
                    number_display1 = mf1.getFormat();
                    number_display2 = mf2.getFormat();
                    
//                    UserInterface
                    System.out.println("****************************");
                    System.out.println("     Math - Penjumlahan     ");
                    System.out.println("****************************");
                    System.out.println("Berapakah hasil dari " +number_display1+ " + " +number_display2+ " ?");
                    int angka = in.nextInt();
                    hasilPenjumlahan = bilangan1 + bilangan2;
                    if (angka == hasilPenjumlahan) {
                        score = score + 4;
                        System.out.println("[Hallo " + username + "][Score: " + score + "][Lives: " + lives + "][level: " + lvl2 + "]");
                        System.out.println("___________________________________");
                    } else {
                        score = score - 1;
                        lives = lives - 1;
                        System.out.println("[Hallo " + username + "][Score: " + score + "][Lives: " + lives + "][leve1"
                                + "l: " + lvl2 + "]");
                        System.out.println("___________________________________");
                    }
                } else {
                    System.out.println("[Maaf " + username + " kamu kehabisan nyawa, silakan mulai ulang game ini]");
                    break;
                }
            }
            while (score > 200 && score <= 300) {
                if (lives > 0) {
                    ar1.setRandom(20);
                    ar2.setRandom(20);
                    int bilangan1 = ar1.getRandom() - 10;
                    int bilangan2 = ar2.getRandom() - 10;
                    mf1.NumberFormat(bilangan1);
                    mf2.NumberFormat(bilangan2);
                    number_display1 = mf1.getFormat();
                    number_display2 = mf2.getFormat();
                    
//                    User Interface
                    System.out.println("****************************");
                    System.out.println("     Math - Penjumlahan     ");
                    System.out.println("****************************");
                    System.out.println("Berapakah hasil dari " + number_display1 + " + " + number_display2 + " ?");
                    int angka = in.nextInt();
                    hasilPenjumlahan = bilangan1 + bilangan2;
                    if (angka == hasilPenjumlahan) {
                        score = score + 4;
                        System.out.println("[Hallo " + username + "][Score: " + score + "][Lives: " + lives + "][level: " + lvl3 + "]");
                        System.out.println("___________________________________");
                    } else {
                        score = score - 1;
                        lives = lives - 1;
                        System.out.println("[Hallo " + username + "][Score: " + score + "][Lives: " + lives + "][leve1"
                                + "l: " + lvl3 + "]");
                        System.out.println("___________________________________");
                    }
                } else {
                    System.out.println("[Maaf " + username + " kamu kehabisan nyawa, silakan mulai ulang game ini]");
                    break;
                }
                if (score > 300) {
                    System.out.println("[Selamat " + username + ", Anda telah menyelesaikan soal penjumlahan dengan baik. Silakan dicoba soal pengurangan ya]");
                    break;
                }
            }
            break;
        }
    }
//    Overloading method

    public void Play(int s, int l) {
//        Instansiasi
        MathNumberFormat mf1 = new MathNumberFormat();
        MathNumberFormat mf2 = new MathNumberFormat();
        MathMainClass data = new MathMainClass();
        MathMainClass ar1 = new MathMainClass();
        MathMainClass ar2 = new MathMainClass();
        Scanner in = new Scanner(System.in);
        Scanner un = new Scanner(System.in);
//        
//
        System.out.println("Masukkan nama kamu :");
        String username = un.next();
        data.setLevel(l);
        data.setNyawa(3);
        data.setSkor(s);
        int score = data.getSkor();
        int lives = data.getNyawa();
        int lvl = data.getLevel();
        while (true) {
            while (score >= 0 && score < 101) {
                if (lives > 0) {
                    ar1.setRandom(11);
                    ar2.setRandom(11);
                    int bilangan1 = ar1.getRandom();
                    int bilangan2 = ar2.getRandom();
                    mf1.NumberFormat(bilangan1);
                    mf2.NumberFormat(bilangan2);
                    number_display1 = mf1.getFormat();
                    number_display2 = mf2.getFormat();
//                    User Interface
                    System.out.println("****************************");
                    System.out.println("     Math - Penjumlahan     ");
                    System.out.println("****************************");
                    System.out.println("Berapakah hasil dari " + number_display1 + " + " + number_display2 + " ?");
                    int angka = in.nextInt();
                    hasilPenjumlahan = bilangan1 + bilangan2;
                    if (angka == hasilPenjumlahan) {
                        score = score + 4;
                        System.out.println("[Hallo " + username + "][Score: " + score + "][Lives: " + lives + "][level: " + lvl + "]");
                        System.out.println("___________________________________");
                    } else {
                        score = score - 1;
                        lives = lives - 1;
                        System.out.println("[Hallo " + username + "][Score: " + score + "][Lives: " + lives + "][leve1"
                                + "l: " + lvl + "]");
                        System.out.println("___________________________________");
                    }
                } else {
                    System.out.println("[Maaf " + username + " kamu kehabisan nyawa, silakan mulai ulang game ini]");
                    break;
                }
            }
            if (score == -1) {
                System.out.println("[Maaf " + username + " skor kamu tidak valid]");
                break;
            }
            while (score > 100 && score < 201) {
                if (lives > 0) {
                    ar1.setRandom(11);
                    ar2.setRandom(11);
                    int bilangan1 = -1 * (1 + ar1.getRandom());
                    int bilangan2 = -1 * (1 + ar2.getRandom());
                    mf1.NumberFormat(bilangan1);
                    mf2.NumberFormat(bilangan2);
                    number_display1 = mf1.getFormat();
                    number_display2 = mf2.getFormat();
//                    
                    System.out.println("****************************");
                    System.out.println("     Math - Penjumlahan     ");
                    System.out.println("****************************");
                    System.out.println("Berapakah hasil dari " + number_display1 + " + " + number_display2 + " ?");
                    int angka = in.nextInt();
                    hasilPenjumlahan = bilangan1 + bilangan2;
                    if (angka == hasilPenjumlahan) {
                        score = score + 4;
                        System.out.println("[Hallo " + username + "][Score: " + score + "][Lives: " + lives + "][level: " + lvl + "]");
                        System.out.println("___________________________________");
                    } else {
                        score = score - 1;
                        lives = lives - 1;
                        System.out.println("[Hallo " + username + "][Score: " + score + "][Lives: " + lives + "][leve1"
                                + "l: " + lvl + "]");
                        System.out.println("___________________________________");
                    }
                } else {
                    System.out.println("[Maaf " + username + " kamu kehabisan nyawa, silakan mulai ulang game ini]");
                    break;
                }
            }
            while (score > 200 && score <= 300) {
                if (lives > 0) {
                    ar1.setRandom(20);
                    ar2.setRandom(20);
                    int bilangan1 = ar1.getRandom() - 10;
                    int bilangan2 = ar2.getRandom() - 10;
                    mf1.NumberFormat(bilangan1);
                    mf2.NumberFormat(bilangan2);
                    number_display1 = mf1.getFormat();
                    number_display2 = mf2.getFormat();
//                    
                    System.out.println("****************************");
                    System.out.println("     Math - Penjumlahan     ");
                    System.out.println("****************************");
                    System.out.println("Berapakah hasil dari " + number_display1 + " + " + number_display2 + " ?");
                    int angka = in.nextInt();
                    hasilPenjumlahan = bilangan1 + bilangan2;
                    if (angka == hasilPenjumlahan) {
                        score = score + 4;
                        System.out.println("[Hallo " + username + "][Score: " + score + "][Lives: " + lives + "][level: " + lvl + "]");
                        System.out.println("___________________________________");
                    } else {
                        score = score - 1;
                        lives = lives - 1;
                        System.out.println("[Hallo " + username + "][Score: " + score + "][Lives: " + lives + "][leve1"
                                + "l: " + lvl + "]");
                        System.out.println("___________________________________");
                    }
                } else {
                    System.out.println("[Maaf " + username + " kamu kehabisan nyawa, silakan mulai ulang game ini]");
                    break;
                }
                if (score > 300) {
                    System.out.println("[Selamat " + username + ", Anda telah menyelesaikan soal penjumlahan dengan baik. Silakan dicoba soal pengurangan ya]");
                    break;
                }
            }
            break;
        }
    }
}
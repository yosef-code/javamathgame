 //parent class
package mathgame1;

import java.util.*;

public class MathData {
//    attr
    private int bilRandom, skor, nyawa, level;
    public int hasilPenjumlahan, hasilPengurangan;
//   encapsulation

    public void setLevel(int lvl) {
        level = lvl;
    }

    public int getLevel() {
        return level;
    }

    public void setSkor(int sk) {
        skor = sk;
    }

    public int getSkor() {
        return skor;
    }

    public void setNyawa(int ny) {
        nyawa = ny;
    }

    public int getNyawa() {
        return nyawa;
    }

    public void setRandom(int range) {
        Random b1 = new Random();
        bilRandom = b1.nextInt(range);
    }

    public int getRandom() {
        return bilRandom;
    }
}
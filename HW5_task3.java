/*
На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.
И вывести Доску. Пример вывода доски 8x8
0x000000
0000x000
00x00000
*/

public class HW5_task3 {
    public static void main(String[] args) {

        int[] qs = new int[8];
        placeQueen(0, qs);

        for (int hor = 0; hor < 8; hor++) {
            for (int ver = 0; ver < 8; ver++) {
                if (qs[hor] == ver) {
                    System.out.print("*");
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
        
        static boolean placeQueen(int hor, int[] qs){
            if (hor == 8) { // Успешное завершение для всех 8 королев
                return true;
            }
            for (int ver = 0; ver < 8; ver++) {
                boolean noDanger = true;
                for (int i = 0; i < hor; i++) {
                    if (qs[i] == ver || qs[i] == ver - hor + i || qs[i] == ver + hor - i) {
                        noDanger = false;
                        break;
                    }
                }
                if (noDanger) {
                    qs[hor] = ver;
                    if (placeQueen(hor + 1, qs)) {
                        return true;
                    }
                }
            }
            return false;
        

    }
}
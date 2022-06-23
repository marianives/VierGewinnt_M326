/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viergewinnt.VierGewinnt;

/**
 *
 * @author M-N Kanti
 */
public class SpielbrettModel {

    public static final int COLUMNS = 7;
    public static final int ROWS = 6;
    private boolean gameOver = false;

    private int row = 0;

    private final String[][] PLAYBOARD = new String[COLUMNS][ROWS];

    public void createBoard() {
        for (int c = 0; c < 7; c++) {
            for (int r = 0; r < 6; r++) {
                PLAYBOARD[c][r] = "o";
            }
        }
    }

    public int checkRow(int colmn) {

        for (int i = 0; i < 6; i++) {
            if ((PLAYBOARD[colmn][i].equals("o"))) {
                row = i;
            }
            if (row == 7) {
                //
            }
        }
        return row;
    }

    public void zeigeBrett(int col, int row, String neuerZeichen) {

        String row1 = "";
        String row2 = "";
        String row3 = "";
        String row4 = "";
        String row5 = "";
        String row6 = "";

        PLAYBOARD[col][row] = neuerZeichen;

        for (int j = 0; j < 7; j++) {
            row1 += PLAYBOARD[j][0] + " ";
        }
        for (int j = 0; j < 7; j++) {
            row2 += PLAYBOARD[j][1] + " ";
        }
        for (int j = 0; j < 7; j++) {
            row3 += PLAYBOARD[j][2] + " ";
        }
        for (int j = 0; j < 7; j++) {
            row4 += PLAYBOARD[j][3] + " ";
        }
        for (int j = 0; j < 7; j++) {
            row5 += PLAYBOARD[j][4] + " ";
        }
        for (int j = 0; j < 7; j++) {
            row6 += PLAYBOARD[j][5] + " ";
        }

        System.out.println("0 1 2 3 4 5 6 ");
        System.out.println(row1);
        System.out.println(row2);
        System.out.println(row3);
        System.out.println(row4);
        System.out.println(row5);
        System.out.println(row6);

    }

    public boolean checkWin() {
        int x = 0;
        int p = 0;
        int xx = 0;
        int xp = 0;
        for (int l = 0; l < 7; l++) {
            for (int i = 0; i < 6; i++) {
                if (PLAYBOARD[l][i].equals("x")) {
                    x += 1;
                }
                if (PLAYBOARD[l][i].equals("-")) {
                    p += 1;
                }
            }
        }
        for (int l = 0; l < 6; l++) {
            for (int i = 0; i < 7; i++) {
                if (PLAYBOARD[i][l].equals("x")) {
                    xx += 1;
                }
                if (PLAYBOARD[i][l].equals("-")) {
                    xp += 1;
                }
            }
        }
        /* Vertikal
        for (int l = 0; l < 7; l++) {
            for (int i = 0; i < 6; i++) {
                if (playBoard[l][i].equals(playBoard[i + 1][l + 1])) {
                    xx += 1;
                }
                if (playBoard[l][i].equals(playBoard[i + 1][l + 1])) {
                    xp += 1;
                }
            }
        }
         */
        if (x == 4 || p == 4 || xx == 4 || xp == 4) {
            gameOver = true;
        }
        return gameOver;
    }
}

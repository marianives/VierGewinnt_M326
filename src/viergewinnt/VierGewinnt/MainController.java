/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viergewinnt.VierGewinnt;

import javax.swing.JOptionPane;

/**
 *
 * @author M-N Kanti
 */
public class MainController {

    private SpielerInterface player1 = new Spieler("x");
    private SpielerInterface player2 = null;
    private SpielModel spiel;

    public static void main(String[] args) {
        new MainController().spielen();
    }

    public void spielen() {
        spielerErstellen();
        spiel = new SpielModel(this.player1, this.player2);
        spiel.spielStarten();
    }

    private void spielerErstellen() {
        int gegner = getGegner();

        switch (gegner) {
            case 0:
                this.player2 = new Spieler("-");
                break;
            case 1:
                this.player2 = new Computer("-");
                break;
            default:
                System.exit(0);
        }
    }

    public int getGegner() {
        final Object[] options = {"A Friend(Enemy)", "Computer", "Abbrechen"};

        int x = JOptionPane.showOptionDialog(null, "Gegen wen möchten Sie spielen?",
                "Gegnerwahl",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        return x;
    }

}

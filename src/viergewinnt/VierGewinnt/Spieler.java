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
public class Spieler implements SpielerInterface {

    private String zeichen;

    public Spieler(String zeichen) {
        this.zeichen = zeichen;
    }

    @Override
    public String getZeichen() {
        return this.zeichen;
    }

    @Override
    public int legeChip() {
        final String[] wahlen = {"0", "1", "2", "3", "4", "5", "6"};
        final String wahl = (String) JOptionPane.showInputDialog(null,
                "Wo soll der Chip gesetzt werden?",
                "Spielzug",
                JOptionPane.QUESTION_MESSAGE,
                null,
                wahlen,
                wahlen[0]);
        return Integer.valueOf(wahl);
    }

}

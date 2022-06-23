package viergewinnt.VierGewinnt;

/**
 *
 * @author M-N Kanti
 */
public class SpielModel {

    private final SpielerInterface PLAYER1;
    private final SpielerInterface PLAYER2;
    private SpielbrettModel spielbrett = new SpielbrettModel();
    private boolean gameOver = false;
    private int zug = 0;

    public SpielModel(SpielerInterface player1, SpielerInterface player2) {
        this.PLAYER1 = player1;
        this.PLAYER2 = player2;
    }

    public void spielStarten() {
        spielbrett.createBoard();
        do {
            zug++;
            int spieler1 = PLAYER1.legeChip();
            spielbrett.zeigeBrett(spieler1, spielbrett.checkRow(spieler1), PLAYER1.getZeichen());

            int spieler2 = PLAYER2.legeChip();
            spielbrett.zeigeBrett(spieler2, spielbrett.checkRow(spieler2), PLAYER2.getZeichen());

            spielbrett.checkWin();

        } while (spielbrett.checkWin() == false && zug < 42);
        System.out.println("Spiel Fertig!!!");
    }
}

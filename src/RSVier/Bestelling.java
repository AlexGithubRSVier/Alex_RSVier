/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RSVier;

/**
 *
 * @author Alex
 */
public class Bestelling {
    private int  BestelNummer;
    private char BestelStatus;
    // A = bestelling aangemaakt L = bestelling geleverd B = bestelling betaald

    /**
     * @return BestelNummer
     */
    public int getBestelNummer() {
        return BestelNummer;
    }

    /**
     * @param BestelNummer to set
     */
    public void setBestelNummer(int BestelNummer) {
        this.BestelNummer = BestelNummer;
    }

    /**
     * @return BestelStatus
     */
    public char getBestelStatus() {
        return BestelStatus;
    }

    /**
     * @param BestelStatus to set
     */
    public void setBestelStatus(char BestelStatus) {
        this.BestelStatus = BestelStatus;
    }
}
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
public class Klant {
    private int    KlantNummer;
    private String Voornaam;
    private String Tussenvoegsel;
    private String Achternaam;
    private char   KlantStatus;
    // A=actief, N=niet actief, dus geen klant (meer)

    /**
     * @return KlantNummer
     */
    public int getKlantNummer() {
        return KlantNummer;
    }

    /**
     * @param KlantNummer to set
     */
    public void setKlantNummer(int KlantNummer) {
        this.KlantNummer = KlantNummer;
    }

    /**
     * @return Voornaam
     */
    public String getVoornaam() {
        return Voornaam;
    }

    /**
     * @param Voornaam to set
     */
    public void setVoornaam(String Voornaam) {
        this.Voornaam = Voornaam;
    }

    /**
     * @return Tussenvoegsel
     */
    public String getTussenvoegsel() {
        return Tussenvoegsel;
    }

    /**
     * @param Tussenvoegsel to set
     */
    public void setTussenvoegsel(String Tussenvoegsel) {
        this.Tussenvoegsel = Tussenvoegsel;
    }

    /**
     * @return Achternaam
     */
    public String getAchternaam() {
        return Achternaam;
    }

    /**
     * @param Achternaam to set
     */
    public void setAchternaam(String Achternaam) {
        this.Achternaam = Achternaam;
    }

    /**
     * @return KlantStatus
     */
    public char getKlantStatus() {
        return KlantStatus;
    }

    /**
     * @param KlantStatus to set
     */
    public void setKlantStatus(char KlantStatus) {
        this.KlantStatus = KlantStatus;
    }
}
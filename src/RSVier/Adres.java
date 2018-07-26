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
public class Adres {
    private int    KlantNummer;
    private String Straatnaam;
    private short  Huisnummer;
    private String HuisnummerToevoeging;
    private String Postcode;
    private String Woonplaats;
    private char   AdresSoort;
    // B = bezorgadres F = factuuradres P = postadres

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
     * @return Straatnaam
     */
    public String getStraatnaam() {
        return Straatnaam;
    }

    /**
     * @param Straatnaam to set
     */
    public void setStraatnaam(String Straatnaam) {
        this.Straatnaam = Straatnaam;
    }

    /**
     * @return Huisnummer
     */
    public short getHuisnummer() {
        return Huisnummer;
    }

    /**
     * @param Huisnummer to set
     */
    public void setHuisnummer(short Huisnummer) {
        this.Huisnummer = Huisnummer;
    }

    /**
     * @return HuisnummerToevoeging
     */
    public String getHuisnummerToevoeging() {
        return HuisnummerToevoeging;
    }

    /**
     * @param HuisnummerToevoeging to set
     */
    public void setHuisnummerToevoeging(String HuisnummerToevoeging) {
        this.HuisnummerToevoeging = HuisnummerToevoeging;
    }

    /**
     * @return Postcode
     */
    public String getPostcode() {
        return Postcode;
    }

    /**
     * @param Postcode to set
     */
    public void setPostcode(String Postcode) {
        this.Postcode = Postcode;
    }

    /**
     * @return Woonplaats
     */
    public String getWoonplaats() {
        return Woonplaats;
    }

    /**
     * @param Woonplaats to set
     */
    public void setWoonplaats(String Woonplaats) {
        this.Woonplaats = Woonplaats;
    }

    /**
     * @return AdresSoort
     */
    public char getAdresSoort() {
        return AdresSoort;
    }

    /**
     * @param AdresSoort to set
     */
    public void setAdresSoort(char AdresSoort) {
        this.AdresSoort = AdresSoort;
    }
}
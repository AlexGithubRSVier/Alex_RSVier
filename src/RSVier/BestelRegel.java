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
import java.math.*;

public class BestelRegel {
    private int        BestelNummer;
    private int        KaasNummer;
    private short      BestelAantal;
    private BigDecimal BestelPrijs;

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
     * @return KaasNummer
     */
    public int getKaasNummer() {
        return KaasNummer;
    }

    /**
     * @param KaasNummer to set
     */
    public void setKaasNummer(int KaasNummer) {
        this.KaasNummer = KaasNummer;
    }

    /**
     * @return BestelAantal
     */
    public short getBestelAantal() {
        return BestelAantal;
    }

    /**
     * @param BestelAantal to set
     */
    public void setBestelAantal(short BestelAantal) {
        this.BestelAantal = BestelAantal;
    }

    /**
     * @return BestelPrijs
     */
    public BigDecimal getBestelPrijs() {
        return BestelPrijs;
    }

    /**
     * @param BestelPrijs to set
     */
    public void setBestelPrijs(BigDecimal BestelPrijs) {
        this.BestelPrijs = BestelPrijs;
    }
}
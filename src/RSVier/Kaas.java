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

public class Kaas {
   private int        KaasNummer;
   private String     KaasNaam;
   private BigDecimal KaasPrijs;
   private int        KaasVoorraad;

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
     * @return KaasNaam
     */
    public String getKaasNaam() {
        return KaasNaam;
    }

    /**
     * @param KaasNaam to set
     */
    public void setKaasNaam(String KaasNaam) {
        this.KaasNaam = KaasNaam;
    }

    /**
     * @return KaasPrijs
     */
    public BigDecimal getKaasPrijs() {
        return KaasPrijs;
    }

    /**
     * @param KaasPrijs to set
     */
    public void setKaasPrijs(BigDecimal KaasPrijs) {
        this.KaasPrijs = KaasPrijs;
    }

    /**
     * @return KaasVoorraad
     */
    public int getKaasVoorraad() {
        return KaasVoorraad;
    }

    /**
     * @param KaasVoorraad to set
     */
    public void setKaasVoorraad(int KaasVoorraad) {
        this.KaasVoorraad = KaasVoorraad;
    }
}
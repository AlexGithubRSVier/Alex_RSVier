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
public class Account {

    private String Gebruikersnaam;
    private String Wachtwoord;
    private char   AccountSoort;
    // A = admin M = medewerker K = klant
    
    
    /**
     * @return Gebruikersnaam
     */
    public String getGebruikersnaam() {
        return Gebruikersnaam;
    }

    /**
     * @param Gebruikersnaam to set
     */
    public void setGebruikersnaam(String Gebruikersnaam) {
        this.Gebruikersnaam = Gebruikersnaam;
    }

    /**
     * @return Wachtwoord
     */
    public String getWachtwoord() {
        return Wachtwoord;
    }

    /**
     * @param Wachtwoord to set
     */
    public void setWachtwoord(String Wachtwoord) {
        this.Wachtwoord = Wachtwoord;
    }

    /**
     * @return AccountSoort
     */
    public char getAccountSoort() {
        return AccountSoort;
    }

    /**
     * @param AccountSoort to set
     */
    public void setAccountSoort(char AccountSoort) {
        this.AccountSoort = AccountSoort;
    }
}
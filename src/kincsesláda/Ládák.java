/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kincsesláda;

/**
 *
 * @author hallgato
 */
public class Ládák {

    private final String nev;
    private final String mondas;
    private final boolean igaz;
    private final boolean ebben;

    Ládák(String nev, String mondas, boolean ebben, boolean igaz) {
        this.nev = nev;
        this.mondas = mondas;
        this.ebben = ebben;
        this.igaz = igaz;
    }

    public boolean isEbben() {
        return ebben;
    }

    public boolean isIgaz() {
        return igaz;
    }

    public String getNev() {
        return nev;
    }

    public String getMondas() {
        return mondas;
    }

    @Override
    public String toString() {
        return this.getNev()+"\n"+this.mondas+"\n";
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Che
 */
public class Distrito {
     String codigoE, provincia, canton;

    public Distrito(String codigoE, String provincia, String canton) {
        this.codigoE = codigoE;
        this.provincia = provincia;
        this.canton = canton;
    }

    public String getCodigoE() {
        return codigoE;
    }

    public void setCodigoE(String codigoE) {
        this.codigoE = codigoE;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }
    
    @Override
    public String toString() {
        return "Distrito{" + "codigoE=" + codigoE+ ", provincia=" + provincia + ", canton=" + canton+ '}';
    }
    
}

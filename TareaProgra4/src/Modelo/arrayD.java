/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Che
 */
public class arrayD {
    private ArrayList<Distrito> Array = new ArrayList<>();
    private static arrayD instancia = new arrayD();

    private arrayD() {

    }

    public static arrayD getInstance() {
        return instancia;
    }
    
      public String recorreDiez() {
        String texto = "";

        for (int i = 0; i < 120; i++) {
            if (Array.get(i) != null) {
                texto += Array.get(i) + "\n";
            }
        }

        return texto;
    }
      
       public Distrito buscarP(String numero) throws Exception {
        for (Distrito dist : Array) {
            if(dist != null && numero.equalsIgnoreCase(dist.getCodigoE())) {
                return dist;
            }
        }
        throw new Exception("No existe ");
    }

    public synchronized void agregar(Distrito e) {
        if (Array != null) {
            Array.add(e);
        }

    }
}

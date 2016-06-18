/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Hilo.hilos;
import Hilo.lock;
import archivos.Escritor;
import archivos.LeerDistricto;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Che
 */
public class ContraladorH {
   private hilos hilo1;
    private hilos hilo2;
    private hilos hilo3;
    private hilos hilo4;
    
    private int contador = 0;
    private lock lock;
    
   private LeerDistricto leerD;
   private Escritor escritor;
    
    public ContraladorH(lock lock, LeerDistricto leerDistr, Escritor escritor) {
        this.lock = lock;
        this.leerD = leerD;
       
        this.escritor = escritor;
    }

    public void iniciarHilos(File file) {
       
       
            
            
        try {
   
              
        } catch (InterruptedException ex) {
            
        }
    }

   
    
    public void leerD(File file) throws IOException{
        leerD.open(file);
        leerD.read();
        leerD.close();
    }
    
    public void crearAr(String filePath) throws FileNotFoundException  {
       
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hilo;
import archivos.LeerDistricto;
import controlador.ContraladorH;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Che
 */
public class hilos {
     private final lock Lock;
    private final int id;
    private LeerDistricto leer;
    private File path;
    private ContraladorH controlador;

    public hilos(lock lock, int id, LeerDistricto leer, File path, ContraladorH controlador,String nombre) {
         super(nombre);
        this.Lock = lock;
        this.id = id;
        this.leer = leer;
        this.path = path;
        this.controlador = controlador;
    }
    
    public void run() {
        
        try {
            LeerDistricto.open(path);
           LeerDistricto.read( Lock);
           LeerDistricto.close();
           
           
        } catch (FileNotFoundException ex) {
           
            Logger.getLogger(hilos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            
            Logger.getLogger(hilos.class.getName()).log(Level.SEVERE, null, ex);
       
        } catch (Exception ex) {
          Logger.getLogger(hilos.class.getName()).log(Level.SEVERE, null, ex);
           
        }
    }
    
    
}

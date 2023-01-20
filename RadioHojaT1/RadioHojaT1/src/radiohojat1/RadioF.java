/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package radiohojat1;

/**
 *
 * @author Alexis Mesias
 */
import java.util.ArrayList;

public class RadioF implements iRadio{
    
    private boolean encendido;
    private boolean frecuencia;
    private double am;
    private double fm;
    private double emisora;
    private ArrayList<Double> estaciones;
    
    
    
    public RadioF() {
        this.encendido = false;
        this.frecuencia = false;
        this.am = 530;
        this.fm = 87.9;
        this.estaciones = new ArrayList<Double>();
        
    }

    public boolean power() {
        if (encendido == false){
            encendido = true;
            System.out.println("true");
        }else{
            encendido = false;
            System.out.println("false");
        }
        return encendido;
    }


    public boolean frecuencia() {
        if (frecuencia == false){
            frecuencia = true;
        }else{
            frecuencia = false;
        }
        return frecuencia;
    }


    public void cambiarEmisora(boolean subirBajar) {
        if (subirBajar == true){
            if(frecuencia == true){
                if(this.fm >= 107.9){
                    this.fm = 87.9;
                }
                else {
                    this.fm += 0.2;
                }
                this.emisora = this.fm;
            }
            if (frecuencia == false){
                if(this.am >= 1610){
                    this.am = 530;
                }
                else {
                    this.am += 10;
                }
                this.emisora = this.am;
            }
        }
        if (subirBajar == false){
            if(frecuencia == true){
                if(this.fm >= 107.9){
                    this.fm = 87.9;
                }
                else {
                    this.fm -= 0.2;
                }
                this.emisora = this.fm;
            }
            if (frecuencia == false){
                if(this.am >= 1610){
                    this.am = 530;
                }
                else {
                    this.am -= 10;
                }
                this.emisora = this.am;
            }
        }
    }


    public double emisoraActual() {
        if (frecuencia == true){
            return this.fm;
        }else {
            return this.am;
        }
        
    }

    @Override
    public void guardarEmisora(double emisora) {
        this.estaciones.add(emisora);
    }

    @Override
    public void cargarEmisoraGuardada(int posicion) {
        if(frecuencia == true){
            this.fm = this.estaciones.get(posicion);
        }
        if (frecuencia == false){
            this.am = this.estaciones.get(posicion);
        }
    }
    
    
}

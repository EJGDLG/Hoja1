/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package radiohojat1;

/**
 *
 * @author Alexis Mesias
 */
public interface iRadio{
    

    //Tiene que iniciar apagada y funciona para cambiar la radio de encendida a apagada
    public boolean power();

    //Treue es Fm y false AM, cuando se llama a la funcion esta cambia entre true o false
    public boolean frecuencia();

    //True es para arriba y false es para abajo.
    public void cambiarEmisora(boolean subirBajar);

    //obtener la emisora actual
    public double emisoraActual();

    //guardar la emisora en un ArrayList es el cual solo guarda al final de la lista la emisora
    public void guardarEmisora(double emisora);

    //Se le manda la posicion en la que se encuentra la emisora seleccionada
    public void cargarEmisoraGuardada(int posicion);
}
